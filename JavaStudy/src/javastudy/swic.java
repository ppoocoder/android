package javastudy;

import java.util.Scanner;

public class swic {

	public static void main(String[] args) {
		
	// �⺻ Switch
		System.out.println("���ڸ� �Է��ϼ���! (1~3����)");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		switch (num){
		case 1:
			System.out.println("sk");
			break;
		case 2:
			System.out.println("lg");
			break;
		case 3:
			System.out.println("kt");
			break;
		default:
			System.out.println("unknown");
				
		}
		
		
		int month = 0;
		System.out.println("���� �Է��ϼ���.");
		month =sc.nextInt();
		switch(month) {
			case 3: case 4: case 5:		
				System.out.println("��");
				break;
				
			case 6: case 7: case 8:	
				System.out.println("����");
				break;
				
			case 9: case 10: case 11:	
				System.out.println("����");
				break;
				
			case 12: case 1: case 2:		
				System.out.println("�ܿ�");
				break;
			default:
				System.out.println("�߸� �Է��ϼ˽��ϴ�.");
		}
	
		
		int score = 0 ;
		System.out.println("������ �԰��ϼ���");
		
		score = sc.nextInt();
		
		switch(score/10){
		case 10: case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			
		}
	}

}
