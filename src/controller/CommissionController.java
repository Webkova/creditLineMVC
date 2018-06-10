package controller;

import java.util.ArrayList;
import java.util.List;

import dao.CommissionDAO;
import model.Commission;
import view.CommissionView;

public class CommissionController {
	private CommissionView commissionView = new CommissionView();
	
	public void createCommission() {
		CommissionDAO commissionDao = new CommissionDAO();
		Commission commission = commissionView.createCommission();
		commissionDao.createCommission(commission);
	}

	public void getCommissions(){
		List<Commission> commissions = new ArrayList<Commission>();
		CommissionDAO dao= new  CommissionDAO();
		commissions=dao.getCommissions();
		commissionView.getCommissions(commissions);
	}
	

}
