package java_refactoring.dto;

public abstract class Price {
	abstract int getPriceCode();
	abstract double getCharge(int daysRented);

	
public int getFrequentPoints(int daysRented) {
	return 1;
}
//	public int getFrequentPoints(int daysRented) {//�ֽŹ��̰� �뿩 �� ���� 1�� �̻��̸� ����Ʈ 2 
//		if((getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1) {
//			return 2;
//		}else {//�ƴϸ� ����Ʈ 1 
//			return 1;
//		}
//	}
	
//	public double getCharge(int daysRented) {
//		double result = 0;
//		
//		switch(getPriceCode()) {
//		case Movie.REGULAR:
//			result += 2;
//			if(daysRented>2) {
//				result += (daysRented -2) * 1.5;
//			}
//			break;
//		case Movie.NEW_RELEASE:
//			result += daysRented * 3;
//			break;
//		case Movie.CHILDREN:
//			result += 1.5;
//			if(daysRented>3) {
//				result += (daysRented - 3) * 1.5;
//			}
//			break;
//		}
//		return result;
//	}
}
