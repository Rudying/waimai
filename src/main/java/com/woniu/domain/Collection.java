package com.woniu.domain;

import java.io.Serializable;
import java.util.Date;

public class Collection implements Serializable {
    private Integer coid;

    private Integer uid;

    private Integer sid;

    private Date ctime;
    
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

    public Integer getCoid() {
        return coid;
    }

    public void setCoid(Integer coid) {
        this.coid = coid;
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

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}