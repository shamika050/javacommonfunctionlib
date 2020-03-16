package hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import java.util.stream.Collectors;

public class CircularArrayRotation {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int[] ind = {0,1,2};
		System.out.println(circularArrayRotation(arr,2,ind));
	}
	
	// Complete the circularArrayRotation function below.
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
    	
    	List<Integer> arrL = Arrays.stream(a).boxed().collect(Collectors.toList());
    	
    	int realRotation = k%a.length;
    	
    	Collections.rotate(arrL, realRotation);
    	
    	Integer[] arrI = arrL.stream().toArray(Integer[]::new);
    	
    	int[] ret = new int[queries.length];
    	for(int i = 0;i < ret.length;i++) {
    		ret[i] = arrI[queries[i]];
    	}
    	
    	return ret;

    }

}
