package hackerrank;

import java.util.Arrays;

public class JumpingOnClouds {
	
	public static void main(String[] args) {
		//String s = "1 1 1 0 1 1 0 0 0 0";
		//String s =  "0 0 1 0 0 1 1 0";
		String s = "1 1";
		Integer[] arr = Arrays.stream(s.split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
		System.out.println(jumpingOnClouds(arr,2));
	}
	
	public static int getNextIndex(Integer[] c,int i,int k) {
		if(i+k >= c.length) {
			return k - (c.length - (i + 1))- 1;
		}
		return i+k;
	}
	
	// Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(Integer[] c, int k) {
    	
    	int life = 100;
    	int i = 0;
    	if(k == c.length) {
    		life = life - 1;
    		if(c[0] == 1) {
    			life = life - 2;
    		}
    		return life;
    	}
    	
    	int nextIndex = getNextIndex(c,i,k);
    	while(nextIndex != 0) {
    		life = life - 1;
    		if(c[nextIndex] == 1) {
    			life = life - 2;
    		}
    		nextIndex = getNextIndex(c,nextIndex,k);
    		if(nextIndex == 0) {
    			life = life - 1;
        		if(c[nextIndex] == 1) {
        			life = life - 2;
        		}
    		}
    	}
    	return life;

    }

}
