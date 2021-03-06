package java_refactoring.test;

import java_refactoring.dto.Customer;
import java_refactoring.dto.Movie;
import java_refactoring.dto.Rental;

public class TestMain {
	public static void main(String[] args) {
		Movie mc1 = new Movie("�ϸ� ã�Ƽ�", Movie.CHILDREN);
		Movie mc2 = new Movie("�����Ǽ�Ʈ", Movie.CHILDREN);
		Movie mr1 = new Movie("����", Movie.REGULAR);
		Movie mr2 = new Movie("��ȣ��", Movie.REGULAR);
		Movie mn1 = new Movie("�", Movie.NEW_RELEASE);
		Movie mn2 = new Movie("�ε����������", Movie.NEW_RELEASE);
		
		Rental r1 = new Rental(mc1, 3);
		Rental r2 = new Rental(mc2, 4);
		Rental r3 = new Rental(mr1, 2);
		Rental r4 = new Rental(mr2, 3);
		Rental r5 = new Rental(mn1, 2);
		Rental r6 = new Rental(mn2, 3);
		
		Customer c = new Customer("������");
		c.addRental(r1);
		c.addRental(r3);
		c.addRental(r5);
		
		Customer c1 = new Customer("����");
		c1.addRental(r2);
		c1.addRental(r4);
		c1.addRental(r6);
		
		System.out.println(c.htmlStatement());
		System.out.println();
		System.out.println(c1.htmlStatement());
	}
}
