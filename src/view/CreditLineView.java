package view;

import java.util.List;

import model.CreditLine;
import util.IO;

public class CreditLineView {
	
	public CreditLine createCreditLine() {
		IO.instance().writeln("Introduce los datos para crear una línea de crédito");
		Double amount = Double.parseDouble(IO.instance().readString("Cantidad?  "));
		String currency = IO.instance().readString("Divisa?  ");
		String concept = IO.instance().readString("Concepto?  ");
		Double limit = Double.parseDouble(IO.instance().readString("Límite?  "));
		int idCommission = Integer.parseInt(IO.instance().readString("Id comision?  "));
		int associatedAccount = Integer.parseInt(IO.instance().readString("Id cuenta?  "));
		
		return new CreditLine(amount, currency, concept, limit, idCommission, associatedAccount);
	}
	
	public void getCreditLines(List<CreditLine> creditLines) {
		for (CreditLine creditLine: creditLines) {
			System.out.println("CreditLines data: "+creditLine);
		}		
	}
}
