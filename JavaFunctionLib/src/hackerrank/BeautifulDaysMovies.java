package hackerrank;

public class BeautifulDaysMovies {
	
	public static void main(String[] args) {
		
	}
	
	static int beautifulDays(int i, int j, int k) {
		int bCount = 0;
		for(int a = i;a <= j;a++) {
			
			int rev = Integer.parseInt(new StringBuilder(String.valueOf(a)).reverse().toString());
			int diff = Math.abs(rev - a);
			if(diff%k == 0) {
				bCount++;
			}
		}
		return bCount;

    }

}	
