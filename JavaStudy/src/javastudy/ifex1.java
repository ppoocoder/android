package javastudy;

import java.util.Scanner;

public class ifex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("���̸� �Է��ϼ���>>>");
		int ages = sc.nextInt();

		if ((ages >= 20) && (ages < 30)) {
			System.out.println("20���Դϴ�.");
		} else {
			System.out.println("20�밡 �ƴմϴ�.");
		}

		System.out.println("������ �Է��ϼ���!!!>>>");

		int score = sc.nextInt();
		char grade;
		if (score >= 90) {
			grade = 'A';

		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else if (score >= 50) {
			grade = 'E';
		} else {
			grade = 'F';
		}

		System.out.println("�Է��� ������ ������ :" + grade);
		
	
		
		
		System.out.println("�г��� �Է��ϼ���! >>>");
		int years =sc.nextInt();
		
		if(score >=60) {
			if(years != 4){
				System.out.println("�հ�");
			}else if (score >=70){
				System.out.println("�հ�");
			}else{
				System.out.println("���հ�");
			}
			
		}else {
			System.out.println("���հ�");
		}
		
		
		
	}

}
