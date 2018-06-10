package view;

import java.util.List;

import model.Client;
import util.IO;

public class ClientView {
	
	public void readCliente(Client client) {
		System.out.println("Client Data: "+client);
	}
		
	public void getClients(List<Client> clients) {
		for (Client client : clients) {
			System.out.println("Client data: "+client);
		}		
	}
	
	public void getClientsWithAccounts(List<Client> clients) {
		for (Client client : clients) {
			System.out.println("getClientsWithAccounts data: "+client);
		}		
	}

	public Client createClient() {
		IO.instance().writeln("Introduce los datos para crear cliente");
		String name = IO.instance().readString("Nombre?  ");
		String surname = IO.instance().readString("Apellido?  ");
		String address = IO.instance().readString("Dirección?  ");
		String nationality = IO.instance().readString("Nationality?  ");
		
		return new Client(name, surname, address, nationality);
	}
}
