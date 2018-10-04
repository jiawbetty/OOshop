package com;
///�����Ҧ�

public class productDIS {
	private double price;
	private Discount discount;
	
	public void setPrice(double price) {
			this.price=price;
		
	}
	public void setDiscount(Discount discount) {
		this.discount=discount;
		
	}
	public double getPrice() {
		return discount.calculate(this.price);
		
	}
}
interface Discount{
		 public double calculate(double price);
	
}

class dis1 implements Discount{
	
	
	//buy x.y.z
	@Override
	public double calculate(double price) {
		System.out.println("buy x.y.z:");
		return price*0.95;
	}
}
class dis2 implements Discount{
	
	
	//buy 100��X
	@Override
	public double calculate(double price) {
		System.out.println("buy 100��X:");
		return price*0.85;
	}
}	
class dis3 implements Discount{
	
	
	//buy �W�L10�U
	@Override
	public double calculate(double price) {
		System.out.println("buy �W�L10�U:");
		return price*0.80;
	}
}	
class dis4 implements Discount{
	
	
	//buy 2��X�b��a
	@Override
	public double calculate(double price) {
		System.out.println("buy 2��X�b��a");
		return price;
	}
}	


