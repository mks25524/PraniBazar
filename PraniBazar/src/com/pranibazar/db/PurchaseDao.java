package com.pranibazar.db;

import java.util.List;

import com.pranibazar.bean.PurchaseBean;

 

public interface PurchaseDao {
	public int insert(PurchaseBean pinfo );
	public int update(PurchaseBean pinfo );
	public List<PurchaseBean  > getAllRecord();
	public boolean getByCatagory(String catagory);
	public int delete(String Pid);

}
