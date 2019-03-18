package com.mybatis.entity.ttdj;

public class PictureInfo {
    private Integer picId;

    private String picDesc;

    private Integer picNo;

    private String picUrl;

    private String picClass;

    private Integer dotCount;

    private String remark;

    public Integer getPicId() {
        return picId;
    }

    public void setPicId(Integer picId) {
        this.picId = picId;
    }

    public String getPicDesc() {
        return picDesc;
    }

    public void setPicDesc(String picDesc) {
        this.picDesc = picDesc == null ? null : picDesc.trim();
    }

    public Integer getPicNo() {
        return picNo;
    }

    public void setPicNo(Integer picNo) {
        this.picNo = picNo;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public String getPicClass() {
        return picClass;
    }

    public void setPicClass(String picClass) {
        this.picClass = picClass == null ? null : picClass.trim();
    }

    public Integer getDotCount() {
        return dotCount;
    }

    public void setDotCount(Integer dotCount) {
        this.dotCount = dotCount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}