package com.javaeax.hello;

public class Ex01 {

	public static void main(String[] args) {
		
	int lottots[] = new int[6]; 	
	lottots[0] = (int)(Math.random()*45)+1;
	lottots[1] = (int)(Math.random()*45)+1;
	lottots[2] = (int)(Math.random()*45)+1;
	lottots[3] = (int)(Math.random()*45)+1;
	lottots[4] = (int)(Math.random()*45)+1;
	lottots[5] = (int)(Math.random()*45)+1;
	
	for(int i=0; i<6; i++) {
		System.out.println(lottots[i]);
	}

	}

}
