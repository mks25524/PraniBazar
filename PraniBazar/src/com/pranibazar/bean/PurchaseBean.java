package com.pranibazar.bean;

public class PurchaseBean {
	private String pid;
	  private String pname;
	  private String pcatagory;
	  private String pquantity;
	  private double price;
	  private String trnxid;
	  private String Address;
	  private String phone;
	  private String user;
	  private String status;
	 
	 
	 
	
	public PurchaseBean(String pid, String pname, String pcatagory, String pquantity, double price, String trnxid,
			String address, String phone, String user, String status ) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pcatagory = pcatagory;
		this.pquantity = pquantity;
		this.price = price;
		this.trnxid = trnxid;
		Address = address;
		this.phone = phone;
		this.user = user;
		this.status = status;
	
	}
	




	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public PurchaseBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPcatagory() {
		return pcatagory;
	}
	public void setPcatagory(String pcatagory) {
		this.pcatagory = pcatagory;
	}
	public String getPquantity() {
		return pquantity;
	}
	public void setPquantity(String pquantity) {
		this.pquantity = pquantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getTrnxid() {
		return trnxid;
	}
	public void setTrnxid(String trnxid) {
		this.trnxid = trnxid;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	  
	  
}
