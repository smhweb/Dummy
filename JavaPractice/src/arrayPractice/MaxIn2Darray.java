package arrayPractice;

public class MaxIn2Darray {

	public static void main(String[] args) {

		int[][] arr = new int[6][6];
		arr[0][0] = 1;	arr[0][1] = 1;	arr[0][2] = 1;	arr[0][3] = 0;	arr[0][4] = 0;	arr[0][5] = 0;
		arr[1][0] = 0;	arr[1][1] = 1;	arr[1][2] = 0;	arr[1][3] = 0;	arr[1][4] = 0;	arr[1][5] = 0;	
		arr[2][0] = 1;	arr[2][1] = 1;	arr[2][2] = 1;	arr[2][3] = 0;	arr[2][4] = 0;	arr[2][5] = 0;	
				
		arr[3][0] = 0;	arr[3][1] = 0;	arr[3][2] = 0;	arr[3][3] = 4;	arr[3][4] = 4;	arr[3][5] = 0;
		arr[4][0] = 0;	arr[4][1] = 0;	arr[4][2] = 0;	arr[4][3] = 2;	arr[4][4] = 0;	arr[4][5] = 0;	
		arr[5][0] = 0;	arr[5][1] = 0;	arr[5][2] = 1;	arr[5][3] = 2;	arr[5][4] = 4;	arr[5][5] = 0;	
		
		int max = 0;		
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				int tempMax = 0;
//				for(int x=i; x<i+3; x++) {
//					for(int y=j; y<j+3; y++) {
//						tempMax += arr[i][j];
//					}
//				}
				
				tempMax += arr[i][j];
				tempMax += arr[i][j+1];
				tempMax += arr[i][j+2];
				tempMax += arr[i+1][j+1];
				tempMax += arr[i+2][j];
				tempMax += arr[i+2][j+1];
				tempMax += arr[i+2][j+2];
				
				if(tempMax>max) {
					//System.out.println(tempMax);
					max = tempMax;
				}
			}
		}System.out.println(max);
		
		
//		for(int i=0; i<6; i++) {
//			int count = 0;
//			for(int j=0; j<6; j++) {	//
//				if(i<3 && j<3) {
//					System.out.print(arr[i][j]);
//					count += arr[i][j];
//				}//				
//			}System.out.println();
//			max += count;//			
//		}System.out.println(max);
		
		String given="wefeqf878979797fewfewrf879797efds&^&^*^*^";   
		String replaced=given.replaceAll("[a-zA-Z]", "");   
		int alphaChar=given.length()-replaced.length();   
		System.out.println(replaced); 
		
		
		
		
		
		
		
		
		
	}
}
//1 1 1   1 1 0   1 0 0   0 0 0
//1       0       0       0
//1 1 1   1 1 0   1 0 0   0 0 0
//
//0 1 0   1 0 0   0 0 0   0 0 0
//1       1       0       0
//0 0 2   0 2 4   2 4 4   4 4 0
//
//1 1 1   1 1 0   1 0 0   0 0 0
//0       2       4       4
//0 0 0   0 0 2   0 2 0   2 0 0
//
//0 0 2   0 2 4   2 4 4   4 4 0
//0       0       2       0
//0 0 1   0 1 2   1 2 4   2 4 0