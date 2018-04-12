package javastudy;

import java.util.Scanner;

public class Op1 {

	
	public static void main (String[] args) {
		
		int remainder = 25%2;
		System.out.println("나머지는 " +remainder +"입니다.");
		
		
		//비교연산자
		
		int x = 0 , y = 1 ;
		boolean z;
		z= ((x<1)||(y--<1));
		
		System.out.println("결과는 : " +z);
		
		z= ((x<1)&&(y--<1));
		System.out.println("결과는  : " + z);
		
		
		//대입연산자
		
		int value=1;
		value += 2;
		
		System.out.println("result :" + value);
		
		value /=3;
		System.out.println("result :" + value);

		x=1;
		y=1;
		System.out.println("x = "+x+ " x+="+ x++);
		System.out.println("x = "+x+ " x-="+ x--);
		System.out.println("y = "+x+ " y+="+ y++);
		System.out.println("y = "+x+ " y-="+ y--);
		
		x=1;
		y=(x==1)? 10:20 ;
		System.out.println("결과는 :" +y);
		
		
		
		
		
		
		
	}
	
}
  