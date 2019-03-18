package common;

import java.awt.Color;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

public class CommonUtil {

	public String decodeUrl(String str){
		if("".equals(str)||str==null)
			str="";
		try {
			return java.net.URLDecoder.decode(str,"utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			Logger.getLogger(this.getClass()).error(this.getClass().getName()+"==============error: "+e.getMessage());
			e.printStackTrace();
		}
		return str;
	}
	/**
	 * 获取客户端ip地址
	 * @param request
	 * @return
	 */
	public String getIpAddr(HttpServletRequest request) { 
	       String ip = request.getHeader("x-forwarded-for"); 
	       if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
	           ip = request.getHeader("Proxy-Client-IP"); 
	       } 
	       if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
	           ip = request.getHeader("WL-Proxy-Client-IP"); 
	       } 
	       if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
	           ip = request.getRemoteAddr(); 
	       } 
	       return ip; 
	   } 
	
	/**
	 * 生成验证码
	 * @param g
	 * @param sRand
	 * @param count
	 * @return
	 */
	public String genChkNumber(Graphics g,String sRand,int count){
		Random random = new Random();
		for (int j = 0; j < count; j++) {
			String rand = String.valueOf(random.nextInt(10));
			sRand += rand;
			g.setColor(new Color(20 + random.nextInt(110), 20 + random
					.nextInt(110), 20 + random.nextInt(110)));
			g.drawString(rand, 13 * j + 6, 16);
		}
		return sRand;
	}
	/**
	 * 验证码颜色
	 * @param fc
	 * @param bc
	 * @return
	 */
	public Color getRandColor(int fc, int bc) {
		Random random = new Random();
		if (fc > 255)
			fc = 255;
		if (bc > 255)
			bc = 255;
		int r = fc + random.nextInt(bc - fc);
		int g = fc + random.nextInt(bc - fc);
		int b = fc + random.nextInt(bc - fc);
		return new Color(r, g, b);
	}
}
