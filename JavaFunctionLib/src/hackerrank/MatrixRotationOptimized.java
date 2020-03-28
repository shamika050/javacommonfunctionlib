package hackerrank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MatrixRotationOptimized {
	
	public static void main(String[] args) {
		//int[][] mat = {{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15}};
		int[][] mat = {{1,2,3,4},{12,1,2,5},{11,4,3,6},{10,9,8,7}};
		//int[][] mat = generateMat(4, 2);
		printMat(mat);
		System.out.println();
		printMat(replaceNewIJ(mat,1));
		//listValidIJ(1,2,2);
		
	}
	
	static void matrixRotation(List<List<Integer>> matrix, int r) {
		
		int[][] mat = matrix.stream().map(a->a.stream().mapToInt(Integer::intValue).toArray()).toArray(int[][]::new);
		mat = replaceNewIJ(mat,r);
		printMat(mat);
    }
	
	static Queue<Integer> getRing(int z,int w,int h,int[][] newMat){
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i = z;i <= w-1+z;i++) {
			queue.add(newMat[z][i]);
		}
		for(int i = z+1;i <= h-1+z;i++) {
			queue.add(newMat[i][w-1+z]);
		}
		for(int i = w-2+z;i >= z;i--) {
			queue.add(newMat[h-1+z][i]);
		}
		for(int i = h-2+z;i >z ;i--) {
			queue.add(newMat[i][z]);
		}

		return queue;
	}
	
	static void reInsertToMatrix(int z,int w,int h,Queue<Integer> queue,int[][] newMat){
		
		
		for(int i = z;i <= w-1+z;i++) {
			newMat[z][i] = queue.poll();
		}
		for(int i = z+1;i <= h-1+z;i++) {
			newMat[i][w-1+z] = queue.poll();
		}
		for(int i = w-2+z;i >= z;i--) {
			newMat[h-1+z][i] = queue.poll();
		}
		for(int i = h-2+z;i >z ;i--) {
			newMat[i][z] = queue.poll();
		}
	}

	static int[][] replaceNewIJ(int[][] mat,int rotateTimes) {
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
			Queue<Integer> q = getRing(z,wn,hn,mat);
			//Rotate the ring
			int p = rotateTimes;
			if((2*(hn-z*2) + 2*(wn-z*2) - 4) > 0){     
		        p = rotateTimes%(2*(h-z*2) + 2*(w-z*2) - 4);    
		    }
			
			for(int x = 0;x < p;x++) {
				int y = q.poll();
				q.add(y);
			}
			reInsertToMatrix(z,wn,hn,q,newMat);
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
