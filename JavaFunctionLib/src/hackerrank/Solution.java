package hackerrank;
public class Solution {
	
	public static void main(String[] args) {
		System.out.println(solution(2, "1A 2F 1C"));
	}
	public static int solution(int N, String S) {
		
		
		int[][] seats = new int[N][10];
		if(!"".equals(S)) {
			String[] bookings = S.split(" ");
			for (String booking : bookings) {
				seats[getRow(booking)][getColumn(booking)] = 1;
			}
		}
		int count = 0;
		for(int i=0; i< N; i++) {
			boolean intersect1 = false;
			if(seats[i][1] ==0 && seats[i][2] == 0 && seats[i][3] == 0 && seats[i][4] == 0) {
				intersect1 = true;
				count++;
			} 
			boolean intersect2 = false;
			if(!intersect1 && seats[i][3] ==0 && seats[i][4] == 0 && seats[i][5] == 0 && seats[i][6] == 0) {
				count++;
				intersect2 = true;
			} 
			
			if(!intersect2 && seats[i][5] ==0 && seats[i][6] == 0 && seats[i][7] == 0 && seats[i][8] == 0) {
				count++;
			}
			
		}
		return count;
	}
	
	static int getRow(String seat) {
		
		char[] chars = seat.toCharArray();
		return Character.getNumericValue(chars[0]) -1;
	}
	
	static int getColumn(String seat) {
		char[] chars = seat.toCharArray();
		int column = -1;
		
		switch(chars[1]) {
		case 'A' : 
			column = 0;
			break;
			
		case 'B' : 
			column = 1;
			break;
			
		case 'C' : 
			column = 2;
			break;
		
		case 'D' : 
			column = 3;
			break;
			
		case 'E' : 
			column = 4;
			break;
			
		case 'F' : 
			column = 5;
			break;
			
		case 'G' : 
			column = 6;
			break;
			
		case 'H' : 
			column = 7;
			break;
			
		case 'J' : 
			column = 8;
			break;
			
		case 'K' : 
			column = 9;
			break;
			
		default: 
				break;
		}
		return column;
	}
	
}