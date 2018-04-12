
package javastudy;

import java.util.Scanner;

public class StringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a = "Hello";
		String b = new String("java");
		
		System.out.println(a.length());
		System.out.println(a.substring(0,2));
		System.out.println(a.charAt(3));
		String s[] =a.split(",");
		
		for(int i=0; i<s.length; i++){
			System.out.println(s[i]);
		}
		
		
		String eng[] ={"student","love","java","happy","future"};
		String kor[] ={"학생","사랑","자바","행복","미래"};
		
		Scanner sc = new Scanner(System.in);
		
		while(true){    //무한루프 만듬
			System.out.print("영어단어 입력 >>");
			String s1 =sc.nextLine();
			if(s1.equals("exit")){
				break; 
			}
		for(int i=0; i<eng.length; i++){
			if(eng[i].equals(s1)){
				System.out.println(kor[i]);
				break;
			}
		}
		}
		
		
		char ch =' ';
		System.out.println("문자를 하나 입력하세요");
		
		String input = sc.nextLine();
		ch = input.charAt(0);
		if ('0'<=ch && ch<='9'){
			System.out.println("입력하신 문자는 숫자"+input+"입니다.\n");
		}else if(('a'<=ch && ch<='z')|| ('A'<=ch && ch <='Z')) {
			System.out.println("입력하신 문자는 영문자"+input+ " 입니다");
		}
		
		if('a' <ch && ch<='z'){
			ch=(char) (ch-32);
			
		}else if('A'<= ch && ch <='Z') {
			ch=(char) (ch+32);
		}
		System.out.println(ch);
		System.out.println(input.toUpperCase());
		
		}
		
	}


