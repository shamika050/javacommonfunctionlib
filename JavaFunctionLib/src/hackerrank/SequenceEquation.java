package hackerrank;

import java.util.Arrays;

public class SequenceEquation {
	
	public static void main(String[] args) {
		//int[] arr = {4,3,5,1,2};
		int[] arr = {2,3,1};
		//System.out.println(Arrays.search(arr,2));
		//int[] arr = {5,2,1,3,4};
		System.out.println(permutationEquation(arr));
	}
	
	// Complete the permutationEquation function below.
    static int[] permutationEquation(int[] p) {
    	
    	int[] arr= new int[p.length];

    	for(int i =0;i < p.length;i++) {
    		int iIndex = 0;
    		for(int j = 0;j < p.length;j++) {
    			if(p[j] == i+1) {
    				iIndex = j+1;
    				break;
    			}
    		}
    		for(int j = 0;j < p.length;j++) {
    			if(p[j] == iIndex) {
    				arr[i] = j+1;
    				break;
    			}
    		}
    	}
    	
    	return arr;
    	
    }	

}
