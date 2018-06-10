package model;

public class Account {

	private int idAccount;
	private int owner;
	private int accountType;
	private String creationDate;
	private String modificationDate;
	private int accountStatus;

	public Account() {
		
	}
	
	public Account(int owner, int accountType) {
		this.owner = owner;
		this.accountType = accountType;
		this.accountStatus = 0;
	}
	
	public int getIdAccount() {
		return idAccount;
	}
	public void setIdAccount(int idAccount) {
		this.idAccount = idAccount;
	}
	public int getOwner() {
		return owner;
	}
	public void setOwner(int owner) {
		this.owner = owner;
	}
	public int getAccountType() {
		return accountType;
	}
	public void setAccountType(int accountType) {
		this.accountType = accountType;
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
	public int getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(int accountStatus) {
		this.accountStatus = accountStatus;
	}

	@Override
	public String toString() {
		return "Account [idAccount=" + idAccount + ", owner=" + owner + ", accountType=" + accountType
				+ ", creationDate=" + creationDate
				+ ", modificationDate=" + modificationDate + ", accountStatus=" + accountStatus + "]";
	}
	
	
	
}
