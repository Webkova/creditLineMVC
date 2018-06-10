package creditLine;

import controller.AccountController;
import controller.ClientController;
import controller.CommissionController;
import controller.CreditLineController;

public class creditLineMVC {

	public static void creditLineTest() {		
		CreditLineController creditLineController = new CreditLineController();
		creditLineController.createCreditLine();
		creditLineController.getCreditLines();
	}

	public static void clientTest() {
		ClientController clientController = new ClientController();
		clientController.createClient();
		clientController.getClients();
		clientController.getClientsWithAccounts();
	}

	public static void testAccount() {
		AccountController accountController = new AccountController();
		accountController.createAccount();
		accountController.getAccounts();
	}

	public static void testCommission() {
		CommissionController commissionController = new CommissionController();
		commissionController.createCommission();
		commissionController.getCommissions();
	}

	public static void main(String[] args) {
		creditLineTest();
		clientTest();
		testAccount();
		testCommission();
	}

}