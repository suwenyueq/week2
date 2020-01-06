package com.suwenyue.domain;

import java.math.BigInteger;

/**
 * @author 苏文越
 *
 * 2020年1月6日
 */
public class Column {
	private BigInteger pkid;
	private String pkgjz;
	private String pkms; 
	private String pkname;
	private String pkcp;
	private String pkadress;
	private String pkprice;
	private String pkctime;
	private String pketime;
	private String pkzt;
	private String pkbz;
	public BigInteger getPkid() {
		return pkid;
	}
	public void setPkid(BigInteger pkid) {
		this.pkid = pkid;
	}
	public String getPkgjz() {
		return pkgjz;
	}
	public void setPkgjz(String pkgjz) {
		this.pkgjz = pkgjz;
	}
	public String getPkms() {
		return pkms;
	}
	public void setPkms(String pkms) {
		this.pkms = pkms;
	}
	public String getPkname() {
		return pkname;
	}
	public void setPkname(String pkname) {
		this.pkname = pkname;
	}
	public String getPkcp() {
		return pkcp;
	}
	public void setPkcp(String pkcp) {
		this.pkcp = pkcp;
	}
	public String getPkadress() {
		return pkadress;
	}
	public void setPkadress(String pkadress) {
		this.pkadress = pkadress;
	}
	public String getPkprice() {
		return pkprice;
	}
	public void setPkprice(String pkprice) {
		this.pkprice = pkprice;
	}
	public String getPkctime() {
		return pkctime;
	}
	public void setPkctime(String pkctime) {
		this.pkctime = pkctime;
	}
	public String getPketime() {
		return pketime;
	}
	public void setPketime(String pketime) {
		this.pketime = pketime;
	}
	public String getPkzt() {
		return pkzt;
	}
	public void setPkzt(String pkzt) {
		this.pkzt = pkzt;
	}
	public String getPkbz() {
		return pkbz;
	}
	public void setPkbz(String pkbz) {
		this.pkbz = pkbz;
	}
	@Override
	public String toString() {
		return "Column [pkid=" + pkid + ", pkgjz=" + pkgjz + ", pkms=" + pkms + ", pkname=" + pkname + ", pkcp=" + pkcp
				+ ", pkadress=" + pkadress + ", pkprice=" + pkprice + ", pkctime=" + pkctime + ", pketime=" + pketime
				+ ", pkzt=" + pkzt + ", pkbz=" + pkbz + "]";
	} 
	
	
	
}
