package com.javaeax.hello01;

public class AttApp {

	public static void main(String[] args) {
		
		Att a01 = new Att("빨강", "검정");
		System.out.println(a01.toString());
		
		Samgag s01 = new Samgag("주황", "검정",10,10);
		//System.out.println(s01.toString());
		//s01.draw();
		Sagag s02 = new Sagag("노랑", "파랑",5,10);
		//System.out.println(s02.toString());
		//s02.draw();
		One o01 = new One("초록", "검정",5);
		//System.out.println(o01.toString());
		//o01.draw();
		
		Att sa = new Samgag("파랑","검정",100,100);
		
		Att sag = new Sagag("흰색","검정",50,50);
		
		Att on = new One("빨강","검정",50);
		
		Att[] attArrey = new Att[3];
		attArrey[0]=sa;
		attArrey[1]=sag;
		attArrey[2]=on;
		
		for(int i=0; i<attArrey.length; i++) {
			attArrey[i].draw();
		}
	}

}
