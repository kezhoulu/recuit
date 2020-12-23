package com.recuit.model;

import com.recuit.aop.annotation.DateConvert;
import com.recuit.aop.annotation.UserConvert;

import java.util.Date;

/**
 * 岗位申请表
 */
public class PositionSqModel {
    private String id;
    private String userId;


    private String positionId;

    private String userName;

    private Date sqrq;
    private String sqgw;

    @UserConvert
    private String sqgs;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getSqrq() {
        return sqrq;
    }

    public void setSqrq(Date sqrq) {
        this.sqrq = sqrq;
    }

    public String getSqgw() {
        return sqgw;
    }

    public void setSqgw(String sqgw) {
        this.sqgw = sqgw;
    }

    public String getSqgs() {
        return sqgs;
    }

    public void setSqgs(String sqgs) {
        this.sqgs = sqgs;
    }
}
