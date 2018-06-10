package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Commission;
import util.SqlConnection;

public class CommissionDAO {

	public void createCommission(Commission commission) {	
		Statement stm= null;
		Connection con=null;
		
		String sql="INSERT INTO commission (concept, minAmount, maxAmount, charge, amount, currency) values "
				+ "('"+commission.getConcept()+"','"+commission.getMinAmount()+"','"+commission.getMaxAmount()
				+"','"+commission.getCharge()+"','"+commission.getAmount()+"','"+commission.getCurrency()+"')";	
		try {			
			con=SqlConnection.connect();
			stm= con.createStatement();
			stm.execute(sql);
			stm.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Error createCommission connection");
			e.printStackTrace();
		}
	}
	
	public List<Commission> getCommissions() {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		String sql="SELECT * FROM commission";
		
		List<Commission> commissionList= new ArrayList<Commission>();
		
		try {			
			co= SqlConnection.connect();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Commission c = new Commission();
				c.setCommission(rs.getInt(1));
				c.setConcept(rs.getString(2));
				c.setMinAmount(rs.getDouble(3));
				c.setMaxAmount(rs.getDouble(4));
				c.setCharge(rs.getDouble(5));
				c.setAmount(rs.getDouble(6));
				c.setCurrency(rs.getString(7));
				commissionList.add(c);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error getCommissions connection");
			e.printStackTrace();
		}
		
		return commissionList;
	}
}
