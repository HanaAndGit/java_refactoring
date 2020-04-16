package java_refactoring.dto;

import java.util.List;

public class TextStatement extends Statement {
	public String value(Customer customer) {
		List<Rental> rentals = customer.getRentals();
		//StringBuilder result = new StringBuilder(customer.getName() + " 고객님의 대여 기록 \n");
		StringBuilder result = new StringBuilder();
		
		result.append(headerString(customer));
		//비디오 종류별 대여료 계산
		for(Rental each : rentals) {
			//이번에 대여하는 비디오 정보와 대여료를출력
			//result.append("\t" + each.getMovie().getTitle());
			//result.append("\t" + String.valueOf(each.getCharge()) + "\n");
			result.append(eachRentalString(each));
		}//end of for-loop
		
		//푸터행 추가
		//result.append("누적 대여료 : "  + String.valueOf(customer.getTotalCharge()) + "\n");
		//result.append("적립 포인트 : " + String.valueOf(customer.getTotalFrequentRentalPoints()));
		result.append(footerString(customer));
		return result.toString();
	}

	@Override
	String headerString(Customer aCustomer) {
		return String.format("%s 고객님의 대여 기록 %n", aCustomer.getName());
	}

	@Override
	String eachRentalString(Rental aEach) {
		return String.format("\t%s\t%s%n", aEach.getMovie().getTitle(), aEach.getCharge());
	}

	@Override
	String footerString(Customer aCustomer) {
		return String.format("누적 대여료 : %s%n적립 포인트 : %s", aCustomer.getTotalCharge(), aCustomer.getTotalFrequentRentalPoints());
	}
	
	
}
