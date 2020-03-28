package hackerrank;

public class AppendDelete {
	
	public static void main(String[] args) {
		System.out.println(appendAndDelete("aaa","a",5));
	}
	
	// Complete the appendAndDelete function below.
    static String appendAndDelete(String s, String t, int k) {
    	int n = 0;
    	if(s.length() >= t.length()) {
    		n = t.length();
    	}else {
    		n = s.length();
    	}
    	int commonI = 0;
    	
    	for(int i = 0;i < n;i++) {
    		if(t.charAt(0) != s.charAt(0)) {
        		break;
        	}
    		if(t.charAt(i) != s.charAt(i)) {
    			commonI = i;
    			break;
    		}
    		if(i == n-1) {
    			commonI = n;
    		}
    	}
    	if(commonI == 0) {
    		return s.length() + t.length() <= k? "Yes" :"No";
    	}
    	int count = s.length() + t.length() - 2*commonI;

    	if(count > k) {
    		return "No";
    	}else if(count == k) {
    		return "Yes";
    	}else {
    		if(k - count -(2*commonI) <= 0) {
    			return (k-count)%2==0? "Yes" :"No";
    		}else {
    			return "Yes";
    		}
    	}

    }

}
