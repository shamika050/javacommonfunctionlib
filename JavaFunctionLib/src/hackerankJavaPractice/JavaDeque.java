package hackerankJavaPractice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class JavaDeque {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        Set<Integer> set = new HashSet<Integer>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            set.add(num);
            if(deque.size() == m) {
            	if(max < set.size()) {
                    max = set.size();
                }
            	int  p = (int) deque.pollFirst();
            	if(!deque.contains(p)) {
            		set.remove(p);
            	}
            	
            }
        }
        System.out.println(max);
    }

}
