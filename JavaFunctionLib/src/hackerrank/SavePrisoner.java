package hackerrank;

public class SavePrisoner {
	
	public static void main(String[] args) {
		
		//499999999
		//1
		//999999999
		
		System.out.println(saveThePrisoner(3,9,1));
		System.out.println(saveThePrisoner(499999999,999999997,2));
		System.out.println(saveThePrisoner(499999999,999999998,2));
		System.out.println(saveThePrisoner(999999999,999999999,1));
	}
	
	static int saveThePrisoner(int n, int m, int s) {
		
		if((m-1)%n == 0) {
			return s;
		}else{
			return ((m-1)%n+s)%n == 0? n:((m-1)%n+s)%n;
		}


    }

}
