package com.web.action.produce;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import net.sf.json.JSONArray;

import com.mybatis.entity.ttdj.ProduceInfo;
import com.mybatis.entity.ttdj.UserInfo;
import com.service.produce.ProduceServiceImpl;
import com.web.action.base.BaseAction;
import com.web.action.base.JsonUtil;
import common.CommonUtil;

public class ProduceAction extends BaseAction {

    private File file;  
    private String fileFileContentType;  
    private String fileFileName;  
	private static final long serialVersionUID = 1L;
	CommonUtil commonUtil = new CommonUtil();

	/**
	 * 上传商品图片	
	 * @throws Exception
	 */
	public void uploadImage() throws Exception {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		String realDir = request.getSession().getServletContext()
				.getRealPath("");
		String contextpath = request.getContextPath();
		String userName =  (String) request.getSession().getAttribute("userName");
		String basePath = request.getScheme() + "://" + request.getServerName()
				+ ":" + request.getServerPort() + contextpath + "/";

			String filePath = "uploadfiles";
			String realPath = realDir + "\\" + filePath;
			File dir = new File(realPath);
			if (!dir.isDirectory())
				dir.mkdir();
			realPath = realPath+"\\"+userName;
			// 判断路径是否存在，不存在则创建
			File dirUser = new File(realPath);
			if (!dirUser.isDirectory())
				dirUser.mkdir();

			String message = "";  
			String newFileName = "";
	        //这里的返回类型设置是重点。否则会报错，必须设置成text/html;如果设置成application/json  IE下会有问题，chrome没问题的。  
	        if(fileFileName.endsWith(".exe")){  
	            message = "不允许上传此类文件！";  
	        }else if(!file.exists()){  
	            message = "此文件不存在！";  
	        }else{  
	            FileInputStream fis = new FileInputStream(file);  
	            String datetime = ""+new Date().getTime();
	            newFileName = datetime+"."+fileFileName.split("\\.")[1];
	            FileOutputStream fos = null;
	            try {
					fos = new FileOutputStream(new File(dirUser+"\\"+newFileName));  
					byte bt[] = new byte[500];  
					while(fis.read(bt)>0){  
					    fos.write(bt);  
					}  
				} catch (Exception e) {
					// TODO Auto-generated catch block
					getLog(this.getClass()).error(e.getMessage());
					e.printStackTrace();
				}  finally {
					fis.close();  
					fos.flush();  
					fos.close();
					message = "文件上传成功！";  
				}
	        }  
	        getLog(this.getClass()).info(this.getClass().getName()+"===============================json: {msg:\""+message+"\",newname:\""+userName+"/"+newFileName+"\"}");
	        response.getWriter().write("{msg:\""+message+"\",newname:\""+userName+"/"+newFileName+"\"}");  
	        response.getWriter().flush();  
	        response.getWriter().close();  
				
	}
	
	/**
	 * 上传商品信息
	 * @throws Exception
	 */
	public void saveProduceData() throws Exception {
		String produceName = commonUtil.decodeUrl(request.getParameter("produceName"));
		String produceDesc = commonUtil.decodeUrl(request.getParameter("produceDesc"));
		String producePrice = commonUtil.decodeUrl(request.getParameter("producePrice"));
		String remitPrice = commonUtil.decodeUrl(request.getParameter("produceCoupon"));
		String finalPrice = commonUtil.decodeUrl(request.getParameter("producePriceNew"));
		String proSort1Name = commonUtil.decodeUrl(request.getParameter("proSort1"));
		String proSort2Name = commonUtil.decodeUrl(request.getParameter("proSort2"));
		String proSort3Name = commonUtil.decodeUrl(request.getParameter("proSort3"));
		String proSort1Code = commonUtil.decodeUrl(request.getParameter("proSort1Code"));
		String proSort2Code = commonUtil.decodeUrl(request.getParameter("proSort2Code"));
		String proSort3Code = commonUtil.decodeUrl(request.getParameter("proSort3Code"));
		String ifPopular = commonUtil.decodeUrl(request.getParameter("ifPopular"));
		Object objName=request.getSession().getAttribute("userName");
		String userName = (String) (objName==null?"":objName);
		String producePicURL = commonUtil.decodeUrl(request.getParameter("picUrl"));
		UserInfo userinfo = (UserInfo) request.getSession().getAttribute("userinfo");
		ProduceInfo produceInfo = new ProduceInfo();
		produceInfo.setUserId(userinfo.getUserId());
		produceInfo.setUserName(userName);
		produceInfo.setProduceName(produceName);
		produceInfo.setProduceDesc(produceDesc);
		produceInfo.setProducePrice(new BigDecimal("".equals(producePrice)?"0":producePrice));
		produceInfo.setRemitPrice(new BigDecimal("".equals(remitPrice)?"0":remitPrice));
		produceInfo.setFinalPrice(new BigDecimal("".equals(finalPrice)?"0":finalPrice));
		produceInfo.setProducePic(producePicURL);
		produceInfo.setProSort1Name(proSort1Name);
		produceInfo.setProSort2Name(proSort2Name);
		produceInfo.setProSort3Name(proSort3Name);
		produceInfo.setProSort1Code("".equals(proSort1Code)?0:Integer.parseInt(proSort1Code));
		produceInfo.setProSort2Code("".equals(proSort2Code)?0:Integer.parseInt(proSort2Code));
		produceInfo.setProSort3Code("".equals(proSort3Code)?0:Integer.parseInt(proSort3Code));
		produceInfo.setIfPopular(ifPopular);
		Date dt = new Date();
		produceInfo.setAddDate(dt);
		produceInfo.setLastUpdateDate(dt);
		ProduceServiceImpl produceServiceImpl = ((ProduceServiceImpl) getApplicationContext().getBean("produceServiceImpl"));
		boolean flag = produceServiceImpl.saveProduceData(produceInfo);
		JsonUtil jsUtil = new JsonUtil();
		JSONArray jsAry=new JSONArray();
		if(flag)
			jsUtil.returnJson(response, "0","保存成功!", jsAry);//保存成功
		else
			jsUtil.returnJson(response, "1","保存失败!", jsAry);//保存失败
	}
	
