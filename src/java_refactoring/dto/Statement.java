package java_refactoring.dto;

import java.util.List;

public abstract class Statement {
	String value(Customer aCustomer) {
		List<Rental> rentals = aCustomer.getRentals();
		StringBuilder result = new StringBuilder();
		
		result.append(headerString(aCustomer));
		
		for(Rental each: rentals) {
			result.append(eachRentalString(each));
		}
		
		result.append(footerString(aCustomer));
		return result.toString();
	}
	
	abstract String headerString(Customer aCustomer);
	abstract String eachRentalString(Rental aRental);
	abstract String footerString(Customer aCustomer);
}
