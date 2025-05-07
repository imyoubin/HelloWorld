package com.javaeax.hello01;

public class Att {
	//필드
	private String fillColor;
	private String lineColor;
	
	//생성자
	public Att() {
		
	}


	public Att(String fillColor, String lineColor) {
		
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	//메소드gs
	public String getFillColor() {
		return fillColor;
	}


	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}


	public String getLineColor() {
		return lineColor;
	}


	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	//메소드일반
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	
	
	public void draw() {
		System.out.println("Att.draw");
	}
	
	
}
