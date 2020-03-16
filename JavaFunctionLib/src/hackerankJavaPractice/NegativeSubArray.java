package hackerankJavaPractice;

import java.util.Scanner;

public class NegativeSubArray {
	
	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in);
		//int n = scanner.nextInt();
		int count = 0;
		//int sum = 0;
		int[] arr = {1,-2,4,-5,1};
		
		for(int i = 0;i < arr.length;i++) {
			int sum = 0;
			for(int j = i;j < arr.length;j++) {
				sum+=arr[j];
				if(sum < 0) {
					count++;
				}
			}
		}
		System.out.println(count);
    }

}
