package hackerrank;
import java.util.ArrayList;
import java.util.List;

public class MaxRotationOptimized1 {
	
static void matrixRotation(List<List<Integer>> matrix, int r) {
        
        int[][] mat = matrix.stream().map(a->a.stream().mapToInt(Integer::intValue).toArray()).toArray(int[][]::new);
        for(int i =0;i < r;i++) {
            mat = replaceNewIJ(mat);
        }
        printMat(mat);
        

    }
    
    
    static boolean isInRing(int z,int h,int w,int i, int j) {
        if(i==z&&(j>=z&&j-z<=w-1))return true;
        if(i-z==h-1&&(j>=z&&j-z<=w-1))return true;
        if(j==z&&(i>=z&&i-z<=h-1))return true;
        if(j-z==w-1&&(i>=z&&i-z<=h-1))return true;
        return false;
        
    }
    
    static List<int[]> listValidIJ(int z,int w,int h) {
        List<int[]> arr = new ArrayList<int[]>();
        for(int i = z;i <= w-1+z;i++) {
            int[] ar_i = new int[2];
            ar_i[0] = z;
            ar_i[1] = i;
            arr.add(ar_i);
            int[] ar_j = new int[2];
            ar_j[0] = h-1+z;
            ar_j[1] = i;
            arr.add(ar_j);
        }
        for(int i = z+1;i <= h-2+z;i++) {
            int[] ar_i = new int[2];
            ar_i[0] = i;
            ar_i[1] = z;
            arr.add(ar_i);
            int[] ar_j = new int[2];
            ar_j[0] = i;
            ar_j[1] = w-1+z;
            arr.add(ar_j);
        }
        
        return arr;
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
            int z = r;
            int hn = h-2*r;
            int wn = w-2*r;
            List<int[]> arr = listValidIJ(z,wn,hn);
            
            for (int[] is : arr) {
                int i = is[0];
                int j = is[1];
                int[] newIJ = newIJ(i,j,z,hn,wn);
                int x = newIJ[0];
                int y = newIJ[1];
                newMat[x][y] = mat[i][j];
            }
            
        }
        return newMat;
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
