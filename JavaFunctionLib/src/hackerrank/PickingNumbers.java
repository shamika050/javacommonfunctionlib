package hackerrank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PickingNumbers {
	public static void main(String[] args) {
//		List<Integer> ar = new ArrayList<>();
//		ar.add(1);
//		ar.add(2);
//		ar.add(2);
//		ar.add(3);
//		ar.add(1);
//		ar.add(2);
//		System.out.println(pickingNumbers(ar));
		List<Integer> ar1 = new ArrayList<>();
		ar1.add(1);
		ar1.add(1);
		ar1.add(2);
		ar1.add(2);
		ar1.add(4);
		ar1.add(4);
		ar1.add(5);
		ar1.add(5);
		ar1.add(5);
		System.out.println(pickingNumbers(ar1));
	}
	
	public static int pickingNumbers(List<Integer> a) {
		
		Collections.sort(a,(x,y)-> x-y);
		List<Integer> temp = new ArrayList<Integer>();
		temp.add(a.get(0));
		int max = 0;
		int i = 0;
		while(i < a.size() - 1) {
			int  k = i+1;
			while((a.get(i) == a.get(k))||(a.get(k) == a.get(i)+1)) {
				temp.add(a.get(k));
				k++;
				if(k > a.size() - 1) {
					break;
				}
			}
			if(max < temp.size()) {
				max = temp.size();
			}
			
			if(k > i) {
				i = k;
			}else {
				i++;
			}
			temp.removeAll(temp);
			if(k < a.size() - 1) {
				temp.add(a.get(i+1));
			}
			
			
		}
		
		return max;
		
	}
	
}