	/**
	 * 删除商品信息
	 * @throws Exception
	 */
	public void deleteProduceData() throws Exception {
		String produceId = commonUtil.decodeUrl(request.getParameter("produceId"));
		ProduceServiceImpl produceServiceImpl = ((ProduceServiceImpl) getApplicationContext().getBean("produceServiceImpl"));
		boolean flag = produceServiceImpl.deleteProduceData(produceId);
		JsonUtil jsUtil = new JsonUtil();
		JSONArray jsAry=new JSONArray();
//		if(flag)
			jsUtil.returnJson(response, "0","删除成功!", jsAry);//保存成功
//		else
			jsUtil.returnJson(response, "1","删除失败!", jsAry);//保存失败
	}
	
	/**
	 * 修改商品信息
	 * @throws Exception
	 */
	public void updateProduceData() throws Exception {
		String produceName = commonUtil.decodeUrl(request.getParameter("produceNameUpd"));
		String produceDesc = commonUtil.decodeUrl(request.getParameter("produceDescUpd"));
		String producePrice = commonUtil.decodeUrl(request.getParameter("producePriceUpd"));
		String remitPrice = commonUtil.decodeUrl(request.getParameter("produceCouponUpd"));
		String finalPrice = commonUtil.decodeUrl(request.getParameter("producePriceNewUpd"));
		String proSort1Name = commonUtil.decodeUrl(request.getParameter("proSort1Upd"));
		String proSort2Name = commonUtil.decodeUrl(request.getParameter("proSort2Upd"));
		String proSort3Name = commonUtil.decodeUrl(request.getParameter("proSort3Upd"));
		String proSort1Code = commonUtil.decodeUrl(request.getParameter("proSort1CodeUpd"));
		String proSort2Code = commonUtil.decodeUrl(request.getParameter("proSort2CodeUpd"));
		String proSort3Code = commonUtil.decodeUrl(request.getParameter("proSort3CodeUpd"));
		String ifPopular = commonUtil.decodeUrl(request.getParameter("ifPopularUpd"));
		Object objName=request.getSession().getAttribute("userName");
		String userName = (String) (objName==null?"":objName);
		String producePicURL = commonUtil.decodeUrl(request.getParameter("picUrlUpd"));
		UserInfo userinfo = (UserInfo) request.getSession().getAttribute("userinfo");
		String produceId = commonUtil.decodeUrl(request.getParameter("produceId"));
		ProduceServiceImpl produceServiceImpl = ((ProduceServiceImpl) getApplicationContext().getBean("produceServiceImpl"));
		ProduceInfo produceInfo = produceServiceImpl.selectProduceById(produceId);
		produceInfo.setUserId(userinfo.getUserId());
		produceInfo.setUserName(userName);
		produceInfo.setProduceName(produceName);
		produceInfo.setProduceDesc(produceDesc);
		produceInfo.setProducePrice(new BigDecimal("".equals(producePrice)?"0":producePrice));
		produceInfo.setRemitPrice(new BigDecimal("".equals(remitPrice)?"0":remitPrice));
		produceInfo.setFinalPrice(new BigDecimal("".equals(finalPrice)?"0":finalPrice));
		produceInfo.setProducePic(producePicURL);
		produceInfo.setProSort1Name(proSort1Name);
		produceInfo.setProSort2Name(proSort2Name);
		produceInfo.setProSort3Name(proSort3Name);
		produceInfo.setProSort1Code("".equals(proSort1Code)?0:Integer.parseInt(proSort1Code));
		produceInfo.setProSort2Code("".equals(proSort2Code)?0:Integer.parseInt(proSort2Code));
		produceInfo.setProSort3Code("".equals(proSort3Code)?0:Integer.parseInt(proSort3Code));
		produceInfo.setIfPopular(ifPopular);
		produceInfo.setLastUpdateDate(new Date());
		boolean flag = produceServiceImpl.updateProduceData(produceInfo);
		JsonUtil jsUtil = new JsonUtil();
		JSONArray jsAry=new JSONArray();
//		if(flag)
			jsUtil.returnJson(response, "0","更新成功!", jsAry);//保存成功
//		else
			jsUtil.returnJson(response, "1","更新失败!", jsAry);//保存失败
	}
	
