package com.example.springbootmybatis.model;

public class SysJurisdiction {
    private String jurisid;

    private String name;

    private String descritpion;

    private String url;

    private String pid;

    private Integer sort;

    public String getJurisid() {
        return jurisid;
    }

    public void setJurisid(String jurisid) {
        this.jurisid = jurisid == null ? null : jurisid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescritpion() {
        return descritpion;
    }

    public void setDescritpion(String descritpion) {
        this.descritpion = descritpion == null ? null : descritpion.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}