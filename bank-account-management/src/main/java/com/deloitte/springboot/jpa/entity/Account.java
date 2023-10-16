package com.deloitte.springboot.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="account")
public class Account {
	@Id
	@Column(name="accnumber")
	private int accnumber;
	@Column(name="accname")
	private String accname;
	@Column(name="acctype")
	private String acctype;
	@Column(name="accifsc")
	private String accifsc;
	@Column(name="accbranch")
	private String accbranch;
	@Column(name="acccity")
	private String acccity;
	@Column(name="accstatus")
	private String accstatus;
	public int getAccnumber() {
		return accnumber;
	}
	public void setAccnumber(int accnumber) {
		this.accnumber = accnumber;
	}
	public String getAccname() {
		return accname;
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
	public String getAccifsc() {
		return accifsc;
	}
	public void setAccifsc(String accifsc) {
		this.accifsc = accifsc;
	}
	public String getAccbranch() {
		return accbranch;
	}
	public void setAccbranch(String accbranch) {
		this.accbranch = accbranch;
	}
	public String getAcccity() {
		return acccity;
	}
	public void setAcccity(String acccity) {
		this.acccity = acccity;
	}
	public String getAccstatus() {
		return accstatus;
	}
	public void setAccstatus(String accstatus) {
		this.accstatus = accstatus;
	}
	public Account(int accnumber, String accname, String acctype, String accifsc, String accbranch, String acccity,
			String accstatus) {
		super();
		this.accnumber = accnumber;
		this.accname = accname;
		this.acctype = acctype;
		this.accifsc = accifsc;
		this.accbranch = accbranch;
		this.acccity = acccity;
		this.accstatus = accstatus;
	}
	
	public Account() {
		
	}
	
	
}
