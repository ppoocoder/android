package javastudy2;

import java.util.Scanner;

public class Phone1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름과 전화번호를 입력  >>");
		
		
		String name1 = sc.next();
		String tel1 = sc.next();		
		Phone a = new Phone(name1 ,tel1);
		
		System.out.println(a.getName() + "의 번호는 "+ a.getTel());
		
	}
}
