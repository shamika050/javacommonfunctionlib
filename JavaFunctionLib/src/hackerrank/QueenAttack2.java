package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QueenAttack2 {
	public static void main(String[] args) {
		int[][] arr = {{5,5},{4,2},{2,3},{3,4},{2,1},{5,2}};
		//int[][] arr = {};
		//System.out.println(queensAttack(100000, 0, 4187,5068, arr));
		System.out.println(queensAttack(5,6, 4,3, arr));
	}
	
	static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
		int count  = 0;
		int minYU = n,minXU = n,minYD = 0,minXD = 0;
		List<List<Integer>> upward = new ArrayList<List<Integer>>();
		List<List<Integer>> downward = new ArrayList<List<Integer>>();
		for(int i = 0;i < k;i++) {
			int x = obstacles[i][1];
			int y = obstacles[i][0];
			if(x == c_q) {	
				if(r_q - y > 0&&minYD<y) {
					minYD = y+1;
				}
				if(r_q - y < 0&&minYU<y) {
					minYU = y-1;
				}
			}
			if(y == r_q) {
				if(c_q - x > 0&&minXD<x) {
					minXD = x+1;
				}
				if(c_q - x < 0&&minXU<x) {
					minXU = x-1;
				}
			}
			//y = x - x_q + y_q equation
			if(y == x-c_q+r_q) {
				List<Integer> temp = new ArrayList<>();
				temp.add(x);temp.add(y);
				upward.add(temp);
			}
			//y = -x + x_q + y_q equation
			if(y == -x + c_q+r_q) {
				List<Integer> temp = new ArrayList<>();
				temp.add(x);temp.add(y);
				downward.add(temp);
			}
			
		}
		count += minYU - minYD;
		count += minXU - minXD;
		Collections.sort(upward,(a,b)->ThirdT(a.get(0)-c_q, a.get(1)-r_q)>=ThirdT(b.get(0)-c_q, b.get(1)-r_q)?1:-1);
		Collections.sort(downward,(a,b)->ThirdT(a.get(0)-c_q, a.get(1)-r_q)>=ThirdT(b.get(0)-c_q, b.get(1)-r_q)?1:-1);
		List<Integer> upperUp = null;
		for (int i = 0; i < upward.size(); i++) {
			if(upward.get(i).get(0)>=c_q) {
				upperUp = upward.get(i);
				break;
			}
		}
		List<Integer> upperDown = null;
		for (int i = 0; i < upward.size(); i++) {
			if(upward.get(i).get(0)<c_q) {
				upperDown = upward.get(i);
				break;
			}
		}
		
		if(upperUp == null) {
			upperUp = new ArrayList<Integer>();
			upperUp.add(n-c_q+r_q);
			upperUp.add(n);
		}
		if(upperDown == null) {
			upperDown = new ArrayList<Integer>();
			upperDown.add(1);
			upperDown.add(-c_q+r_q);
		}
		
		List<Integer> lowerUp = null;
		for (int i = 0; i < downward.size(); i++) {
			if(downward.get(i).get(1)>=r_q) {
				lowerUp = downward.get(i);
				break;
			}
		}
		List<Integer> lowerDown = null;
		for (int i = 0; i < downward.size(); i++) {
			if(downward.get(i).get(1)<r_q) {
				lowerDown = downward.get(i);
				break;
			}
		}
		if(lowerDown == null) {
			lowerDown = new ArrayList<Integer>();
			lowerDown.add(n);
			lowerDown.add(1);
		}
		if(lowerUp == null) {
			lowerUp = new ArrayList<Integer>();
			lowerUp.add(n);
			lowerUp.add(1);
		}
		return count;
	}
	
	static double ThirdT(int x,int y) {
		return Math.sqrt(x*x+y*y);
	}
	
	
	/* V1 : OutOfMemoryError for large size boards
	static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
		
		int[][] board = new int[n][n];
		//Arrays.fill(board, 0);
		int qx = n-1-(r_q-1);
		int qy = c_q-1;
		board[qx][qy] = 2;
		for(int i = 0;i < obstacles.length;i++) {
			int x = n - 1 - (obstacles[i][0] - 1);
			int y = obstacles[i][1] - 1;
			board[x][y] = 1;
		}
		int count  = 0;
		//up
		int i = qx;
		while(i>=0&&board[i][qy]!=1) {
			count++;
			i--;
		}
		//down
		i = qx;
		while(i<n && board[i][qy]!=1) {
			count++;
			i++;
		}
		//left
		i = qy;
		while(i>=0 && board[qx][i]!=1) {
			count++;
			i--;
		}
		//right
		i = qy;
		while(i<n && board[qx][i]!=1) {
			count++;
			i++;
		}
		//diagonal 1 down
		i = qx;
		int j = qy;
		while(i<n&&j<n&&board[i][j]!=1) {
			i++;
			j++;
			count++;
		}
		//diagonal 1 up
		i = qx;
		j = qy;
		while(i>=0&&j>=0&&board[i][j]!=1) {
			i--;
			j--;
			count++;
		}
		//diagonal 1 up
		i = qx;
		j = qy;
		while(i>=0&&j<n&&board[i][j]!=1) {
			i--;
			j++;
			count++;
		}
		//diagonal 1 down
		i = qx;
		j = qy;
		while(i<n&&j>=0&&board[i][j]!=1) {
			i++;
			j--;
			count++;
		}
		count=count-8;
		return count;

    }
	*/

}
