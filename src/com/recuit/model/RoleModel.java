package com.recuit.model;

/**
 * 角色model
 */
public class RoleModel {

    /**
     * 主键
     */
    private  String id;

    /**
     * 角色代码
     */
    private String key;

    /**
     * 角色名称
     */
    private String keyName;

    /**
     * 描述
     */
    private String describe;

    private boolean edit;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public boolean getEdit() {
        return edit;
    }

    public void setEdit(boolean edit) {
        this.edit = edit;
    }
}
