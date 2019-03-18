package com.web.action.homepage;

import com.mybatis.base.BaseHandle;
import com.service.homepage.HomePageServiceImpl;
import com.web.action.base.BaseAction;

public class HomePageAction extends BaseAction {

	/**
	 * 首页
	 */
	private static final long serialVersionUID = 1L;

		public String publish() throws Exception {
			return "publish";
		}
		public String intro() throws Exception {
			return "intro";
		}
		public String select() throws Exception {
			String uidstr = request.getParameter("uidstr");
			String atstr = request.getParameter("atstr");
			request.setAttribute("uidstr", uidstr);
			request.setAttribute("atstr", atstr);
			return "select";
		}

		public void test() throws Exception{
			((HomePageServiceImpl) getApplicationContext().getBean("homePageServiceImpl")).Test();
		}
		
		public String onload() throws Exception{
			return "load";
		}
		public String gotoForum() throws Exception{
			return "forum";
		}
}
