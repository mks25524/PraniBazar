package com.pranibazar.bean;

import java.io.InputStream;

public class ProductBean {
 
  private String pid;
  private String pname;
  private String pcatagory;
  private String pquantity;
  private double price;
  private InputStream pimage;
public ProductBean() {
	super();
	// TODO Auto-generated constructor stub
}
public ProductBean( String pid, String pname, String pcatagory, String pquantity, double price, InputStream pimage) {
	super();
	
	this.pid = pid;
	this.pname = pname;
	this.pcatagory = pcatagory;
	this.pquantity = pquantity;
	this.price = price;
	this.pimage = pimage;
}

public ProductBean(String pid, String pname, String pcatagory, String pquantity, double price) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.pcatagory = pcatagory;
	this.pquantity = pquantity;
	this.price = price;
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
public InputStream getPimage() {
	return pimage;
}
public void setPimage(InputStream pimage) {
	this.pimage = pimage;
}
 


}

