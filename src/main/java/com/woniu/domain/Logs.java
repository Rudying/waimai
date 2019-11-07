package com.woniu.domain;

import java.io.Serializable;
import java.util.Date;

public class Logs implements Serializable {
    private Integer lid;

    private Integer uid;

    private Date ltime;

    private String url;

    private String mehod;

    private String clientIp;

    private static final long serialVersionUID = 1L;

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getLtime() {
        return ltime;
    }

    public void setLtime(Date ltime) {
        this.ltime = ltime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getMehod() {
        return mehod;
    }

    public void setMehod(String mehod) {
        this.mehod = mehod == null ? null : mehod.trim();
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp == null ? null : clientIp.trim();
    }
}