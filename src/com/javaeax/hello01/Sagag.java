package com.javaeax.hello01;

public class Sagag extends Att{
	//필드
	private int width;
	private int height;
	
	//생성자
	public Sagag() {
		
	}


	public Sagag(String fillColor, String lineColor,int width, int height) {
		super(fillColor,lineColor);
		this.width = width;
		this.height = height;
	}

	//메소드gs
	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}

	//메소드일반
	@Override
	public String toString() {
		return "Sagag [width=" + width + ", height=" + height + ", getWidth()=" + getWidth() + ", getHeight()="
				+ getHeight() + "]";
	}
	
	public void draw() {
		System.out.println("====사각형을 그렸습니다=============");
		System.out.println("가로:" + width);
		System.out.println("세로:" + height);
		System.out.println("면색:" + super.getFillColor());
		System.out.println("선색:" + super.getLineColor());
		System.out.println("================================");
	}
	

}
