package com.bz.log;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogWriterInfo {
	
	private static Logger logger = null;
	
	public LogWriterInfo(String strProp) {
		PropertyConfigurator.configure(strProp);
		logger = Logger.getLogger("wxspyp");
	}
	
	public static void writeLog_INFO(String strMsg) {
		logger.info(strMsg);
	}

}
