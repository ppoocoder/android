package javastudy;

import java.util.Scanner;

public class ForNumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num; 
		int mulN;
		int sum = 0;
		System.out.println("����� �Է��ϼ���");
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
		//�� 2�� ����� 3�� ����� �ƴѰ��� ���� �ȵ�����??? ���ھƾƾƾƾƤ���     
		
	}
		
	
	
	
	
	
	

