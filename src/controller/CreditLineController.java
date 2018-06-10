package controller;

import java.util.ArrayList;
import java.util.List;

import dao.CreditLineDAO;
import model.CreditLine;
import view.CreditLineView;

public class CreditLineController {

private CreditLineView creditLineView = new CreditLineView();
	
	public void createCreditLine() {
		CreditLineDAO creditLineDao = new CreditLineDAO();
		CreditLine creditLine = creditLineView.createCreditLine();
		creditLineDao.createCreditLine(creditLine);
	}

	public void getCreditLines(){
		List<CreditLine> creditLines = new ArrayList<CreditLine>();
		CreditLineDAO dao= new  CreditLineDAO();
		creditLines=dao.getCreditLines();
		creditLineView.getCreditLines(creditLines);
	}
}
