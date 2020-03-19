package hackerankJavaPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JavaHashSet {
	
	public static void main(String[] args) {
		int t = 3;
		String [] pair_left = new String[t];
        String [] pair_right = new String[t];
		String [] a = {"john","tom"};
		String [] b = {"john","tom"};
		Set<List<String>> set = new HashSet<List<String>>();
        for (int i = 0; i < t; i++) {
        	List<String> temp = new ArrayList<String>();
            temp.add(pair_left[i]);
            temp.add(pair_right[i]);
            if(!set.contains(temp)){
                set.add(temp);
            }
            
            System.out.println(set.size());
        }
		
	}

}
