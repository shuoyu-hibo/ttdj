package com.bz.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.Random;
import java.util.Vector;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.sql.*;

import com.bz.log.*;

public class GlobalMethod {

	/**
	 * 日期比较
	 * 
	 * DATE1 > DATE2  返回1
	 * DATE1 < DATE2  返回-1
	 * DATE1 = DATE2  返回0
	 * 
	 * @@param strFormat
	 * @@param DATE1
	 * @@param DATE2
	 * @@return
	 */
	public static int compare_date(String strFormat, String DATE1, String DATE2) {
		SimpleDateFormat df = new SimpleDateFormat(strFormat);
		try {
			Date dt1 = df.parse(DATE1);
			Date dt2 = df.parse(DATE2);
			if (dt1.getTime() > dt2.getTime()) {
				return 1;
			} 
			else if (dt1.getTime() < dt2.getTime()) {
				return -1;
			} 
			else {
				return 0;
			}
		} 
		catch (Exception e) {
			LogWriterInfo.writeLog_INFO("com.excelbj.util.GlobalMethod.compare_date(): " + e);
		}
		return 0;
	}
	
	
	/**
	 * 计算日期
	 * @@param strFormat    日期格式
	 * @@param strCurrDate  基准日期
	 * @@param offset       偏移量(+/-)，单位：天
	 * @@return
	 */
	public static String calcDate(String strFormat, String strCurrDate, int offset) {
		String strRtn = "";
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(strFormat);   
      Date dtObj = sdf.parse(strCurrDate);
      
      SimpleDateFormat df = new SimpleDateFormat(strFormat);    
      strRtn = df.format(new Date(dtObj.getTime() + (long) offset * 24 * 60 * 60 * 1000));   
		}
		catch (Exception e) {
			LogWriterInfo.writeLog_INFO("com.bz.util.GlobalMethod.getLogParam(): " + e);
		}
		
		return strRtn;
	}
	
	
	/**
	 * 将秒数转换为 HH:MM:SS
	 * @@param lngSeconds
	 * @@return
	 */
	public static Hashtable convtTime(long lngSeconds) {
		Hashtable htRtn = new Hashtable();
		
		long hour = lngSeconds/3600;
	  long min = (lngSeconds-hour*3600)/60;
	  long sec = lngSeconds-hour*3600-min*60;
		
	  htRtn.put(Constants.KEY_HOUR, Long.toString(hour));
	  htRtn.put(Constants.KEY_MINUTE, Long.toString(min));
	  htRtn.put(Constants.KEY_SECOND, Long.toString(sec));
	  
		return htRtn;
	}
	
	
	
	/** 
   * 执行shell脚本
   * 
   * @@param sShell    脚本文件名(包含路径)
   * @@param strParam  脚本所需参数
   * @@return
   */
  public static boolean execShell(String sShell, String[] sParam) {
    try {    	
    	StringBuffer sbCmd = new StringBuffer();
    	sbCmd.append(sShell);
    	for (int i = 0 ; i < sParam.length; i++) {
    		sbCmd.append(" " + sParam[i]);
    	}
    	
    	String strCmd = sbCmd.toString();
    	
    	LogWriterInfo.writeLog_INFO("ExecShell ִ��SEHLL: " + strCmd);
    	
      Process pShell = Runtime.getRuntime().exec(strCmd);
      InputStream in   =   pShell.getInputStream();
      InputStream errorstream = pShell.getErrorStream();
      BufferedReader br = new   BufferedReader(new   InputStreamReader(in));
      BufferedReader errorReader = new BufferedReader(new InputStreamReader(errorstream));

      OutputStream out   =   pShell.getOutputStream();
      String sLine = "";
      while((sLine = br.readLine()) != null) {
        /*if(!br.ready()) {
          String   o   =   "\n\n\nexit\n";
          out.write(o.getBytes());
        }*/
      	LogWriterInfo.writeLog_INFO("ExecShell ִ��SEHLL���:" + sLine);
      }
      String errorline = "";
      while ((errorline = errorReader.readLine()) != null) {
      	LogWriterInfo.writeLog_INFO("ExecShell ִ��SEHLL�������:" + errorline);
      }

      br.close();
      out.close();
      errorReader.close();
      pShell.destroy();
      return true;
    }catch (Exception ex) {
    	LogWriterInfo.writeLog_INFO("com.excelbj.util.GlobalMethod.ExecShell: Error - " + ex);
      return false;
    }
  }
  
  
  public static Date getSystemDateTime() throws Exception {
  	Date dt = new Date();    
  	
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String strFormatDt = sdf.format(dt);
    
    return sdf.parse(strFormatDt);
  }
  
  
  
  /**
   * 获取一组不重复的随机数
   * @param intNumCnt   需要产生随机数的个数
   * @param intNumBound 随机数的最大值
   * @return ArrayList
   * @throws Exception
   */
  public static ArrayList getRandomNum(int intNumCnt, int intNumBound) {
  	ArrayList list = new ArrayList();
	  Random rand = new Random();
	  boolean[] bool = new boolean[intNumBound];
	  int num = 0;
	  for (int i = 0; i < intNumCnt; i++) {
	   do {
	    // 如果产生的随机数相同或等于0，则继续循环
	    num = rand.nextInt(intNumBound);
	   } 
	   while (bool[num] || num == 0);
	   bool[num] = true;
	   list.add(Integer.toString(num));
	  }
	  
	  return list;
  }
  
  
  public static void main(String[] args) {
  	System.out.println(getRandomNum(5, 10));
  }
}
