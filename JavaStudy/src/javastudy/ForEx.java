package javastudy;

import java.util.Scanner;

public class ForEx {

	public static void main(String[] args) {
		//화면에 1- 10까지 술자 찍어주기
		
	int INt = 0 ;
	while (10 > INt){
		++ INt;
		System.out.println( INt);
		
		
	}
	
	int i, sum =0;
	for( i=0;i<=10;i++){
		sum += i;
		
		System.out.println(sum);
	}
		System.out.println(sum);
		
		
	int dan =0; 
	int num =0;
	System.out.println("몇단을 계산하실건가요?");
	
	Scanner sc = new Scanner(System.in);
	dan = sc.nextInt();
	System.out.println(dan+" 단");
	
	for(num=1;num<10;num++){
		System.out.println(dan+" * " +num+" = "+dan*num);
		
		
	}
	
	
	System.out.println("구구단 전체 찍기 ");
	
		for( dan=1;dan<10;dan++){
			for(num=1;num<10;num++){
				if (10<= (dan*num)&&(dan*num) <100){
				System.out.print(dan+ " X " +num + " = "+dan*num+"  ");
				}else {
					System.out.print(dan+ " X " +num + " = "+dan*num+"   ");
				}
			}
		System.out.println();
	}
		
		
		
		System.out.println("구구단 전체 찍기 ");
		int gugudan =sc.nextInt();
			for( dan=1;dan<10;dan++){
				if (gugudan < dan){
				for(num=1;num<10;num++){
				   
					if (10<= (dan*num)&&(dan*num) <100){
					System.out.print(dan+ " X " +num + " = "+dan*num+"  ");
					}else {
						System.out.print(dan+ " X " +num + " = "+dan*num+"   ");
					}
				} ///
			System.out.println();	
		
				
		
		
	}
			}

}
}