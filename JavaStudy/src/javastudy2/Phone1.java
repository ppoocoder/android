package javastudy2;

import java.util.Scanner;

public class Phone1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸��� ��ȭ��ȣ�� �Է�  >>");
		
		
		String name1 = sc.next();
		String tel1 = sc.next();		
		Phone a = new Phone(name1 ,tel1);
		
		System.out.println(a.getName() + "�� ��ȣ�� "+ a.getTel());
		
	}
}
