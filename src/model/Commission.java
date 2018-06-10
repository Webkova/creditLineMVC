package model;

public class Commission {
	
	private int commission;
	private String concept;
	private double minAmount;
	private double maxAmount;
	private double charge;
	private double amount;
	private String currency;
	private String creationDate;
	private String modificationDate;
	
	public Commission() {
		
	}
		
	public Commission(String concept, double minAmount, double maxAmount, double charge, double amount, String currency) {
		this.concept = concept;
		this.minAmount = minAmount;
		this.maxAmount = maxAmount;
		this.charge = charge;
		this.amount = amount;
		this.currency = currency;
	}
	public int getCommission() {
		return commission;
	}
	public void setCommission(int commission) {
		this.commission = commission;
	}
	public String getConcept() {
		return concept;
	}
	public void setConcept(String concept) {
		this.concept = concept;
	}
	public double getMinAmount() {
		return minAmount;
	}
	public void setMinAmount(double minAmount) {
		this.minAmount = minAmount;
	}
	public double getMaxAmount() {
		return maxAmount;
	}
	public void setMaxAmount(double maxAmount) {
		this.maxAmount = maxAmount;
	}
	public double getCharge() {
		return charge;
	}
	public void setCharge(double charge) {
		this.charge = charge;
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
		return "Commission [commission=" + commission + ", concept=" + concept + ", minAmount=" + minAmount
				+ ", maxAmount=" + maxAmount + ", charge=" + charge + ", amount=" + amount + ", currency=" + currency
				+ ", creationDate=" + creationDate + ", modificationDate=" + modificationDate + "]";
	}

}
