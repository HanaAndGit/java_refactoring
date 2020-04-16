package java_refactoring.dto;

public class Movie {
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	public static final int CHILDREN =2;
	
	private String title;
	private int priceCode;
	public Movie(String title, int priceCode) {
		super();
		this.title = title;
		this.priceCode = priceCode;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPriceCode() {
		return priceCode;
	}
	public void setPriceCode(int priceCode) {
		this.priceCode = priceCode;
	}
	
	//Movie.REGULAR -> switch 문에서 movie 객체를 인자로 사용하고 있기 때문에 movie 클래스에 있어야함
	public double getCharge( int aDaysRented) {
		double result = 0;
		
		switch(getPriceCode()) {
		case Movie.REGULAR:
			result += 2;
			if(aDaysRented>2) {
				result += (aDaysRented -2) * 1.5;
			}
			break;
		case Movie.NEW_RELEASE:
			result += aDaysRented * 3;
			break;
		case Movie.CHILDREN:
			result += 1.5;
			if(aDaysRented>3) {
				result += (aDaysRented - 3) * 1.5;
			}
			break;
		}
		return result;
	}
	
	public int getFrequentPoints(int daysRented) {//최신물이고 대여 일 수가 1일 이상이면 포인트 2 
		if((getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1) {
			return 2;
		}else {//아니면 포인트 1 
			return 1;
		}
	}
	
	
}
