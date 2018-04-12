package javastudy;

import java.util.Scanner;

public class swic {

	public static void main(String[] args) {
		
	// 기본 Switch
		System.out.println("숫자를 입력하세요! (1~3까지)");
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
		System.out.println("월을 입력하세요.");
		month =sc.nextInt();
		switch(month) {
			case 3: case 4: case 5:		
				System.out.println("봄");
				break;
				
			case 6: case 7: case 8:	
				System.out.println("여름");
				break;
				
			case 9: case 10: case 11:	
				System.out.println("가을");
				break;
				
			case 12: case 1: case 2:		
				System.out.println("겨울");
				break;
			default:
				System.out.println("잘못 입력하셧습니다.");
		}
	
		
		int score = 0 ;
		System.out.println("점수를 입격하세요");
		
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
