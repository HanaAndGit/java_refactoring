package java_refactoring.dto;

public class Movie {
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	public static final int CHILDREN =2;
	
	private String title;
	private int priceCode;
	private Price price;
	public Movie(String title, int priceCode) {
		super();
		this.title = title;
		//this.priceCode = priceCode;
		setPriceCode(priceCode);
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
//	public void setPriceCode(int priceCode) {
//		this.priceCode = priceCode;
//	}
	
	public void setPriceCode(int aPriceCode) {
		switch(aPriceCode) {
		case REGULAR : 
				price = new RegularPrice();
				break; 
		case CHILDREN : 
			price = new ChildrenPrice();
			break; 
		case NEW_RELEASE : 
			price = new NewReleasePrice();
			break; 
		default:
			throw new IllegalArgumentException("���� �ڵ尡 �߸� �Ǿ����ϴ�.");
				
		}
	}
	
	public int getFrequentPoints(int daysRented) {
		return price.getFrequentPoints(daysRented);
	}
	
	//Movie.REGULAR -> switch ������ movie ��ü�� ���ڷ� ����ϰ� �ֱ� ������ movie Ŭ������ �־����
	public double getCharge(int daysRented) {
		return price.getCharge(daysRented);
//		double result = 0;
//		
//		switch(getPriceCode()) {
//		case Movie.REGULAR:
//			result += 2;
//			if(aDaysRented>2) {
//				result += (aDaysRented -2) * 1.5;
//			}
//			break;
//		case Movie.NEW_RELEASE:
//			result += aDaysRented * 3;
//			break;
//		case Movie.CHILDREN:
//			result += 1.5;
//			if(aDaysRented>3) {
//				result += (aDaysRented - 3) * 1.5;
//			}
//			break;
//		}
//		return result;
	}
	

	
	
}
