package com.pranibazar.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pranibazar.bean.ProductBean;


public class ProductDaoImpl implements ProductDetailsDao {

	Connection con=null;
	
	 

	public ProductDaoImpl(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public int insert(ProductBean stuinfo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(ProductBean stuinfo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ProductBean> getAllProduct() {
		List<ProductBean> list=new ArrayList<ProductBean>();
		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from product_details_25524");
			while(rs.next())
			{
				ProductBean pb=new ProductBean();
				pb.setPid(rs.getString(2));
				pb.setPname(rs.getString(3));
				pb.setPcatagory(rs.getString(4));
				pb.setPquantity(rs.getString(5));
				pb.setPrice(rs.getDouble(6));
				list.add(pb);
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	

	@Override
	public boolean getByCatagory(String catagory) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int delete(String Pid) {
		// TODO Auto-generated method stub
		return 0;
	}

}
