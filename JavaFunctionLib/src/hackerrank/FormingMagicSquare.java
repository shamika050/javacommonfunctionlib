package hackerrank;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FormingMagicSquare {
	
	public static void main(String[] args) {
		int[][] ar = {{5,3,4},{1,5,8},{6,4,2}};
		System.out.println(formingMagicSquare(ar));
	}
	
	static int formingMagicSquare(int[][] s) {
		int[][] magic1 = {{8,1,6},{3,5,7},{4,9,2}};
		int[][] magic2 = {{6,1,8},{7,5,3},{2,9,4}};
		int min = 1000;
		int sum = 0;
		for(int k = 0;k < 4;k++) {
			for(int i =0;i< s.length;i++) {
				for(int j =0;j< s.length;j++) {
					if(magic1[i][j]!=s[i][j]) {
						sum+=Math.abs(magic1[i][j]-s[i][j]);
					}
				}
			}
			if(min > sum) {
				min = sum;
			}
			sum = 0;
			for(int i =0;i< s.length;i++) {
				for(int j =0;j< s.length;j++) {
					if(magic2[i][j]!=s[i][j]) {
						sum+=Math.abs(magic2[i][j]-s[i][j]);
					}
				}
			}
			if(min > sum) {
				min = sum;
			}
			sum = 0;
			magic1 = rotateMatrix(3, magic1);
			magic2 = rotateMatrix(3, magic2);
		}
			
		return min;

    }
	
	// by 90 degrees in anti-clockwise direction 
    static int[][] rotateMatrix(int N, int mat[][]) 
    { 
        // Consider all squares one by one 
        for (int x = 0; x < N / 2; x++) 
        { 
            // Consider elements in group of 4 in  
            // current square 
            for (int y = x; y < N-x-1; y++) 
            { 
                // store current cell in temp variable 
                int temp = mat[x][y]; 
       
                // move values from right to top 
                mat[x][y] = mat[y][N-1-x]; 
       
                // move values from bottom to right 
                mat[y][N-1-x] = mat[N-1-x][N-1-y]; 
       
                // move values from left to bottom 
                mat[N-1-x][N-1-y] = mat[N-1-y][x]; 
       
                // assign temp to left 
                mat[N-1-y][x] = temp; 
            } 
        } 
        return mat;
    } 
	
	/**
	 * 
	 * @param i coordinate i
	 * @param j coordinate j
	 * @param n size
	 * @param side left = 0 | right = 1
	 * @return
	 */
	static int[][] magicSquereForGivenStartPosition(int i,int j,int n,int side){
		int[][] arr = new int[n][n];
		
		
		
		return arr;
	}
	
	
	
}
