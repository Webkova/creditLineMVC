package view;

import java.util.List;

import model.Commission;
import util.IO;

public class CommissionView {
	
	public void getCommissions(List<Commission> commissions) {
		for (Commission commission: commissions) {
			System.out.println("Commission data: "+commission);
		}		
	}
	
	public Commission createCommission() {
		IO.instance().writeln("Introduce los datos para crear una comisión");
		String concept = IO.instance().readString("Concepto?  ");
		Double minAmount = Double.parseDouble(IO.instance().readString("Cantidad mínima?  "));
		Double maxAmount = Double.parseDouble(IO.instance().readString("Cantidad máxima?  "));
		Double charge = Double.parseDouble(IO.instance().readString("porcentaje?  "));
		Double amount = Double.parseDouble(IO.instance().readString("Cantidad?  "));
		String currency = IO.instance().readString("Divisa?  ");
		
		return new Commission(concept, minAmount, maxAmount, charge, amount, currency);
	}
}
