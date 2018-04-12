package javastudy;

import java.util.Scanner;

public class whileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int count= 0;
		int n =0;
		int sum =0;
		double avg =0;
		
		System.out.println("정수를 입력하고 마지막에 0을 입력");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		while(n!=0){
			sum+=n;
			count++;
			
			n=sc.nextInt();
		}
		avg=sum/count;
		System.out.println(" 개의 합을 계산하였습니다.");
		System.out.println("더한 값음 " +sum+"입니다.");
		System.out.println("입력한 값들의 평균은 " +avg+ "입니다.");
	}

	
	
	
}
 

