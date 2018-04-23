package com.pranibazar.db;

import java.util.List;

import com.pranibazar.bean.ProductBean;


public interface ProductDetailsDao {
	public int insert(ProductBean birdinfo);
	public int update(ProductBean birdinfo);
	public List<ProductBean> getAllProduct();
	public List<ProductBean> getByCatagory(String catagory);
	public int delete(String Pid);

}
