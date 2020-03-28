package hackerrank;
import java.util.List;

public class BirthdayChocolate {
	
	public static void main(String[] args) {
		
	}
	
	// Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
    	
    	int count = 0;
		for(int i = 0;i< s.size();i++) {
    		int sum = 0;
    		for(int j = i;j < i+m && j < s.size();j++) {
    			sum+=s.get(j);
    		}
    		if(sum == d) {
    			count++;
    		}
    		sum=0;
    	}
    	return count;

    }

}
