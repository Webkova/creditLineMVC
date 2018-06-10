package controller;

import java.util.ArrayList;
import java.util.List;

import dao.ClientDAO;
import model.Client;
import view.ClientView;

public class ClientController {
	
	private ClientView clientView = new ClientView();
	
	public void createClient() {
		ClientDAO clientDao = new ClientDAO();
		Client client = clientView.createClient();
		clientDao.createClient(client);
	}

	public void getClients(){
		List<Client> clients = new ArrayList<Client>();
		ClientDAO dao= new  ClientDAO();
		clients=dao.getClients();
		clientView.getClients(clients);
	}
	
	public void getClientsWithAccounts(){
		List<Client> clients = new ArrayList<Client>();
		ClientDAO dao= new  ClientDAO();
		clients=dao.getClientsWithAccounts();
		clientView.getClientsWithAccounts(clients);
	}
}
