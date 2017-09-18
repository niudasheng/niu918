package com.vem.tools;
import java.io.Serializable;
/**
 * 查询红包需要返回一个int类型的数据
 *
 * @黄凯利
 */
public class UsercenterBaseResult implements Serializable{

    private static final long serialVersionUID = -7855384890804340511L;
    private String resultcode;
    private String resultmsg;
    private int count;
    private String imgpath;
    public String getImgpath() {
        return imgpath;
    }
    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
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
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    
}
