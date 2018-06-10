package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.CreditLine;
import util.SqlConnection;

public class CreditLineDAO {

	public void createCreditLine(CreditLine creditLine) {	
		Statement stm= null;
		Connection con=null;
		int initialState = 0;
		
		String sql="INSERT INTO creditLine (amount, currency, creditLinecol, creditState, commission_idcommission, account_idaccount) values ('"
				+ creditLine.getAmount()
				+ "','" + creditLine.getCurrency()
				+ "','" + creditLine.getConcept()
				+ "','" + initialState
				+ "','" + creditLine.getIdCommission()
				+ "','" + creditLine.getAssociatedAccount()
				+ "')";	
		
		try {			
			con=SqlConnection.connect();
			stm= con.createStatement();
			stm.execute(sql);
			stm.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Error createCreditLine connection");
			e.printStackTrace();
		}
	}
	
	public List<CreditLine> getCreditLines() {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		String sql="SELECT * FROM creditLine";
		
		List<CreditLine> creditLineList= new ArrayList<CreditLine>();
		
		try {			
			co= SqlConnection.connect();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				CreditLine c = new CreditLine();
				c.setReference(rs.getInt(1));
				c.setAmount(rs.getDouble(2));
				c.setCurrency(rs.getString(3));
				c.setConcept(rs.getString(4));
				c.setLimit(rs.getDouble(5));
				c.setCreditStatus(rs.getInt(6));
				c.setIdCommission(rs.getInt(7));
				c.setAssociatedAccount(rs.getInt(8));
				creditLineList.add(c);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error getCreditLines connection");
			e.printStackTrace();
		}
		
		return creditLineList;
	}
	
}
