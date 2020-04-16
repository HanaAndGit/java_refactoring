package java_refactoring.dto;

import java.util.List;

public class TextStatement extends Statement {
	public String value(Customer customer) {
		List<Rental> rentals = customer.getRentals();
		//StringBuilder result = new StringBuilder(customer.getName() + " ������ �뿩 ��� \n");
		StringBuilder result = new StringBuilder();
		
		result.append(headerString(customer));
		//���� ������ �뿩�� ���
		for(Rental each : rentals) {
			//�̹��� �뿩�ϴ� ���� ������ �뿩�Ḧ���
			//result.append("\t" + each.getMovie().getTitle());
			//result.append("\t" + String.valueOf(each.getCharge()) + "\n");
			result.append(eachRentalString(each));
		}//end of for-loop
		
		//Ǫ���� �߰�
		//result.append("���� �뿩�� : "  + String.valueOf(customer.getTotalCharge()) + "\n");
		//result.append("���� ����Ʈ : " + String.valueOf(customer.getTotalFrequentRentalPoints()));
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
