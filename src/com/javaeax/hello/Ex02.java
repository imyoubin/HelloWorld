package com.javaeax.hello;

public class Ex02 {
	
	public static void main(String[] args) {
		
		double num[] = new double[5];
		
		num[0] = (double)(Math.random()*20)+1;
		num[1] = (double)(Math.random()*20)+1;
		num[2] = (double)(Math.random()*20)+1;
		num[3] = (double)(Math.random()*20)+1;
		num[4] = (double)(Math.random()*20)+1;
		
		for(int i=0; i<5; i++) {
			System.out.println(num[i]);
		}
	}

}
