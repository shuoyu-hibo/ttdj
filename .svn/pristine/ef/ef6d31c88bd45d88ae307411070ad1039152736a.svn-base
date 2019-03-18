package com.bz.util;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import com.bz.log.*;

public class FileHandler {

	/**
	 * ¶ÁÈ¡Õû¸öÎÄ¼þ
	 * @@param file
	 * @@return
	 */
	public static Vector read(String file) throws Exception {
		String s = null;
		Vector vtRtn = new Vector();
		File f = new File(file);
		
		if (f.exists()) {
			FileInputStream objFI = new FileInputStream(f);
			InputStreamReader objIR = new InputStreamReader(objFI);
			BufferedReader br = new BufferedReader(objIR);
			
			try {
				while ((s = br.readLine()) != null) {
					vtRtn.add(s);
				}
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				if (objFI != null)
					objFI.close();
				
				if (objIR != null)
					objIR.close();
				
				if (br != null)
					br.close();
			}
		} 
		else {
			LogWriterInfo.writeLog_INFO(FileHandler.class.getName() + ".read: file [" + file + "] doesn't exist!");
			vtRtn = null;
		}
		
		return vtRtn;
	}
	
	
	
	public static boolean deleteFile(String filePathName) throws Exception {
	  boolean result = true;
	  
	  try {
		  File file = new File(filePathName);
		  if (file.exists()) {
		  	result = file.delete();
		  }
	  }
	  catch (Exception e) {
	  	LogWriterInfo.writeLog_INFO(FileHandler.class.getName() + ".deleteFile: " + e);
	  	e.printStackTrace();
	  	result = false;
	  	throw e;
	  }
	  
	  return result;
  }
	
	
	
	/**
	 * ±éÀúÄ¿Â¼ÏÂ(°üÀ¨×ÓÄ¿Â¼)µÄËùÓÐÎÄ¼þ
	 * @@param strPath        ÐèÒª±éÀúµÄ¸ùÄ¿Â¼
	 * @@param destHashtable  ·µ»ØÖµ(Hashtable[Ä¿Â¼, ArrayList(ÎÄ¼þÃû)])
	 */
	public static void refreshFileList(String strPath, Hashtable destHashtable) throws Exception {
		File dir = new File(strPath);
		File[] files = dir.listFiles();
		ArrayList fileList = new ArrayList();
		
		if (files == null) return;
		
		for (int i = 0; i < files.length; i++) {
			if (files[i].isDirectory()) {
				refreshFileList(files[i].getAbsolutePath(), destHashtable);
			}
			else {
				String strFileName = files[i].getName();
				fileList.add(strFileName);
			}
		}
		
		if (fileList.size() > 0) {
			destHashtable.put(dir.getAbsolutePath(), fileList);
		}
	}
	
	
	
	/**
	 * »ñÈ¡ÎÄ¼þ
	 * ¿ÉÒÔ¸ù¾ÝÕýÔò±í´ïÊ½²éÕÒ
	 * @@param dir String ÎÄ¼þ¼ÐÃû³Æ
	 * @@param s String ²éÕÒÎÄ¼þÃû£¬¿É´ø*.?½øÐÐÄ£ºý²éÑ¯
	 * @@return File[] ÕÒµ½µÄÎÄ¼þ
	 */
	public static ArrayList getFiles(String dir, String s) throws Exception {
	  //¿ªÊ¼µÄÎÄ¼þ¼Ð
	  File file = new File(dir);

	  s = s.replace('.', '#');
	  s = s.replaceAll("#", "\\\\.");
	  s = s.replace('*', '#');
	  s = s.replaceAll("#", ".*");
	  s = s.replace('?', '#');
	  s = s.replaceAll("#", ".?");
	  s = "^" + s + "$";

	  Pattern p = Pattern.compile(s);
	  ArrayList list = filePattern(file, p);

	  return list;
	}

	/**
	 * @@param file File ÆðÊ¼ÎÄ¼þ¼Ð
	 * @@param p Pattern Æ¥ÅäÀàÐÍ
	 * @@return ArrayList ÆäÎÄ¼þ¼ÐÏÂµÄÎÄ¼þ¼Ð
	 */

	private static ArrayList filePattern(File file, Pattern p) throws Exception {
	  if (file == null) {
	    return null;
	  }
	  else if (file.isFile()) {
	    Matcher fMatcher = p.matcher(file.getName());
	    if (fMatcher.matches()) {
	      ArrayList list = new ArrayList();
	      list.add(file);
	      return list;
	    }
	  }
	  else if (file.isDirectory()) {
	    File[] files = file.listFiles();
	    if (files != null && files.length > 0) {
	      ArrayList list = new ArrayList();
	      for (int i = 0; i < files.length; i++) {
	        ArrayList rlist = filePattern(files[i], p);
	        if (rlist != null) {
	          list.addAll(rlist);
	        }
	      }
	      return list;
	    }
	  }
	  return null;
	}
	
	
	
	/**
	 * ÎÄ¼þÅÅÐò£¨ÉýÐò£©
	 * @@param strPath
	 * @@param strFileName ²éÕÒÎÄ¼þÃû£¬¿É´ø*.?½øÐÐÄ£ºý²éÑ¯
	 * @@return
	 */
  public static ArrayList listSortedFiles(String strPath, String strFileName) throws Exception {
  	//assert dirFile.isDirectory();
  	
  	ArrayList files = getFiles(strPath, strFileName);
      
    FileWrapper [] fileWrappers = new FileWrapper[files.size()];
    for (int i = 0; i < files.size(); i++) {
      fileWrappers[i] = new FileWrapper((File)files.get(i));
    }
      
    Arrays.sort(fileWrappers);
      
    ArrayList sortedFiles = new ArrayList();
    for (int i = 0; i < files.size(); i++) {
      sortedFiles.add(fileWrappers[i].getFile());
    }
      
    return sortedFiles;
  }
  
  
  
  /**
   * 将图片文件转换为字节
   * @param imagePath 图片文件路径
   * @param fileType  图片格式（文件扩展名）
   * @return
 * @throws IOException 
   */
  public static byte[] image2Bytes(String imagePath, String fileType) throws IOException {
	  File file = new File(imagePath);
	  BufferedImage img = ImageIO.read(file);
	  ByteArrayOutputStream buf = new ByteArrayOutputStream((int) file.length());
	  ImageIO.write(img, "jpg", buf);
	  byte[] imgByte=buf.toByteArray();
	  buf.close();
	  img=null;
	  file=null;
      return imgByte;
   }
  
  
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		
		try {
			refreshFileList("D:/Project/eclipse_workspace/BIS_Log_Server/log_example", ht);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(ht);
	}

}
