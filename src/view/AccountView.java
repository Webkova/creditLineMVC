package view;

import java.util.List;

import model.Account;
import util.IO;

public class AccountView {
	
	public void getAccounts(List<Account> accounts) {
		for (Account account : accounts) {
			System.out.println("Account data: "+account);
		}		
	}

	public Account createAccount() {
		IO.instance().writeln("Introduce los datos para crear una cuenta");
		int owner = Integer.parseInt(IO.instance().readString("Id cliente?  "));
		int accountType = Integer.parseInt(IO.instance().readString("Id tipo cuenta?  "));
		
		return new Account(owner, accountType);
	}
}
