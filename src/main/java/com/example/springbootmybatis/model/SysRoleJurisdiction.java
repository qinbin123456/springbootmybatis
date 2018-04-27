package com.example.springbootmybatis.model;

public class SysRoleJurisdiction {
    private String rjid;

    private String roleid;

    private String jurisid;

    public String getRjid() {
        return rjid;
    }

    public void setRjid(String rjid) {
        this.rjid = rjid == null ? null : rjid.trim();
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public String getJurisid() {
        return jurisid;
    }

    public void setJurisid(String jurisid) {
        this.jurisid = jurisid == null ? null : jurisid.trim();
    }
}