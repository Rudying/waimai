package com.woniu.domain;

import java.io.Serializable;

public class Type implements Serializable {
    private Integer tid;

    private String tname;

    private String tphoto;

    private String tinfo;

    private static final long serialVersionUID = 1L;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public String getTphoto() {
        return tphoto;
    }

    public void setTphoto(String tphoto) {
        this.tphoto = tphoto == null ? null : tphoto.trim();
    }

    public String getTinfo() {
        return tinfo;
    }

    public void setTinfo(String tinfo) {
        this.tinfo = tinfo == null ? null : tinfo.trim();
    }
}