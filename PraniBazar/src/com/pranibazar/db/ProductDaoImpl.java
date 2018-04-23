package com.pranibazar.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
	public int insert(ProductBean birdinfo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(ProductBean birdinfo) {
		int status=0;
		try {
			PreparedStatement p=con.prepareStatement("update product_details_25524 set pname=?,pcatagory=?,pquantity=?,price=? where pid=?");

			p.setString(1, birdinfo.getPname());
			p.setString(2, birdinfo.getPcatagory());
			p.setString(3, birdinfo.getPquantity());
			p.setDouble(4, birdinfo.getPrice());
			p.setString(5, birdinfo.getPid());
			status=p.executeUpdate();
		}catch (Exception e) {
			// TODO: handle exception
			status=0;
		}
		return status;
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
	public List<ProductBean> getByCatagory(String catagory) {
		List<ProductBean> list=new ArrayList<ProductBean>();
		try {
			/*Connection con=DBConn.getConn();*/
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from product_details_25524 where pcatagory=?");
			ProductBean pb=new ProductBean();
			pb.setPcatagory(catagory);
			while(rs.next())
			{
				
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
	public int delete(String Pid) {
		// TODO Auto-generated method stub
		return 0;
	}

}
