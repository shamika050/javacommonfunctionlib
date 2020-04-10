package hackerrank;

import java.util.Arrays;

public class EqualizeArray {
	
	public static void main(String[] args) {
		int[] arr = {3,3,2,1,3};
		System.out.println(equalizeArray(arr));
	}
	
	static int equalizeArray(int[] arr) {
		Arrays.sort(arr);
		int c = 1;
		int max = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if(arr[i] == arr[i+1]) {
				c++;
			}else {
				if(max < c) {
					max = c;
				}
				c = 1;
			}
		}
		if(max < c) {
			max = c;
		}
		return arr.length - max;
    }
}
