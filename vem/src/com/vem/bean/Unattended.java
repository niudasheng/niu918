package com.vem.bean;

import java.util.Date;
/**
 *
 * 门店信息
 *
 * @author niuchenyang
 *
 */
public class Unattended {

    private Integer unaId;

    private String unaName;

    private Integer userId;

    private Integer siId;

    private Integer cdId;

    private Date unaCreatedTime;

    private Date unaUpdatedTime;

    private Integer unaUpdatedBy;

    private Integer unaCreatedBy;

    private Boolean isUna;

    public Integer getUnaId() {
        return unaId;
    }

    public void setUnaId(Integer unaId) {
        this.unaId = unaId;
    }

    public String getUnaName() {
        return unaName;
    }

    public void setUnaName(String unaName) {
        this.unaName = unaName == null ? null : unaName.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getSiId() {
        return siId;
    }

    public void setSiId(Integer siId) {
        this.siId = siId;
    }

    public Integer getCdId() {
        return cdId;
    }

    public void setCdId(Integer cdId) {
        this.cdId = cdId;
    }

    public Date getUnaCreatedTime() {
        return unaCreatedTime;
    }

    public void setUnaCreatedTime(Date unaCreatedTime) {
        this.unaCreatedTime = unaCreatedTime;
    }

    public Date getUnaUpdatedTime() {
        return unaUpdatedTime;
    }

    public void setUnaUpdatedTime(Date unaUpdatedTime) {
        this.unaUpdatedTime = unaUpdatedTime;
    }

    public Integer getUnaUpdatedBy() {
        return unaUpdatedBy;
    }

    public void setUnaUpdatedBy(Integer unaUpdatedBy) {
        this.unaUpdatedBy = unaUpdatedBy;
    }

    public Integer getUnaCreatedBy() {
        return unaCreatedBy;
    }

    public void setUnaCreatedBy(Integer unaCreatedBy) {
        this.unaCreatedBy = unaCreatedBy;
    }

    public Boolean getIsUna() {
        return isUna;
    }

    public void setIsUna(Boolean isUna) {
        this.isUna = isUna;
    }
}