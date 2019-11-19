package com.woniu.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

public class Shop implements Serializable {
	private Integer sid;

	private Integer uid;

	private String sname;

	private String sinfo;

	private String stel;

	private String saddress;

	private Date opentime;

	private Date closetime;

	private Integer sstatus;

	private Integer coin;

	private Set<Advice> advices;

	private Users users;

	private Set<Food> foods;

	private Set<Collection> collection;

	public Set<Collection> getCollection() {
		return collection;
	}

	public void setCollection(Set<Collection> collection) {
		this.collection = collection;
	}

	public Set<Food> getFoods() {
		return foods;
	}

	public void setFoods(Set<Food> foods) {
		this.foods = foods;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Set<Advice> getAdvices() {
		return advices;
	}

	public void setAdvices(Set<Advice> advices) {
		this.advices = advices;
	}

	private static final long serialVersionUID = 1L;

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname == null ? null : sname.trim();
	}

	public String getSinfo() {
		return sinfo;
	}

	public void setSinfo(String sinfo) {
		this.sinfo = sinfo == null ? null : sinfo.trim();
	}

	public String getStel() {
		return stel;
	}

	public void setStel(String stel) {
		this.stel = stel == null ? null : stel.trim();
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress == null ? null : saddress.trim();
	}

	public Date getOpentime() {
		return opentime;
	}

	public void setOpentime(Date opentime) {
		this.opentime = opentime;
	}

	public Date getClosetime() {
		return closetime;
	}

	public void setClosetime(Date closetime) {
		this.closetime = closetime;
	}

	public Integer getSstatus() {
		return sstatus;
	}

	public void setSstatus(Integer sstatus) {
		this.sstatus = sstatus;
	}

	public Integer getCoin() {
		return coin;
	}

	public void setCoin(Integer coin) {
		this.coin = coin;
	}
}