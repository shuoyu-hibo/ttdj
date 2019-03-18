package com.mybatis.entity.ttdj;

public class BusinessGroup {
    private Integer busiGropId;

    private String busiGropName;

    private Integer cityId;

    private String cityName;

    private Integer countyId;

    public Integer getBusiGropId() {
        return busiGropId;
    }

    public void setBusiGropId(Integer busiGropId) {
        this.busiGropId = busiGropId;
    }

    public String getBusiGropName() {
        return busiGropName;
    }

    public void setBusiGropName(String busiGropName) {
        this.busiGropName = busiGropName == null ? null : busiGropName.trim();
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public Integer getCountyId() {
        return countyId;
    }

    public void setCountyId(Integer countyId) {
        this.countyId = countyId;
    }
}