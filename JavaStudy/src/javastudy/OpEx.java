package javastudy;

import java.util.Scanner;

public class OpEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

	Scanner sc  = new Scanner(System.in);
	
	System.out.println("정수를 입력하세요");
		
	int time  = sc.nextInt();
	int second = time%60; 
	int minute =(time/60)%60;
	int hour = (time/60)/60;
	
	
	
	System.out.println(time+"초는 " +hour+"시" +minute+"분"+second+"초");
		
	
	System.out.println("입력한 값이 짝수인지 홀수인지 알아봅시다!!!!!");
	
	int input1 = sc.nextInt();
	
	String output1 =((input1%2)==0)? "짝수" : "홀수";
	System.out.println("입력한 값의 결과는 " +output1);
	
	
	
	
	}

}