	/**
	 * 获取商家商品信息
	 * @throws Exception
	 */
	public void getProduceInfoByUser() throws Exception {
		UserInfo userinfo = (UserInfo) request.getSession().getAttribute("userinfo");
		String pageCurrNum = commonUtil.decodeUrl(request.getParameter("pcn"));
		String pageSize = commonUtil.decodeUrl(request.getParameter("ps"));
		int intPageCurrNum = "".equals(pageCurrNum)?0:Integer.parseInt(pageCurrNum);
		int intPageSize = "".equals(pageSize)?0:Integer.parseInt(pageSize);
		int intPageCurrCount = (intPageCurrNum-1)*intPageSize;
		ProduceServiceImpl produceServiceImpl = ((ProduceServiceImpl) getApplicationContext().getBean("produceServiceImpl"));
		List<ProduceInfo> list = produceServiceImpl.selectProduceByUserId(userinfo.getUserId(),intPageCurrCount,intPageSize);
		List<ProduceInfo> listCount = produceServiceImpl.selectProduceByUserId(userinfo.getUserId());
		JsonUtil jsUtil = new JsonUtil();
		JSONArray jsAry=new JSONArray();
		if(list!=null){
			for(ProduceInfo pdinfo : list){
				jsAry.add(pdinfo);
			}
			getLog(this.getClass()).info(this.getClass().getName()+"=====================查询用户【"+userinfo.getUserName()+"】的商品信息成功!");
			jsUtil.returnJson(response, "0","查询商品信息成功!", jsAry,""+listCount.size());//保存成功
		}else{
			getLog(this.getClass()).error(this.getClass().getName()+"=====================查询用户【"+userinfo.getUserName()+"】的商品信息失败!");
			jsUtil.returnJson(response, "1","查询失败!", jsAry);//保存成功
		}
	}
	
	/**
	 * 获取商家商品信息
	 * @throws Exception
	 */
	public void getPopularProduceInfoByUser() throws Exception {
		UserInfo userinfo = (UserInfo) request.getSession().getAttribute("userinfo");
		ProduceServiceImpl produceServiceImpl = ((ProduceServiceImpl) getApplicationContext().getBean("produceServiceImpl"));
		List<ProduceInfo> list = produceServiceImpl.selectPopularProduceByUserId(userinfo.getUserId());
		JsonUtil jsUtil = new JsonUtil();
		JSONArray jsAry=new JSONArray();
		if(list!=null){
			for(ProduceInfo pdinfo : list){
				jsAry.add(pdinfo);
			}
			getLog(this.getClass()).info(this.getClass().getName()+"=====================查询用户【"+userinfo.getUserName()+"】的商品信息成功!");
			jsUtil.returnJson(response, "0","查询商品信息成功!", jsAry);//保存成功
		}else{
			getLog(this.getClass()).error(this.getClass().getName()+"=====================查询用户【"+userinfo.getUserName()+"】的商品信息失败!");
			jsUtil.returnJson(response, "1","查询失败!", jsAry);//保存成功
		}
	}
	
	/**
	 * 获取商家商品信息byProduceId
	 * @throws Exception
	 */
	public void getProduceInfoById() throws Exception {
		String produceId = commonUtil.decodeUrl(request.getParameter("produceId"));
		ProduceServiceImpl produceServiceImpl = ((ProduceServiceImpl) getApplicationContext().getBean("produceServiceImpl"));
		ProduceInfo produceinfo = produceServiceImpl.selectProduceById(produceId);
		JsonUtil jsUtil = new JsonUtil();
		JSONArray jsAry=new JSONArray();
		if(produceinfo!=null){
			jsAry.add(produceinfo);
			getLog(this.getClass()).info(this.getClass().getName()+"=====================查询商品信息成功! "+jsAry);
			jsUtil.returnJson(response, "0","查询商品信息成功!", jsAry);//保存成功
		}else{
			getLog(this.getClass()).error(this.getClass().getName()+"=====================查询商品信息失败!");
			jsUtil.returnJson(response, "1","查询失败!", jsAry);//保存成功
		}
	}
	
	public File getFile() {
			return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getFileFileContentType() {
		return fileFileContentType;
	}

	public void setFileFileContentType(String fileFileContentType) {
		this.fileFileContentType = fileFileContentType;
	}

	public String getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

}
