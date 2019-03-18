package com.bz.util;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Properties;

/**
 * @author haibo 
 * @version 创建时间：Oct 6, 2012 6:16:25 AM
 * 类说明
 */
public class PathUtil {
	
	public static void main(String[] args) {   
        PathUtil pathUtil = new PathUtil();   
        System.out.println("path=="+pathUtil.getWebInfPath());   
    }

	public String getWebInfPath() {
		URL url = getClass().getProtectionDomain().getCodeSource()
				.getLocation();
		String path = url.toString();
		int index = path.indexOf("WEB-INF");

		if (index == -1) {
			index = path.indexOf("classes");
		}

		if (index == -1) {
			index = path.indexOf("bin");
		}

		path = path.substring(0, index);

		if (path.startsWith("zip")) {//当class文件在war中时，此时返回zip:D:/...这样的路径   
			path = path.substring(4);
		} else if (path.startsWith("file")) {//当class文件在class文件中时，此时返回file:/D:/...这样的路径   
			path = path.substring(6);
		} else if (path.startsWith("jar")) {//当class文件在jar文件里面时，此时返回jar:file:/D:/...这样的路径   
			path = path.substring(10);
		}
		try {
			path = URLDecoder.decode(path, "UTF-8");
			
			Properties prop = System.getProperties();

			String os = prop.getProperty("os.name");
			System.out.println(os);
			
			System.out.println("path::::"+path);

			if(os.startsWith("win") || os.startsWith("Win")){
				
			}else{
				path = "/"+path;
			}
			
			System.out.println("path2222::::"+path);
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		return path;
	}

}
