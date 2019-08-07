	import java.util.*;
public class Solution {

	    public static boolean canWin(int leap, int[] game) {
	        // Return true if you can win the game; otherwise, return false.

	        int i = 0;
	        int l = game.length-1;

	        while(i<l){
	            if(game[i]==0 && game[i+leap]==1 || game[i+1]==1){
	                return false;
	            }else if(i<0 || game[i]==1){
	                return false;
	            }else if(i+leap<=l && game[i+leap]==0 && leap!=0){
	                i=i+leap;
	            }else if(i+1<l && game[i+1]==0){
	                i=i+1;
	            }else if(i-1>=0 && game[i-1]==0){
	                i=i-1;
	            }else {
	                return false;
	            }
	            game[i]=1;
	            if(i==l || i+leap>=l){
	                return true;
	            }
	            return true;
	        }
			return false;

	        // int l = game.length-1;
	        // for(int i=0; i<l; i++){
	        //     if(i<0 || (game[i]==1)){
	        //         return false;
	        //     }
	        //     else if((i+leap)>(l-i)){
	        //         i+=leap;
	        //     }else if(i==l){
	        //         continue;
	        //     }else if(game[i+1]==0){
	        //         continue;
	        //     }
	        // }return true;
	    }	    
	
	
	public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int q = scan.nextInt();
	        while (q-- > 0) {
	            int n = scan.nextInt();
	            int leap = scan.nextInt();
	            
	            int[] game = new int[n];
	            for (int i = 0; i < n; i++) {
	                game[i] = scan.nextInt();
	            }
	            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
	        }
	        scan.close();
	}
}
