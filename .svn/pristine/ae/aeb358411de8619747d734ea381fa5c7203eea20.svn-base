package common;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;

import com.mybatis.entity.ttdj.ProduceInfo;
import com.mybatis.entity.ttdj.ProduceSort1;
import com.mybatis.entity.ttdj.ProduceSort2;

public class CommonConst {

	public static final String CONFIG_FILE_PATH = "WEB-INF/properties/config.properties";
	
	public static String ROOT_PATH="";
	
	public static String CLIENT_APPKEY = "";
	public static String CLIENT_APPSECRET = "";
	public static String GUANFANG_WEIBOID = "";
	public static String SINAAPP_INDEX_URL = "";
	public static String COMMENT_UTIL_ACCESSTOKEN = "";
	public static String COMMENT_ACCESSTOKEN_EXPIRE = "";
	public static String COMMENT_WEIBO_CONTENT = "";
	
	public static String DB_URL = "";
	public static String DB_USER = "";
	public static String DB_PWD = "";
	public static String DB_DRIVER_CLASSNAME = "";
	
	public static String TIMER_INIT_DELAY = "";
	public static String TIMER_RUN_DELAY = "";
	public static String TIMER_FORMAT = "";
	public static String TIMER_START = "";
	public static String TIMER_STOP = "";
	
	//Begin added by Benny Geng 2012/11/14
	public static String UPLOAD_PIC_PATH = "";
	//End added by Benny Geng 2012/11/14
	
	public static String PKEY_LOG_PROPS = "";
	
	public final static String INT_PAGE_SIZE = "INT_PAGE_SIZE";
	public final static String INT_PAGE_NOW = "INT_PAGE_NOW";
	public final static String INT_PAGE_COUNT = "INT_PAGE_COUNT";
	public final static String INT_ROW_COUNT = "INT_ROW_COUNT";

	public static final int MINUTE = 10;//定义加载首页数据时间间隔 每十分钟查询一次,避免查询频繁对服务器的压力
	
	
	public static String MAIL_SERVER_HOST="";
	public static String MAIL_SERVER_PORT="";
	public static String USERNAME="";
	public static String PASSWORD="";
	public static String FROM_ADDRESS="";
	
	public static Date lastSelectPdDate; //记录最后一次查询的时间
	public static Date lastSelectMenu1Date; //记录最后一次查询一级菜单的时间
	public static Date lastSelectMenu2Date; //记录最后一次查询二级菜单的时间
	public static Date lastSearch; //最后一次ajax执行typeahead的时间
	public static JSONArray jsonAry; //最后一次ajax执行typeahead的装载
	public static List<ProduceInfo> lFinal = null;//查询的数据
	public static List<ProduceSort1> listMenu1 = null;//查询一级菜单
	public static Map<Integer,List<ProduceSort2>> mapMenu2 = new HashMap<Integer,List<ProduceSort2>>();//一级、二(三)级菜单关系映射
}
