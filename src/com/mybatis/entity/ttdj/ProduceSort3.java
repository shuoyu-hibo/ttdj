package com.mybatis.entity.ttdj;

public class ProduceSort3 {
    private Integer proSort3Code;

    private String proSort3Name;

    private Integer proSort2Code;

    private String ifUse;

    private Integer orderNum;

    private String remark;

    public Integer getProSort3Code() {
        return proSort3Code;
    }

    public void setProSort3Code(Integer proSort3Code) {
        this.proSort3Code = proSort3Code;
    }

    public String getProSort3Name() {
        return proSort3Name;
    }

    public void setProSort3Name(String proSort3Name) {
        this.proSort3Name = proSort3Name == null ? null : proSort3Name.trim();
    }

    public Integer getProSort2Code() {
        return proSort2Code;
    }

    public void setProSort2Code(Integer proSort2Code) {
        this.proSort2Code = proSort2Code;
    }

    public String getIfUse() {
        return ifUse;
    }

    public void setIfUse(String ifUse) {
        this.ifUse = ifUse == null ? null : ifUse.trim();
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}