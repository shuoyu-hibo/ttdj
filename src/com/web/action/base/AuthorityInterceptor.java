package com.web.action.base;

import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.web.action.login.LoginAction;
import com.web.action.register.RegisterAction;
import com.web.action.search.SearchAction;

@SuppressWarnings("serial")
public class AuthorityInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		ActionContext ctx = invocation.getInvocationContext();
		
		/*拦截器内容 start code by wanghaibo 20150515*/
		Map session = ctx.getSession();
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		String userName = (String) session.get("userName");
		// 对LoginAction不做该项拦截
        Object action = invocation.getAction();
        if (action instanceof LoginAction || action instanceof RegisterAction || action instanceof SearchAction) {
            return invocation.invoke();
        } else {
        	System.out.println("exit check login, because this is not login/register/search action.");
			if(userName==null){
//				response.sendRedirect("html/register/login.html");
				String requestType = request.getHeader("X-Requested-With");
		        if (requestType != null && requestType.equals("XMLHttpRequest")) {//是ajax请求
		        	JsonUtil jsUtil = new JsonUtil();
		    		JSONArray jsAry=new JSONArray();
		    		jsUtil.returnJson(response, "999","用户未登录!", jsAry);
                    return null;
		        } else {//不是ajax请求
		        	return "unlogin";
		        }
			}
        }
        /*拦截器内容 end*/
        
		return invocation.invoke();
	}

}