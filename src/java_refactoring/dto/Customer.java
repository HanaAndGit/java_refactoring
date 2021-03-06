package java_refactoring.dto;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private List<Rental> rentals = new ArrayList<>();
	
	public Customer(String name) {
		super();
		this.name = name;
	}
	
	public void addRental(Rental aRental) {
		this.rentals.add(aRental);
	}

	public String getName() {
		return name;
	}
	
	
//	public String htmlStatement() {
//		//double totalAmount = 0;
//	//	int frequentRenterPoints = 0;
//		
////		StringBuilder result = new StringBuilder(getName() + " 고객님의 대여 기록\n"
////				+ ""
////				+ ""
////				+ "");
//		
//		//StringBuilder result = new StringBuilder("<H1><EM>" + getName() + "고객님의 대여 기록 </EM><H1><P>\n"); 
//		
//		//for(Rental each : rentals) {
//			
//			//double thisAmount = each.getCharge();
//
//			//적립 포인트를 1포인트 증가
//			//frequentRenterPoints++;
//			//최신물을 이틀 이상 대여하면 보너스 포인트 지급
////			if((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && 
////				each.getDaysRented() > 1) {
////				frequentRenterPoints++;
////			}
//			//frequentRenterPoints += each.getFrequentPoints();
//			//frequentRenterPoints += each.getFrequentRentalPoints();
//			//이번에 대여하는 비디오 정보와 대여료를 출력
//			//result.append("\t" + each.getMovie().getTitle() + ": ");
//			//result.append("\t"+ String.valueOf(thisAmount) + "\n");
//			//result.append("\t" + String.valueOf(each.getCharge()) + "<br>\n");
//			
//			//현재까지 누적된 총 대여료
//			//totalAmount += thisAmount;
//			//totalAmount += each.getCharge();
//		//}//end of for-loop
//		
//		//푸터행 추가
//		//result.append("누적 대여료 : " + String.valueOf(totalAmount) + "\n");
//	//	result.append("<p>누적 대여료 : <EM>");
//		//result.append(String.valueOf(getTotalCharge()) + "</EM>\n");
//		//result.append("<p>적립 포인트 : <EM>");
//		//result.append(String.valueOf(frequentRenterPoints) + "</EM><p>");
//		
//	//	return result.toString();
//
//		return new HtmlStatement().value(this);
//	}
	
	
	public double getTotalCharge() {
		double result = 0;
		for(Rental rental : rentals) {
			result += rental.getCharge();
		}
		return result;
	}
	
	
	public int getTotalFrequentRentalPoints() {
		int result = 0;
		for(Rental rental : rentals) {
			result += rental.getFrequentRentalPoints();
		}
		return result;
	}
	
	public List<Rental> getRentals(){
		return this.rentals;
	}
	
	public String htmlStatement() {
		return new HtmlStatement().value(this);
	}
	
	public String statement() {
		return new TextStatement().value(this);
	}
	
//	private double amountFor(Rental aRental) {
//		double thisAmount = 0;
//		
//		switch(aRental.getMovie().getPriceCode()) {
//		case Movie.REGULAR:
//			thisAmount += 2;
//			if(aRental.getDaysRented()>2) {
//				thisAmount += (aRental.getDaysRented() -2) * 1.5;
//			}
//			break;
//		case Movie.NEW_RELEASE:
//			thisAmount += aRental.getDaysRented() * 3;
//			break;
//		case Movie.CHILDREN:
//			thisAmount += 1.5;
//			if(aRental.getDaysRented()>3) {
//				thisAmount += (aRental.getDaysRented() - 3) * 1.5;
//			}
//			break;
//		}
//		return thisAmount;
//	}
//	
	
}
