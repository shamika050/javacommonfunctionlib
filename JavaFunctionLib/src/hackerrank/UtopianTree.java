package hackerrank;

public class UtopianTree {
	public static void main(String[] args) {
		System.out.println(utopianTree(4));
	}
	
	// Complete the utopianTree function below.
    static int utopianTree(int n) {
    	
    	int init = 1;
    	if(n == 0) {
    		return init;
    	}
    	
    	for(int i = 1;i<= n;i++) {
    		if(i%2 == 1) {
    			init = init*2;
    		}else {
    			init++;
    		}
    	}
    	return init;

    }

}
