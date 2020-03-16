package hackerrank;

public class ViralAdvertising {
	public static void main(String[] args) {
		System.out.println(viralAdvertising(5));
	}
	
	static int viralAdvertising(int n) {
		
		int init = 5;
		int likes = 0;
		
		for(int i = 0;i < n;i++) {
			
			int rec = init/2;
			likes+=rec;
			init = 3*rec;
			
		}
		return likes;

    }

}
