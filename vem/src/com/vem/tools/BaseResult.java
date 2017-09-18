package com.vem.tools;

import java.io.Serializable;

/**
 * 
 * TODO 返回信息基础bean
 * 
 * @author 王洪超
 * @date 2016年10月28日 上午9:39:06
 *
 */
public class BaseResult implements Serializable {

    private static final long serialVersionUID = -7855384890804340511L;
    private String resultcode;//返回码
    private String resultmsg;//返回信息
    private int userId;//返回信息

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getResultcode() {

        return resultcode;
    }

    public void setResultcode(String resultcode) {

        this.resultcode = resultcode;
    }

    public String getResultmsg() {

        return resultmsg;
    }

    public void setResultmsg(String resultmsg) {

        this.resultmsg = resultmsg;
    }

}
