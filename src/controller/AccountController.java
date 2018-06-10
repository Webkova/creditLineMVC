package controller;

import java.util.ArrayList;
import java.util.List;

import dao.AccountDAO;
import model.Account;
import view.AccountView;


public class AccountController {

	private AccountView accountView = new AccountView();
	
	public void createAccount() {
		AccountDAO accountDao = new AccountDAO();
		Account account = accountView.createAccount();
		accountDao.createAccount(account);
	}

	public void getAccounts(){
		List<Account> accounts = new ArrayList<Account>();
		AccountDAO dao= new  AccountDAO();
		accounts=dao.getAccounts();
		accountView.getAccounts(accounts);
	}	
}
