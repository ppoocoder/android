package javastudy;

import java.util.Scanner;

public class ArrayEx1 {
	public static void main(String[] args) {
				
		
		int score1 ,score2,score3;
		score1 = 100;
		score2 = 33;
		score3 = 55;
		
		int sum = score1+score2+score3;
		System.out.println(sum);

			
		int sum1 = 0;
		int[] scores ={100,33,55};
		for(int i=0; i<3; i++){
			sum1 += scores[i];
			
		System.out.println(sum1);
					
		
		}
		
		String[] name = new String[4];
		name[0] ="�̸�1";
		name[1] ="�̸�2";
		name[2] ="�̸�3";
		name[3] ="�̸�4";
		
		for(int i1= 0; i1<name.length;i1++){
			
			System.out.println(name[i1]);
			
		}
		Scanner scanner = new Scanner(System.in);
		int intArray[] = new int[5];
		int max = 0;
		
		System.out.println("5���� ������ �Է��ϼ���>>");
		
		for(int i2=0; i2 <intArray.length; i2++){
			intArray[i2] =scanner.nextInt();
			if(intArray[i2] >max){
				max = intArray[i2];
				
			}
		}
		
		System.out.println("���� ū ���� " +max+"�Դϴ�.");
		
		String f[] ={"��1","��2","��3"};
		for(String s: f){
			System.out.print( s +" , ");
			
			
			
	
		}
		
			
	
	

	int Array1[] = new int[5];

	System.out.println("���� 5�� �Է��ϼ���!!");
	for(int i3=0; i3<Array1.length; i3++){
		Array1[i3] = scanner.nextInt();
		
		if(Array1[i3]%3==0){
			System.out.println(Array1[i3]);
//			for(int i4=0;i4<A3.length;i4++){
//				A3[i4]=Array1[i3];
//			
//		}
		}
	}
	
	
	
	
	
	}
	}
	

