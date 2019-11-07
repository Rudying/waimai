package com.woniu.domain;

import java.io.Serializable;

public class Element implements Serializable {
    private Integer eid;

    private Integer oid;

    private String fname;

    private Double fprice;

    private String fphoto;

    private Integer ecount;

    private static final long serialVersionUID = 1L;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    public Double getFprice() {
        return fprice;
    }

    public void setFprice(Double fprice) {
        this.fprice = fprice;
    }

    public String getFphoto() {
        return fphoto;
    }

    public void setFphoto(String fphoto) {
        this.fphoto = fphoto == null ? null : fphoto.trim();
    }

    public Integer getEcount() {
        return ecount;
    }

    public void setEcount(Integer ecount) {
        this.ecount = ecount;
    }
}