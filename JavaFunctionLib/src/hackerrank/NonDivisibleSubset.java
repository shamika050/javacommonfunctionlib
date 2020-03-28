package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NonDivisibleSubset {
	
	public static void main(String[] args) {
		//String s = "278 576 496 727 410 124 338 149 209 702 282 718 771 575 436";
		//String s = "1 7 2 4";
		String s = "1 9 3 4";
		int k = 4;
		List<Integer> l = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
		System.out.println(nonDivisibleSubset(k, l));
	}
	
	public static int nonDivisibleSubset(int k, List<Integer> s) {
		
		int[] arr = new int[k];
		Arrays.fill(arr, 0);
		for (int i : s) {
			arr[i%k]++;
		}
		int max = arr[0];
		for(int i = 1;i <= k/2;i++) {
			if(i!=k-i) {
				max+=Math.max(arr[i], arr[k-i]);
			}else {
				max++;
			}
		}
		return max;
		
	}

}
