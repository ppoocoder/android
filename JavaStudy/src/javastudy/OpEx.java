package javastudy;

import java.util.Scanner;

public class OpEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

	Scanner sc  = new Scanner(System.in);
	
	System.out.println("������ �Է��ϼ���");
		
	int time  = sc.nextInt();
	int second = time%60; 
	int minute =(time/60)%60;
	int hour = (time/60)/60;
	
	
	
	System.out.println(time+"�ʴ� " +hour+"��" +minute+"��"+second+"��");
		
	
	System.out.println("�Է��� ���� ¦������ Ȧ������ �˾ƺ��ô�!!!!!");
	
	int input1 = sc.nextInt();
	
	String output1 =((input1%2)==0)? "¦��" : "Ȧ��";
	System.out.println("�Է��� ���� ����� " +output1);
	
	
	
	
	}

}
