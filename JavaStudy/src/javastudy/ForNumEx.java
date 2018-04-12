package javastudy;

import java.util.Scanner;

public class ForNumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num; 
		int mulN;
		int sum = 0;
		System.out.println("배수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		 mulN = sc.nextInt();
		
		for(num = 1;num*mulN<20;num++){
				sum += mulN*num;
				
			}
		System.out.println(sum);
		System.out.println("*******");
		int mulN1 = 1; 
		for(num = 1;num*mulN1<20;num++){
			for(mulN1 =1;num*mulN1<20;mulN1++){
			if (mulN1!=2 && mulN1 !=3){
			sum += mulN1*num;
			}
			System.out.println(sum);
			}
			System.out.println(mulN1*num);
		}
		System.out.println(sum);
		}
		//왜 2의 배수와 3의 배수가 아닌값의 합이 안됐을가??? 젠자아아아아아ㅏㅇ     
		
	}
		
	
	
	
	
	
	

