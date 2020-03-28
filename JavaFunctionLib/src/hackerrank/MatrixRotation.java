package hackerrank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixRotation {
	
	public static void main(String[] args) {
		//int[][] mat = {{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15}};
		int[][] mat = {{1,2,3,4},{12,1,2,5},{11,4,3,6},{10,9,8,7}};
		//int[][] mat = generateMat(4, 2);
		printMat(mat);
		System.out.println();
		printMat(replaceNewIJ(mat));
		
	}
	
	static void matrixRotation(List<List<Integer>> matrix, int r) {
		
		int[][] mat = matrix.stream().map(a->a.stream().mapToInt(Integer::intValue).toArray()).toArray(int[][]::new);
		for(int i =0;i < r;i++) {
			mat = replaceNewIJ(mat);
		}
		printMat(mat);
		

    }

	
	static int[][] generateMat(int m,int n) {
		int c = 1;
		int[][] newMat = new int[m][n];
		for(int i = 0;i < m;i++) {
			for(int j = 0;j < n;j++) {
				newMat[i][j] = c;
				c++;
			}
		}
		return newMat;
	}

	static int[] newIJ(int i,int j,int z,int h,int w) {
		int[] ij = new int[2];
		
		//down
		if(j == z && (i >= z && i-z <= h - 1)) {
			ij[0] = i+1;
			ij[1] = j;
		}
		//right
		if(i-z == h - 1 && (j >= z && j-z <= w - 1)) {
			ij[0] = i;
			ij[1] = j+1;
		}
		//up
		if(j-z == w - 1 && (i-z <= h - 1 && i > z)) {
			ij[0] = i-1;
			ij[1] = j;
		}
		//left
		if(i == z && (j-z <= w - 1 && j > z)) {
			ij[0] = i;
			ij[1] = j-1;
		}
		
		return ij;
	}
	
	
	static int[][] replaceNewIJ(int[][] mat) {
		int h = mat.length;//height
		int w = mat[0].length;//width
		int[][] newMat = new int[h][w];
		int rounds = 0;
		if(h >= w) {
			rounds = w/2;
		}else {
			rounds = h/2;
		}
		for(int r = 0;r < rounds;r++) {
			for(int i = 0;i < mat.length;i++) {
				for(int j = 0;j < mat[0].length;j++) {
					int z = r;
					int hn = h-2*r;
					int wn = w-2*r;
					if(!isInRing(r, hn, wn, i, j)) {
						continue;
					}
					
					int[] newIJ = newIJ(i,j,z,hn,wn);
					int x = newIJ[0];
					int y = newIJ[1];
					newMat[x][y] = mat[i][j];
				}
			}
		}
		return newMat;
	}
	
	static boolean isInRing(int z,int h,int w,int i, int j) {
		if(i==z&&(j>=z&&j-z<=w-1))return true;
		if(i-z==h-1&&(j>=z&&j-z<=w-1))return true;
		if(j==z&&(i>=z&&i-z<=h-1))return true;
		if(j-z==w-1&&(i>=z&&i-z<=h-1))return true;
		return false;
		
	}
	
	static void printMat(int[][] mat) {
		for(int i = 0;i < mat.length;i++) {
			for(int j = 0;j < mat[0].length;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}
