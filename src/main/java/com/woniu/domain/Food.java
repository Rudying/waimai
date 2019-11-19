package com.woniu.domain;

import java.io.Serializable;
import java.util.Set;

public class Food implements Serializable {
	private Integer fid;

	private Integer tid;

	private Integer sid;

	private String fname;

	private String finfo;

	private String fphoto;

	private Double fprice;

	private Shop shop;

	private Type type;

	private Set<Comment> comment;

	public Set<Comment> getComment() {
		return comment;
	}

	public void setComment(Set<Comment> comment) {
		this.comment = comment;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	private static final long serialVersionUID = 1L;

	public Integer getFid() {
		return fid;
	}

	public void setFid(Integer fid) {
		this.fid = fid;
	}

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
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

	public String getFinfo() {
		return finfo;
	}

	public void setFinfo(String finfo) {
		this.finfo = finfo == null ? null : finfo.trim();
	}

	public String getFphoto() {
		return fphoto;
	}

	public void setFphoto(String fphoto) {
		this.fphoto = fphoto == null ? null : fphoto.trim();
	}

	public Double getFprice() {
		return fprice;
	}

	public void setFprice(Double fprice) {
		this.fprice = fprice;
	}
}