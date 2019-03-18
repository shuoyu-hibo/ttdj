package com.web.action.register;

import java.util.Date;

import net.sf.json.JSONArray;

import com.mail.MailSenderInfo;
import com.mybatis.entity.ttdj.UserInfo;
import com.service.register.RegisterServiceImpl;
import com.web.action.base.BaseAction;
import com.web.action.base.JsonUtil;

/**
 * 注册action
 * @author wanghaibo
 * @describe 注册action  不要轻易再添加方法.拦截器会放过RegisterAction
 */
public class RegisterAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 验证注册时,用户名是否已经存在
	 */
	 public void checkUserName() throws Exception {
		 	
			String userName = commonUtil.decodeUrl(request.getParameter("userName"));
			RegisterServiceImpl registerServiceImpl = ((RegisterServiceImpl) getApplicationContext().getBean("registerServiceImpl"));
			int count = registerServiceImpl.selectCountByUserName(userName);
//			JSONObject jsonObj=new JSONObject();
//			ArrayList aList = new ArrayList();
			JsonUtil jsUtil = new JsonUtil();
			JSONArray jsAry=new JSONArray();
			if(count>=1){
				jsUtil.returnJson(response, "1","用户名已存在!", jsAry);//存在相同的用户名
			}else{
				jsUtil.returnJson(response, "0","用户名可用!", jsAry);//不存在相同的用户名
			}
		}

	 /**
	  * 保存用户注册信息
	  * @throws Exception
	  */
	public void saveUserRegisterInfo() throws Exception {
		 String email = commonUtil.decodeUrl(request.getParameter("email"));
		 String phoneNumber = commonUtil.decodeUrl(request.getParameter("phoneNumber"));
		 String userName = commonUtil.decodeUrl(request.getParameter("userName"));
		 String password = commonUtil.decodeUrl(request.getParameter("password"));
		 String checkNumber = commonUtil.decodeUrl(request.getParameter("checkNumber"));
//		 String province = commonUtil.decodeUrl(request.getParameter("province"));
//		 String city = commonUtil.decodeUrl(request.getParameter("city"));
		 String strSysRand = (String) request.getSession().getAttribute("ttdjrand");
		 JsonUtil jsUtil = new JsonUtil();
		 JSONArray jsAry=new JSONArray();
		 RegisterServiceImpl registerServiceImpl = null;
		 String msg = "";
		 boolean flag=false;
		 if(!checkNumber.equals(strSysRand)){//验证码不一致
//			 jsUtil.returnJson(response, "1","验证码不正确!", jsAry);//验证失败
			 msg="验证码不正确!";
		 }else{//验证码正确
			 registerServiceImpl = ((RegisterServiceImpl) getApplicationContext().getBean("registerServiceImpl"));
			 UserInfo userinfo = new UserInfo();
			 userinfo.setEmail(email);
			 userinfo.setUserName(userName);
			 userinfo.setPassword(password);
//			 userinfo.setCityName(city);
//			 userinfo.setProvinceName(province);
	//		 SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-DD hh:mm:ss");
			 if(!"".equals(email)){//如果是邮箱注册
				 int count = registerServiceImpl.selectCountByUserName(email);
				 if(count>=1){
					 msg = "用户名已存在!";//
				 } else {
					 StringBuffer strBfBase = request.getRequestURL();
					 String strBase = strBfBase.toString();
					 strBase = strBase.split("!")[0];
					 userinfo.setRegisterDate(new Date());
					 String activeUrl = registerServiceImpl.createCheckUrl(userinfo,strBase);
					 MailSenderInfo mailSenderInfo = new MailSenderInfo();
					 mailSenderInfo.setSubject("天天代金注册激活");
					 String textContent = "<html><head></head><body>";
					 textContent+="用户您好,感谢您注册天天代金网会员。请点击【激活天天代金账户】来激活您的账户:  ";
					 textContent+="<a href=\""+activeUrl+" \" >激活天天代金账户,并转至登陆页面！";
					 textContent+="</a>";
					 textContent+="</body></html>";
					 mailSenderInfo.setContent(textContent);
					 boolean sendFlag = registerServiceImpl.sendMailForActive(userinfo, mailSenderInfo);
					 if(!sendFlag){
//						 jsUtil.returnJson(response, "1","邮件发送失败,请检查您的邮箱地址!", jsAry);//保存失败
						 msg = "邮件发送失败,请检查您的邮箱地址!";//
					 }
					 flag = registerServiceImpl.saveData(userinfo);
				 }
			 }
			 
		 }
		 if(flag==true){//注册成功发送邮箱激活链接
			 
			 jsUtil.returnJson(response, "0","注册成功!", jsAry);//保存成功
		 }else
			 jsUtil.returnJson(response, "1",msg, jsAry);//保存失败
	 }
	
	 /**
	  * 用户激活
	  * @throws Exception
	  */
	public void activationUser() throws Exception {
		String userName = commonUtil.decodeUrl(request.getParameter("userName"));
		String activeNum = commonUtil.decodeUrl(request.getParameter("sa"));
		UserInfo userinfo = null;
		RegisterServiceImpl registerServiceImpl = null;
		registerServiceImpl = ((RegisterServiceImpl) getApplicationContext().getBean("registerServiceImpl"));
		userinfo = registerServiceImpl.selectUserByUserNameAndActiveNum(userName, activeNum);
		if(userinfo==null){//未查询到数据.验证码或者用户名不正确
			getLog(this.getClass()).info(this.getClass().getName()+"method:activationUser=======================msg: 未查询到数据.验证码或者用户名不正确 "+new Date());
		}else{//注册激活验证通过
			userinfo.setActivation("0");//激活状态
			userinfo.setRegisterDate(new Date());
			boolean uptFlag = registerServiceImpl.updateUserInfo(userinfo);
			if(!uptFlag){//更新失败
				getLog(this.getClass()).error(this.getClass().getName()+"method:activationUser=======================error: 更新用户信息失败   "+new Date());
			}
		}
		response.sendRedirect("html/register/login.html");
	}
}
