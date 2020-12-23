package com.recuit.model;

import com.recuit.aop.annotation.CodeConvert;
import com.recuit.aop.annotation.UserConvert;

public class PositionModel {
    /**
     * 主键
     */
    private String id;

    /**
     * 工作地点
     */
    private String gzdd;

    /**
     * 工作年限
     */
    private String gznx;

    /**
     * 招聘详情
     */
    private String zpxq;

    /**
     * 岗位名称
     */
    private String gwmc;

    /**
     * 所属公司
     */
    @UserConvert
    private String ssgs;

    /**
     * 状态
     */
    @CodeConvert(pid = "0001")
    private String zt;

    private boolean edit;

    public boolean getEdit(){
        return this.edit;
    }

    public void setEdit(boolean edit){
        this.edit = edit;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGzdd() {
        return gzdd;
    }

    public void setGzdd(String gzdd) {
        this.gzdd = gzdd;
    }

    public String getGznx() {
        return gznx;
    }

    public void setGznx(String gznx) {
        this.gznx = gznx;
    }

    public String getZpxq() {
        return zpxq;
    }

    public void setZpxq(String zpxq) {
        this.zpxq = zpxq;
    }

    public String getGwmc() {
        return gwmc;
    }

    public void setGwmc(String gwmc) {
        this.gwmc = gwmc;
    }

    public String getSsgs() {
        return ssgs;
    }

    public void setSsgs(String ssgs) {
        this.ssgs = ssgs;
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt;
    }
}
