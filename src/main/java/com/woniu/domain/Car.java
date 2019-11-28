package com.woniu.domain;

import java.io.Serializable;

public class Car implements Serializable {
    private Integer caid;

    private Integer uid;

    private Integer sid;

    private String fname;

    private Double fprice;

    private String fphoto;

    private Integer ccount;
    
    private Users user;
    
    private Shop shop;
    
    public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	private static final long serialVersionUID = 1L;

    public Integer getCaid() {
        return caid;
    }

    public void setCaid(Integer caid) {
        this.caid = caid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
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

    public Integer getCcount() {
        return ccount;
    }

    public void setCcount(Integer ccount) {
        this.ccount = ccount;
    }

	@Override
	public String toString() {
		return "Car [caid=" + caid + ", fname=" + fname + ", fprice=" + fprice + ", ccount=" + ccount + "]";
	}
    
    
}