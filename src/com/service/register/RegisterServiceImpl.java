package com.service.register;

import java.awt.Graphics;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.aspectj.org.eclipse.jdt.core.dom.ThisExpression;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import com.mail.MailSenderInfo;
import com.mybatis.dao.ttdj.UserInfoMapper;
import com.mybatis.entity.ttdj.UserInfo;
import com.mybatis.entity.ttdj.UserInfoExample;
import com.service.BaseService;
import common.CommonConst;


public class RegisterServiceImpl extends BaseService{

	Logger log = this.getLog(this.getClass());//加载log方法

	/**
	 * 根据用户名查询是否存在
	 * @param userName
	 * @return
	 */
	public int selectCountByUserName(String userName){
		
		List<UserInfo> list = null;
		SqlSession sqlSession = null;
		try {
			UserInfoExample userExmp = new UserInfoExample();
			userExmp.or().andUserNameEqualTo(userName);
			sqlSession = this.getSqlSessionTemplate().getSqlSessionFactory().openSession();
			UserInfoMapper userinfoMapper = sqlSession.getMapper(UserInfoMapper.class);
			list = userinfoMapper.selectByExample(userExmp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.error(this.getClass().getName()+"=======================error: "+e.getMessage());
			e.printStackTrace();
			return 1;//失败
		} finally {
			sqlSession.close();
		}
		return list.size();
	}
	
	/**
	 * 根据用户名和注册激活码查询用户信息
	 * @param userName
	 * @return
	 */
	public UserInfo selectUserByUserNameAndActiveNum(String userName,String activeNum){
		
		List<UserInfo> list = null;
		SqlSession sqlSession = null;
		try {
			UserInfoExample userExmp = new UserInfoExample();
			userExmp.or().andUserNameEqualTo(userName).andRemarkEqualTo(activeNum);
			sqlSession = this.getSqlSessionTemplate().getSqlSessionFactory().openSession();
			UserInfoMapper userinfoMapper = sqlSession.getMapper(UserInfoMapper.class);
			list = userinfoMapper.selectByExample(userExmp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.error(this.getClass().getName()+"=======================error: "+e.getMessage());
			e.printStackTrace();
			return null;//失败
		} finally {
			sqlSession.close();
		}
		return list.get(0);
	}
	
	/**
	 * 保存用户信息
	 * @param userinfo
	 * @return
	 */
	public boolean saveData(UserInfo userinfo){
		SqlSession sqlSession = null;
		try {
			sqlSession = this.getSqlSessionTemplate().getSqlSessionFactory().openSession();
			UserInfoMapper userinfoMapper = sqlSession.getMapper(UserInfoMapper.class);
			userinfoMapper.insert(userinfo);
			sqlSession.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.error(this.getClass().getName()+"=======================error: "+e.getMessage());
			e.printStackTrace();
			return false;
		} finally {
			sqlSession.close();
		}
		return true;
	}
	
	/**
	 * 生成激活URL及返回URL 同时把验证串setRemark
	 * @param userinfo
	 * @return
	 */
	public String createCheckUrl(UserInfo userinfo,String strBaseUrl){
		Random random = new Random();
		String sRand = "";
		for (int j = 0; j < 6; j++) {
			String rand = String.valueOf(random.nextInt(10));
			sRand += rand;
		}
		userinfo.setRemark(sRand);
		strBaseUrl = strBaseUrl.concat("!");
		strBaseUrl = strBaseUrl.concat("activationUser.do?");
		strBaseUrl = strBaseUrl.concat("userName="+userinfo.getUserName());
		strBaseUrl = strBaseUrl.concat("&sa="+sRand);
		return strBaseUrl;
	}
	
	/**
	 * 发送激活链接
	 * @param userinfo
	 * @return
	 */
	public boolean sendMailForActive(UserInfo userinfo,MailSenderInfo mailSenderInfo){
		JavaMailSenderImpl senderImpl = new JavaMailSenderImpl();  
		senderImpl.setHost(CommonConst.MAIL_SERVER_HOST);  
        senderImpl.setUsername(CommonConst.USERNAME);  
        senderImpl.setPassword(CommonConst.PASSWORD);  
        // 建立HTML邮件消息  
        MimeMessage mailMessage = senderImpl.createMimeMessage();  
        // true表示开始附件模式  
        MimeMessageHelper messageHelper;
		try {
			messageHelper = new MimeMessageHelper(mailMessage, true, "utf-8");
			// 设置收件人，寄件人  
	        messageHelper.setTo(userinfo.getEmail());  
	        messageHelper.setFrom(CommonConst.USERNAME);  
	        messageHelper.setSubject(mailSenderInfo.getSubject());  
	        // true 表示启动HTML格式的邮件  
	        messageHelper.setText(mailSenderInfo.getContent(), true);  
	     // 发送邮件  
	        senderImpl.send(mailMessage);  
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			getLog(this.getClass()).error("用户：["+ userinfo.getUserName() +"]注册邮件发送失败！ msg:"+e.getMessage());
			return false;
		}  
        
		log.info("用户：["+ userinfo.getUserName() +"]注册邮件发送成功！");
        return true;
	}
	
	/**
	 * 更新用户信息
	 * @param userinfo
	 * @return
	 */
	public boolean updateUserInfo(UserInfo userinfo){
		SqlSession sqlSession = null;
		try {
			sqlSession = this.getSqlSessionTemplate().getSqlSessionFactory().openSession();
			UserInfoMapper userinfoMapper = sqlSession.getMapper(UserInfoMapper.class);
			userinfoMapper.updateByPrimaryKeySelective(userinfo);
			sqlSession.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.error(this.getClass().getName()+"=======================error: "+e.getMessage());
			e.printStackTrace();
			return false;
		} finally {
			sqlSession.close();
		}
		return true;
		
	}
}
