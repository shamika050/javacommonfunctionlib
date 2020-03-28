package hackerrank;

public class SherlockSquares {
	
	// Complete the squares function below.
    static int squares(int a, int b) {
    	int c = 0;
    	int i = a;
    	while(i <= b) {
    		if(isSqure(i)) {
    			c++;
    			int k = (int)Math.sqrt(i);
    			i = (k+1)*(k+1);
    		}else {
    			i++;
    		}
    	}

    	return c;

    }
    
    static boolean isSqure(int n) {
    	int a = (int)Math.sqrt(n);
    	return n == a*a ? true:false;
    }

}
