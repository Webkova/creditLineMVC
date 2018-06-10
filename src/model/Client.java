package model;

public class Client {
	
	private int idClient;
	private String name;
	private String surname;
	private String address;
	private String nationality;
	private String creationDate;
	private String modificationDate;
	
	public Client() {
	}
	
	public Client(String name, String surname, String address, String nationality) {
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.nationality = nationality;
	}
	public int getIdClient() {
		return idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public String getModificationDate() {
		return modificationDate;
	}
	public void setModificationDate(String modificationDate) {
		this.modificationDate = modificationDate;
	}

	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", name=" + name + ", surname=" + surname + ", address=" + address
				+ ", nationality=" + nationality + ", creationDate=" + creationDate + ", modificationDate="
				+ modificationDate + "]";
	}
	

}
