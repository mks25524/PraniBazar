package com.pranibazar.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.pranibazar.bean.PurchaseBean;

public class PurchaseDaoImpl implements PurchaseDao {
	Connection con=null;
	
	 

	public PurchaseDaoImpl(Connection con) {
		super();
		this.con = con;
	}
	@Override
	public int insert(PurchaseBean pinfo) {
		// TODO Auto-generated method stub
				int status =0;
				try {
					PreparedStatement ps=con.prepareStatement("insert into purchase_details_25524(pid,pname,pcatagory,pquantity,price,trnxid,address,phone,user,status) values(?,?,?,?,?,?,?,?,?,?)");
					ps.setString(1, pinfo.getPid());
					ps.setString(2, pinfo.getPname());
					ps.setString(3, pinfo.getPcatagory());
					ps.setString(4, pinfo.getPquantity());
					ps.setDouble(5, pinfo.getPrice());
					ps.setString(6, pinfo.getTrnxid());
					ps.setString(7, pinfo.getAddress());
					ps.setString(8, pinfo.getPhone());
					ps.setString(9, pinfo.getUser());
					ps.setString(10, pinfo.getStatus());
				
					ps.execute();
					status=1;
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					status=0;
					e.printStackTrace();
				}
				return status;
			
	}

	@Override
	public int update(PurchaseBean pinfo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<PurchaseBean> getAllRecord() {
		// TODO Auto-generated method stub
		return null;
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
