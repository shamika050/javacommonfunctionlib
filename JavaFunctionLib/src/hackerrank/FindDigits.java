package hackerrank;

import java.util.Arrays;

public class FindDigits {
	
	// Complete the findDigits function below.
    static int findDigits(int n) {
    	
    	Integer[] digits = Arrays.stream(String.valueOf(n).split("")).filter(a->a!="").map(Integer::parseInt).toArray(Integer[]::new);
    	int c = 0;
    	for(int i = 0;i<digits.length;i++) {
    		if(digits[i]!=0 && n%digits[i] == 0) {
    			c++;
    		}
    	}
    	return c;
    }

}
