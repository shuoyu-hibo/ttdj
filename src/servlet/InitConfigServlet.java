package servlet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bz.log.LogWriterInfo;
import com.bz.util.PathUtil;
import common.CommonConst;

public class InitConfigServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public InitConfigServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out
				.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out
				.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the POST method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
		CommonConst.ROOT_PATH=new PathUtil().getWebInfPath();
		Properties propDB = new Properties();
		InputStream objFI = null;
		
		
		try {
			objFI = new FileInputStream(CommonConst.ROOT_PATH+CommonConst.CONFIG_FILE_PATH);
			propDB.load(objFI);
			objFI.close();
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(objFI != null){
				try {
					objFI.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
//		CommonConst.CLIENT_APPKEY = propDB.getProperty("weibo.client.id") == null ? "" : propDB.getProperty("weibo.client.id");
//		CommonConst.CLIENT_APPSECRET = propDB.getProperty("weibo.client.secret") == null ? "" : propDB.getProperty("weibo.client.secret");
//		CommonConst.GUANFANG_WEIBOID = propDB.getProperty("weibo.guanfang.weiboid") == null ? "" : propDB.getProperty("weibo.guanfang.weiboid");
//		CommonConst.SINAAPP_INDEX_URL = propDB.getProperty("weibo.index.url") == null ? "" : propDB.getProperty("weibo.index.url");
//		CommonConst.COMMENT_UTIL_ACCESSTOKEN = propDB.getProperty("weibo.accesstoken") == null ? "" : propDB.getProperty("weibo.accesstoken");
//		CommonConst.COMMENT_ACCESSTOKEN_EXPIRE = propDB.getProperty("weibo.accesstoken.expire") == null ? "" : propDB.getProperty("weibo.accesstoken.expire");
//		CommonConst.COMMENT_WEIBO_CONTENT = propDB.getProperty("weibo.post.content") == null ? "" : propDB.getProperty("weibo.post.content");
//		
//		CommonConst.DB_URL = propDB.getProperty("db.url") == null ? "" : propDB.getProperty("db.url");
//		CommonConst.DB_USER = propDB.getProperty("db.user_name") == null ? "" : propDB.getProperty("db.user_name");
//		CommonConst.DB_PWD = propDB.getProperty("db.password") == null ? "" : propDB.getProperty("db.password");
//		CommonConst.DB_DRIVER_CLASSNAME = propDB.getProperty("db.driver") == null ? "" : propDB.getProperty("db.driver");
//		
//		CommonConst.TIMER_INIT_DELAY = propDB.getProperty("timer.init.delay") == null ? "" : propDB.getProperty("timer.init.delay");
//		CommonConst.TIMER_RUN_DELAY = propDB.getProperty("timer.run.delay") == null ? "" : propDB.getProperty("timer.run.delay");
//		CommonConst.TIMER_FORMAT = propDB.getProperty("timer.format") == null ? "" : propDB.getProperty("timer.format");
//		CommonConst.TIMER_START = propDB.getProperty("timer.start") == null ? "" : propDB.getProperty("timer.start");
//		CommonConst.TIMER_STOP = propDB.getProperty("timer.stop") == null ? "" : propDB.getProperty("timer.stop");
//		
		CommonConst.MAIL_SERVER_HOST = propDB.getProperty("mailServerHost") == null ? "" : propDB.getProperty("mailServerHost");
		CommonConst.MAIL_SERVER_PORT= propDB.getProperty("mailServerPort") == null ? "" : propDB.getProperty("mailServerPort");
		CommonConst.USERNAME = propDB.getProperty("username") == null ? "" : propDB.getProperty("username");
		CommonConst.PASSWORD = propDB.getProperty("password") == null ? "" : propDB.getProperty("password");
		CommonConst.FROM_ADDRESS = propDB.getProperty("fromAddress") == null ? "" : propDB.getProperty("fromAddress");
		
		CommonConst.PKEY_LOG_PROPS = propDB.getProperty("log.propsfile") == null ? "" : propDB.getProperty("log.propsfile");
		
		new LogWriterInfo(CommonConst.ROOT_PATH+CommonConst.PKEY_LOG_PROPS);
	}

}
