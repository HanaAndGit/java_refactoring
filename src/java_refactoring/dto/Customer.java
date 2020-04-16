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
	
	public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		
		StringBuilder result = new StringBuilder(getName() + " ������ �뿩 ���\n"
				+ ""
				+ ""
				+ "");
		
		for(Rental each : rentals) {
			
			double thisAmount = each.getCharge();

			//���� ����Ʈ�� 1����Ʈ ����
			frequentRenterPoints++;
			//�ֽŹ��� ��Ʋ �̻� �뿩�ϸ� ���ʽ� ����Ʈ ����
			if((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && 
				each.getDaysRented() > 1) {
				frequentRenterPoints++;
			}
			//�̹��� �뿩�ϴ� ���� ������ �뿩�Ḧ ���
			result.append("\t" + each.getMovie().getTitle());
			result.append("\t"+ String.valueOf(thisAmount) + "\n");
			
			//������� ������ �� �뿩��
			totalAmount += thisAmount;
		}//end of for-loop
		
		//Ǫ���� �߰�
		result.append("���� �뿩�� : " + String.valueOf(totalAmount) + "\n");
		result.append("���� ����Ʈ : " + String.valueOf(frequentRenterPoints));
		
		return result.toString();
		
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
