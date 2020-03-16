package hackerrank;

import java.util.Arrays;

public class AngryProfessor {
	
	public static void main(String[] args) {
		String s = "-1 -3 4 2";
		Integer[] arr = Arrays.stream(s.split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
		System.out.println(angryProfessor(3,arr));
	}
	
	// Complete the angryProfessor function below.
    static String angryProfessor(int k, Integer[] a) {
    	
    	long sumArivedOnTime = Arrays.stream(a).filter(i->i<=0).count();
    	
    	if(sumArivedOnTime >= k ) {
    		return "NO";
    	}
    	return "YES";

    }

}
