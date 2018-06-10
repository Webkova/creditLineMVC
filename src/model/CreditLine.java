package model;

public class CreditLine {

	private int reference;
	private double amount;
	private String currency;
	private String concept;
	private int idCommission;
	private int associatedAccount;
	private double limit;
	private int creditStatus;
	
	public CreditLine() {
		
	}
	
	public CreditLine(double amount, String currency, String concept, double limit, int idCommission,
			int associatedAccount) {
		this.amount = amount;
		this.currency = currency;
		this.concept = concept;
		this.idCommission = idCommission;
		this.associatedAccount = associatedAccount;
		this.limit = limit;
		this.creditStatus = 1;
	}
	
	public int getReference() {
		return reference;
	}
	public void setReference(int reference) {
		this.reference = reference;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getConcept() {
		return concept;
	}
	public void setConcept(String concept) {
		this.concept = concept;
	}
	public int getIdCommission() {
		return idCommission;
	}
	public void setIdCommission(int idCommission) {
		this.idCommission = idCommission;
	}
	public int getAssociatedAccount() {
		return associatedAccount;
	}
	public void setAssociatedAccount(int associatedAccount) {
		this.associatedAccount = associatedAccount;
	}
	public double getLimit() {
		return limit;
	}
	public void setLimit(double limit) {
		this.limit = limit;
	}
	public int getCreditStatus() {
		return creditStatus;
	}
	public void setCreditStatus(int creditStatus) {
		this.creditStatus = creditStatus;
	}

	@Override
	public String toString() {
		return "creditLine [reference=" + reference + ", amount=" + amount + ", currency=" + currency + ", concept="
				+ concept + ", idCommission=" + idCommission + ", associatedAccount=" + associatedAccount + ", limit="
				+ limit + ", creditStatus=" + creditStatus + "]";
	}	
}
