package com.vem.bean;

import java.util.Date;
/**
 *
 * 商品信息
 *
 * @author niuchenyang
 *
 */
public class Commodity {
    private Integer cdId;

    private String cdCode;

    private String cdName;

    private String cdSpell;

    private String cdCategory;

    private Double cdPrice;

    private Double cdCost;

    private Integer cdInventory;

    private String cdUnit;

    private Integer cdTotal;

    private Date cdMaturity;

    private Double cdMember;

    private String cdPack;

    private String cdSupplier;

    private Integer cdFloor;

    private String cdNumber;

    private Date cdCreatedTime;

    private Date cdUpdatedTime;

    private Integer cdUpdatedBy;

    private Integer cdCreatedBy;

    private Boolean isCd;

    private String cdRemark;

    public Integer getCdId() {
        return cdId;
    }

    public void setCdId(Integer cdId) {
        this.cdId = cdId;
    }

    public String getCdCode() {
        return cdCode;
    }

    public void setCdCode(String cdCode) {
        this.cdCode = cdCode == null ? null : cdCode.trim();
    }

    public String getCdName() {
        return cdName;
    }

    public void setCdName(String cdName) {
        this.cdName = cdName == null ? null : cdName.trim();
    }

    public String getCdSpell() {
        return cdSpell;
    }

    public void setCdSpell(String cdSpell) {
        this.cdSpell = cdSpell == null ? null : cdSpell.trim();
    }

    public String getCdCategory() {
        return cdCategory;
    }

    public void setCdCategory(String cdCategory) {
        this.cdCategory = cdCategory == null ? null : cdCategory.trim();
    }

    public Double getCdPrice() {
        return cdPrice;
    }

    public void setCdPrice(Double cdPrice) {
        this.cdPrice = cdPrice;
    }

    public Double getCdCost() {
        return cdCost;
    }

    public void setCdCost(Double cdCost) {
        this.cdCost = cdCost;
    }

    public Integer getCdInventory() {
        return cdInventory;
    }

    public void setCdInventory(Integer cdInventory) {
        this.cdInventory = cdInventory;
    }

    public String getCdUnit() {
        return cdUnit;
    }

    public void setCdUnit(String cdUnit) {
        this.cdUnit = cdUnit == null ? null : cdUnit.trim();
    }

    public Integer getCdTotal() {
        return cdTotal;
    }

    public void setCdTotal(Integer cdTotal) {
        this.cdTotal = cdTotal;
    }

    public Date getCdMaturity() {
        return cdMaturity;
    }

    public void setCdMaturity(Date cdMaturity) {
        this.cdMaturity = cdMaturity;
    }

    public Double getCdMember() {
        return cdMember;
    }

    public void setCdMember(Double cdMember) {
        this.cdMember = cdMember;
    }

    public String getCdPack() {
        return cdPack;
    }

    public void setCdPack(String cdPack) {
        this.cdPack = cdPack == null ? null : cdPack.trim();
    }

    public String getCdSupplier() {
        return cdSupplier;
    }

    public void setCdSupplier(String cdSupplier) {
        this.cdSupplier = cdSupplier == null ? null : cdSupplier.trim();
    }

    public Integer getCdFloor() {
        return cdFloor;
    }

    public void setCdFloor(Integer cdFloor) {
        this.cdFloor = cdFloor;
    }

    public String getCdNumber() {
        return cdNumber;
    }

    public void setCdNumber(String cdNumber) {
        this.cdNumber = cdNumber == null ? null : cdNumber.trim();
    }

    public Date getCdCreatedTime() {
        return cdCreatedTime;
    }

    public void setCdCreatedTime(Date cdCreatedTime) {
        this.cdCreatedTime = cdCreatedTime;
    }

    public Date getCdUpdatedTime() {
        return cdUpdatedTime;
    }

    public void setCdUpdatedTime(Date cdUpdatedTime) {
        this.cdUpdatedTime = cdUpdatedTime;
    }

    public Integer getCdUpdatedBy() {
        return cdUpdatedBy;
    }

    public void setCdUpdatedBy(Integer cdUpdatedBy) {
        this.cdUpdatedBy = cdUpdatedBy;
    }

    public Integer getCdCreatedBy() {
        return cdCreatedBy;
    }

    public void setCdCreatedBy(Integer cdCreatedBy) {
        this.cdCreatedBy = cdCreatedBy;
    }

    public Boolean getIsCd() {
        return isCd;
    }

    public void setIsCd(Boolean isCd) {
        this.isCd = isCd;
    }

    public String getCdRemark() {
        return cdRemark;
    }

    public void setCdRemark(String cdRemark) {
        this.cdRemark = cdRemark == null ? null : cdRemark.trim();
    }
}