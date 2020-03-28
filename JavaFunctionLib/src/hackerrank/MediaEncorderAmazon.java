package hackerrank;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MediaEncorderAmazon {

	public static void main(String[] args) {
		List<Integer> files = new ArrayList<Integer>();
		files.add(4);
		files.add(8);
		files.add(6);
		files.add(12);
		System.out.println(minimumTime(files));

	}
	
	public static int minimumTime(List<Integer> files) {
		PriorityQueue<Integer> queue = new PriorityQueue<>(files);
		//queue.addAll(files);
		int time = 0;
		for(int i = 0;i < files.size() - 1;i++) {
			int a = queue.poll();
			int b = queue.poll();
			time = time + a+b;
			queue.add(a+b);
		}
		return time;
	}

}
