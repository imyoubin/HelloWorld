package com.javaeax.hello;

public class Ex04 {

	public static void main(String[] args) {
		
		long[] l = new long[3];
		l[0] = (long)(Math.random()*100)+1;
		l[1] = (long)(Math.random()*100)+1;
		l[2] = (long)(Math.random()*100)+1;
		
		for(int i= 0; i<3; i++) {
			System.out.print(l[i]+"\t");
		}

	}

}
