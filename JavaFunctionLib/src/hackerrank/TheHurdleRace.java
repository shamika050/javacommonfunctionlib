package hackerrank;

import java.util.Arrays;

public class TheHurdleRace {
	
	// Complete the hurdleRace function below.
    static int hurdleRace(int k, int[] height) {
    	
    	Arrays.sort(height);
    	int diff = height[height.length - 1] - k;
    	if(diff < 0) {
    		return 0;
    	}
    	return diff;

    }

}
