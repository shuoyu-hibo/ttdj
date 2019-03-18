package com.mybatis.entity.ttdj.page;
/**
 * 查询分页实体
 * @author wanghaibo
 *
 */
public class PagePojo {
    private Integer code;//菜单code
    
    private Integer cityCode;//城市code
    
    private String searchStr;//搜索字符串

    private Integer orderMark;//order by 标记

    private String ifDesc;//是否desc

    private Integer recordCount;//起始查询数 page use

    private Integer recordSum;//总条数
    
    private Integer pageSize;//每页条数
    
    private String[] searchStrAry;
    
    
    

	public Integer getCityCode() {
		return cityCode;
	}

	public void setCityCode(Integer cityCode) {
		this.cityCode = cityCode;
	}

	public String[] getSearchStrAry() {
		return searchStrAry;
	}

	public void setSearchStrAry(String[] searchStrAry) {
		this.searchStrAry = searchStrAry;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getSearchStr() {
		return searchStr;
	}

	public void setSearchStr(String searchStr) {
		this.searchStr = searchStr;
	}

	public Integer getOrderMark() {
		return orderMark;
	}

	public void setOrderMark(Integer orderMark) {
		this.orderMark = orderMark;
	}

	public String getIfDesc() {
		return ifDesc;
	}

	public void setIfDesc(String ifDesc) {
		this.ifDesc = ifDesc;
	}

	public Integer getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(Integer recordCount) {
		this.recordCount = recordCount;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getRecordSum() {
		return recordSum;
	}

	public void setRecordSum(Integer recordSum) {
		this.recordSum = recordSum;
	}

	
    
    
}