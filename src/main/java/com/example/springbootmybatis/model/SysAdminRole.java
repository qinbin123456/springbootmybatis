package com.example.springbootmybatis.model;

public class SysAdminRole {
    private String arid;

    private String adminid;

    private String roleid;

    public String getArid() {
        return arid;
    }

    public void setArid(String arid) {
        this.arid = arid == null ? null : arid.trim();
    }

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid == null ? null : adminid.trim();
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }
}