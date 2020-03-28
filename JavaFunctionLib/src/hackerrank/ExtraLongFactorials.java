package hackerrank;

import java.math.BigInteger;

public class ExtraLongFactorials {
	
	// Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
        BigInteger b = new BigInteger(String.valueOf(1));
        BigInteger a = null;
        for(int i = 1;i <= n;i++) {
        	a = b.multiply(new BigInteger(String.valueOf(i)));
        	b = a;
        }
        System.out.println(a.toString());
    }

}
