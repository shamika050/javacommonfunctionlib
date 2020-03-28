package hackerrank;

public class DrawingBook {
	
	public static void main(String[] args) {
		System.out.println(pageCount(11,6));
	}

	static int pageCount(int n, int p) {
        if(n%2 == 1) {
        	int c = (n - 3)/2;
			if(p == 1 || p == n || p == n - 1) {
				return 0;
			}else {
				if(p/2 >= (c/2)+1) {
					return c - p/2 + 1;
				}else {
					return p/2;
				}
			}
		}else {
			int c = (n - 2)/2;
			if(p == 1 || p == n) {
				return 0;
			}else {
				if(p/2 >= (c/2)+1) {
					return c - p/2 + 1;
				}else {
					return p/2;
				}
			}
		}

    }
}
