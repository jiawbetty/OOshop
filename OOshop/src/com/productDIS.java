package com;
///策略模式

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
	
	
	//buy 100件X
	@Override
	public double calculate(double price) {
		System.out.println("buy 100件X:");
		return price*0.85;
	}
}	
class dis3 implements Discount{
	
	
	//buy 超過10萬
	@Override
	public double calculate(double price) {
		System.out.println("buy 超過10萬:");
		return price*0.80;
	}
}	
class dis4 implements Discount{
	
	
	//buy 2件X在國家
	@Override
	public double calculate(double price) {
		System.out.println("buy 2件X在國家");
		return price;
	}
}	


