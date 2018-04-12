package javastudy;

import java.util.Scanner;

public class ifex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요>>>");
		int ages = sc.nextInt();

		if ((ages >= 20) && (ages < 30)) {
			System.out.println("20대입니다.");
		} else {
			System.out.println("20대가 아닙니다.");
		}

		System.out.println("성적을 입력하세요!!!>>>");

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

		System.out.println("입력한 점수의 성적은 :" + grade);
		
	
		
		
		System.out.println("학년을 입력하세요! >>>");
		int years =sc.nextInt();
		
		if(score >=60) {
			if(years != 4){
				System.out.println("합격");
			}else if (score >=70){
				System.out.println("합격");
			}else{
				System.out.println("불합격");
			}
			
		}else {
			System.out.println("불합격");
		}
		
		
		
	}

}
