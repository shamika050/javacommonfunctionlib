package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CutSticks {
	
	public static void main(String[] args) {
		
	}
	
	// Complete the cutTheSticks function below.
    static int[] cutTheSticks(int[] arr) {
    	
    	List<Integer> ret = new ArrayList<Integer>();
    	List<Integer> l = Arrays.stream(arr).boxed().collect(Collectors.toList());
    	
    	ret.add(l.size());
    	while(l.size() > 0) {
    		Integer min = Collections.min(l);
    		l = l.stream().map(a->a-min).filter(b->b!=0).collect(Collectors.toList());
    		if(l.size() == 0) {
    			break;
    		}
    		ret.add(l.size());
    	}
    	return ret.stream().mapToInt(Integer::intValue).toArray();

    }

}
