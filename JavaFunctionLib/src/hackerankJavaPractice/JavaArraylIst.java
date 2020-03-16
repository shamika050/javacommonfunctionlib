package hackerankJavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaArraylIst {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String p = scanner.nextLine();
		List<Integer[]> list = new ArrayList<Integer[]>();
		List<Integer[]> index = new ArrayList<Integer[]>();
		for(int i = 0;i < n;i++) {
			String s = scanner.nextLine();
			list.add(Arrays.stream(s.split(" ")).map(Integer::parseInt).toArray(Integer[]::new));
		}
		int d = scanner.nextInt();
		p = scanner.nextLine();
		for(int i = 0;i < d;i++) {
			String s = scanner.nextLine();
			index.add(Arrays.stream(s.split(" ")).map(Integer::parseInt).toArray(Integer[]::new));
		}
		
		for(int i = 0;i < d;i++) {
			int x= index.get(i)[0];
			int y= index.get(i)[1];
			Integer[] l = list.get(x);
			try {
				System.out.println(l[y]);
			}catch(Exception e) {
				System.out.println("ERROR!");
			}
		}
		
		
    }

}
