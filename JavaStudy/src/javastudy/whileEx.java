package javastudy;

import java.util.Scanner;

public class whileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int count= 0;
		int n =0;
		int sum =0;
		double avg =0;
		
		System.out.println("������ �Է��ϰ� �������� 0�� �Է�");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		while(n!=0){
			sum+=n;
			count++;
			
			n=sc.nextInt();
		}
		avg=sum/count;
		System.out.println(" ���� ���� ����Ͽ����ϴ�.");
		System.out.println("���� ���� " +sum+"�Դϴ�.");
		System.out.println("�Է��� ������ ����� " +avg+ "�Դϴ�.");
	}

	
	
	
}
 

