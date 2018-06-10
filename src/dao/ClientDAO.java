package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import model.Client;
import util.SqlConnection;

public class ClientDAO {
	
	public void createClient(Client client) {	
		Statement stm= null;
		Connection con=null;
		Instant currTimeStamp = Instant.now();
		
		String sql="INSERT INTO client (name, surname, address, nationality, creationDate) values ('"+
				client.getName()+"','"+client.getSurname()+"','"+
				client.getAddress()+"','"+client.getNationality()+"','"+currTimeStamp+"')";	
		try {			
			con=SqlConnection.connect();
			stm= con.createStatement();
			stm.execute(sql);
			stm.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Error ClientDAO connection");
			e.printStackTrace();
		}
	}
	
	
	public List<Client> getClients() {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		String sql="SELECT * FROM CLIENT ORDER BY IDCLIENT";
		
		List<Client> clientList= new ArrayList<Client>();
		
		try {			
			co= SqlConnection.connect();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Client c = new Client();
				c.setIdClient(rs.getInt(1));
				c.setName(rs.getString(2));
				c.setSurname(rs.getString(3));
				c.setAddress(rs.getString(4));
				c.setNationality(rs.getString(5));
				c.setCreationDate(rs.getString(6));
				c.setModificationDate(rs.getString(7));
				clientList.add(c);
			}
			stm.close();
			rs.close();
			co.close(); 
		} catch (SQLException e) {
			System.out.println("Error getClients connection");
			e.printStackTrace();
		}
		
		return clientList;
	}
	
	public List<Client> getClientsWithAccounts() {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		String sql="SELECT DISTINCT(idClient), name, surname, address, nationality"
				+ " FROM CLIENT INNER JOIN ACCOUNT on client.idClient = account.client_idClient";
		
		List<Client> clientList= new ArrayList<Client>();
		
		try {			
			co= SqlConnection.connect();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Client c = new Client();
				c.setIdClient(rs.getInt(1));
				c.setName(rs.getString(2));
				c.setSurname(rs.getString(3));
				c.setAddress(rs.getString(4));
				c.setNationality(rs.getString(5));
				clientList.add(c);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error getClientsWithAccounts connection");
			e.printStackTrace();
		}
		
		return clientList;
	}
}
