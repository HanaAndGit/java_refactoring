package java_refactoring.dto;

import java.util.List;

public class HtmlStatement extends Statement {
	public String value(Customer customer) {
		List<Rental> rentals = customer.getRentals();
		//StringBuilder result = new StringBuilder("<H1><EM>" + customer.getName() +" ������ �뿩 ��� </EM></H1><P>/n");
		StringBuilder result = new StringBuilder();
		
		result.append(headerString(customer));
		
		for (Rental each : rentals) {
//			result.append(each.getMovie().getTitle() + ": ");
//			result.append(String.valueOf(each.getCharge()) + "<br>\n");
			result.append(eachRentalString(each));
		}//end of for loop
		
//		result.append("<p> ���� �뿩�� : <EM> ");
//		result.append(String.valueOf(customer.getTotalCharge()) + "</EM>\n");
//		
//		result.append("<p> ���� ����Ʈ  : <EM> ");
//		result.append(String.valueOf(customer.getTotalFrequentRentalPoints()) + "</EM>\n");
		result.append(footerString(customer));
		return result.toString();
	}
	
	@Override
	String headerString(Customer aCustomer) {
		return String.format("%s ������ �뿩 ��� %n", aCustomer.getName());
	}

	@Override
	String eachRentalString(Rental aEach) {
		return String.format("\t%s\t%s%n", aEach.getMovie().getTitle(), aEach.getCharge());
	}

	@Override
	String footerString(Customer aCustomer) {
		return String.format("���� �뿩�� : %s%n���� ����Ʈ : %s", aCustomer.getTotalCharge(), aCustomer.getTotalFrequentRentalPoints());
	}
}
