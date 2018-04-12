
package javastudy;

public class ArrayEx2 {
	
		public static void main(String[] args) {
			int score[][] = new int[2][3];
			score[0][0] = 50;
			score[0][1] = 30;
			score[0][2] = 40;
			score[1][0] = 30;
			score[1][1] = 40;
			score[1][2] = 50;
			// int score[][] = {{50,30,40},{30,40,50}};
			
			
			for(int i=0; i<2; i++){
				for(int j =0; j<3; j++){
				System.out.println(score[i][j]);
				
				}
			}
			
			
			int score1[][] ={ {3,4},{4,4},{4,3},{2,3}};
			int sum=0;
			double avg=0.0;
			
			for(int i1=0; i1<score1.length; i1++){
				for(int j1=0; j1<score1[i1].length; j1++){

				sum += score1[i1][j1];
				}
					}
				
			int n =score1.length;
			int m =score1[0].length;
			avg =sum/n*m;
			System.out.println("ÇÕ°è" +sum+"Æò±Õ"+avg);
		
			}
			
		}

