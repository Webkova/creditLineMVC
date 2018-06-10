package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import model.Account;
import util.SqlConnection;

public class AccountDAO {
	
	public void createAccount(Account account) {	
		Statement stm= null;
		Connection con=null;
		Instant currTimeStamp = Instant.now();
		
		String sql="INSERT INTO account (accountType, accountStatus, client_idclient, creationDate) values ('"+account.getAccountType()+
				"','"+account.getAccountStatus()+"','"+account.getOwner()+"','"+currTimeStamp+"')";	
		try {			
			con=SqlConnection.connect();
			stm= con.createStatement();
			stm.execute(sql);
			stm.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Error AccountDAO connection");
			e.printStackTrace();
		}
	}
	
	public List<Account> getAccounts() {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		String sql="SELECT * FROM ACCOUNT ORDER BY IDACCOUNT";
		
		List<Account> accountList= new ArrayList<Account>();
		
		try {			
			co= SqlConnection.connect();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Account a = new Account();
				a.setIdAccount(rs.getInt(1));
				a.setAccountType(rs.getInt(2));
				a.setAccountStatus(rs.getInt(3));
				a.setCreationDate(rs.getString(4));
				a.setModificationDate(rs.getString(5));
				a.setOwner(rs.getInt(6));
				accountList.add(a);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error getAccounts connection");
			e.printStackTrace();
		}
		
		return accountList;
	}

}
