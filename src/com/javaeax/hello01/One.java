package com.javaeax.hello01;

public class One extends Att{
	//메소드
	private int radius;
	//생성자
	public One() {
	}

	public One(String fillColor, String lineColor,int radius) {
		super(fillColor,lineColor);
		this.radius = radius;
	}
	//메소드gs
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	//메소드일반
	@Override
	public String toString() {
		return "One [radius=" + radius + ", getRadius()=" + getRadius() + "]";
	}
	public void draw() {
		System.out.println("====원 을 그렸습니다=============");
				System.out.println("반지름:" + radius);
		System.out.println("면색:" + super.getFillColor());
		System.out.println("선색:" + super.getLineColor());
		System.out.println("================================");
	}
	
	

}
