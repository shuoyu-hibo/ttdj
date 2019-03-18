package com.service.login;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.mybatis.dao.ttdj.UserInfoMapper;
import com.mybatis.entity.ttdj.UserInfo;
import com.mybatis.entity.ttdj.UserInfoExample;
import com.service.BaseService;


public class LoginServiceImpl extends BaseService{

	Logger log = this.getLog(this.getClass());//加载log方法

	/**
	 * 根据用户名密码查询用户信息
	 * @param userName
	 * @param password
	 * @return
	 */
	public List<UserInfo> getDataByUserinfo(String userName,String password){
		
		UserInfoExample userExmp = new UserInfoExample();
		userExmp.or().andUserNameEqualTo(userName).andPasswordEqualTo(password);
		List<UserInfo> list = null;
		SqlSession sqlSession = null;
		try {
			sqlSession = this.getSqlSessionTemplate().getSqlSessionFactory().openSession();
			UserInfoMapper userinfoMapper = sqlSession.getMapper(UserInfoMapper.class);
			list = userinfoMapper.selectByExample(userExmp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return  list;
	}
	
	/**
	 * 根据用户名查询用户信息
	 * @param userName
	 * @param password
	 * @return
	 */
	public List<UserInfo> getDataByUserinfo(String userName){
		
		UserInfoExample userExmp = new UserInfoExample();
		userExmp.or().andUserNameEqualTo(userName);
		SqlSession sqlSession = null;
		List<UserInfo> list = null;
		try {
			sqlSession = this.getSqlSessionTemplate().getSqlSessionFactory().openSession();
			UserInfoMapper userinfoMapper = sqlSession.getMapper(UserInfoMapper.class);
			list = userinfoMapper.selectByExample(userExmp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return  list;
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


