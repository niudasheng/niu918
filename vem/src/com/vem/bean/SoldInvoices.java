package com.vem.bean;

import java.util.Date;

/**
 *
 * 销售单据
 *
 * @author niuchenyang
 *
 */
public class SoldInvoices {
    private Integer siId;

    private String siNumber;

    private Date siDate;

    private Integer siTotal;

    private Double siSum;

    private Double siReturn;

    private Date siCreatedTime;

    private Date siUpdatedTime;

    private Integer siUpdatedBy;

    private Integer siCreatedBy;

    private Boolean isSi;

    public Integer getSiId() {
        return siId;
    }

    public void setSiId(Integer siId) {
        this.siId = siId;
    }

    public String getSiNumber() {
        return siNumber;
    }

    public void setSiNumber(String siNumber) {
        this.siNumber = siNumber == null ? null : siNumber.trim();
    }

    public Date getSiDate() {
        return siDate;
    }

    public void setSiDate(Date siDate) {
        this.siDate = siDate;
    }

    public Integer getSiTotal() {
        return siTotal;
    }

    public void setSiTotal(Integer siTotal) {
        this.siTotal = siTotal;
    }

    public Double getSiSum() {
        return siSum;
    }

    public void setSiSum(Double siSum) {
        this.siSum = siSum;
    }

    public Double getSiReturn() {
        return siReturn;
    }

    public void setSiReturn(Double siReturn) {
        this.siReturn = siReturn;
    }

    public Date getSiCreatedTime() {
        return siCreatedTime;
    }

    public void setSiCreatedTime(Date siCreatedTime) {
        this.siCreatedTime = siCreatedTime;
    }

    public Date getSiUpdatedTime() {
        return siUpdatedTime;
    }

    public void setSiUpdatedTime(Date siUpdatedTime) {
        this.siUpdatedTime = siUpdatedTime;
    }

    public Integer getSiUpdatedBy() {
        return siUpdatedBy;
    }

    public void setSiUpdatedBy(Integer siUpdatedBy) {
        this.siUpdatedBy = siUpdatedBy;
    }

    public Integer getSiCreatedBy() {
        return siCreatedBy;
    }

    public void setSiCreatedBy(Integer siCreatedBy) {
        this.siCreatedBy = siCreatedBy;
    }

    public Boolean getIsSi() {
        return isSi;
    }

    public void setIsSi(Boolean isSi) {
        this.isSi = isSi;
    }
}