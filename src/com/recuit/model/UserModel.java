package com.recuit.model;

import com.recuit.aop.annotation.CodeConvert;

public class UserModel {
    private String id;

    private String userName;

    /**
     * 中文名
     */
    private String userNameCn;

    private String passWord;

    private String email;

    private String phoneNum;

    @CodeConvert(pid = "0001")
    private String status;

    private boolean edit ;

    @CodeConvert(pid = "0002")
    private String right;

    private String extId;

    /**
     * 毕业学校
     */
    private String byxx;

    /**
     * 工作简历
     */
    private String gzjl;

    /**
     * 建立保存的地址
     */
    private String jldz;

    /**
     * 出生年月
     */
    private String csny;

    private String ypgw;

    private String jlmc;

    public String getJlmc() {
        return jlmc;
    }

    public void setJlmc(String jlmc) {
        this.jlmc = jlmc;
    }

    public String getYpgw() {
        return ypgw;
    }

    public void setYpgw(String ypgw) {
        this.ypgw = ypgw;
    }

    public String getJldz() {
        return jldz;
    }

    public void setJldz(String jldz) {
        this.jldz = jldz;
    }

    public String getCsny() {
        return csny;
    }

    public void setCsny(String csny) {
        this.csny = csny;
    }

    public String getUserNameCn() {
        return userNameCn;
    }

    public void setUserNameCn(String userNameCn) {
        this.userNameCn = userNameCn;
    }

    public void setEdit(boolean edit) {
        this.edit = edit;
    }

    public String getExtId() {
        return extId;
    }

    public void setExtId(String extId) {
        this.extId = extId;
    }

    public String getByxx() {
        return byxx;
    }

    public void setByxx(String byxx) {
        this.byxx = byxx;
    }

    public String getGzjl() {
        return gzjl;
    }

    public void setGzjl(String gzjl) {
        this.gzjl = gzjl;
    }

    public boolean getEdit() {
        return edit;
    }


    public String getRight() {
        return right;
    }

    public void setRight(String right) {
        this.right = right;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
