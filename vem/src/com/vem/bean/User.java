package com.vem.bean;

import java.util.Date;
/**
 *
 * 用户信息
 *
 * @author niuchenyang
 *
 */
public class User {
    private Integer userId;

    private Integer userGender;

    private String userTelephoneNumbei;

    private String userName;

    private String userPassword;

    private String userChineseName;

    private String userEmailAddress;

    private Date userCreatedTime;

    private Date userUpdatedTime;

    private Date userLastLoginTime;

    private Integer userUpdatedBy;

    private Integer userCreatedBy;

    private Boolean isUser;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserGender() {
        return userGender;
    }

    public void setUserGender(Integer userGender) {
        this.userGender = userGender;
    }

    public String getUserTelephoneNumbei() {
        return userTelephoneNumbei;
    }

    public void setUserTelephoneNumbei(String userTelephoneNumbei) {
        this.userTelephoneNumbei = userTelephoneNumbei == null ? null : userTelephoneNumbei.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserChineseName() {
        return userChineseName;
    }

    public void setUserChineseName(String userChineseName) {
        this.userChineseName = userChineseName == null ? null : userChineseName.trim();
    }

    public String getUserEmailAddress() {
        return userEmailAddress;
    }

    public void setUserEmailAddress(String userEmailAddress) {
        this.userEmailAddress = userEmailAddress == null ? null : userEmailAddress.trim();
    }

    public Date getUserCreatedTime() {
        return userCreatedTime;
    }

    public void setUserCreatedTime(Date userCreatedTime) {
        this.userCreatedTime = userCreatedTime;
    }

    public Date getUserUpdatedTime() {
        return userUpdatedTime;
    }

    public void setUserUpdatedTime(Date userUpdatedTime) {
        this.userUpdatedTime = userUpdatedTime;
    }

    public Date getUserLastLoginTime() {
        return userLastLoginTime;
    }

    public void setUserLastLoginTime(Date userLastLoginTime) {
        this.userLastLoginTime = userLastLoginTime;
    }

    public Integer getUserUpdatedBy() {
        return userUpdatedBy;
    }

    public void setUserUpdatedBy(Integer userUpdatedBy) {
        this.userUpdatedBy = userUpdatedBy;
    }

    public Integer getUserCreatedBy() {
        return userCreatedBy;
    }

    public void setUserCreatedBy(Integer userCreatedBy) {
        this.userCreatedBy = userCreatedBy;
    }

    public Boolean getIsUser() {
        return isUser;
    }

    public void setIsUser(Boolean isUser) {
        this.isUser = isUser;
    }
}