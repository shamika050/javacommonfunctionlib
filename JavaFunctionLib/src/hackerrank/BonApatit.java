package hackerrank;
import java.util.List;
import java.util.stream.Collectors;

public class BonApatit {
	static void bonAppetit(List<Integer> bill, int k, int b) {
		
		int rightAmount = (bill.stream().mapToInt(Integer::intValue).sum() - bill.get(k)) / 2;
		
		if(b == rightAmount) {
			System.out.println("Bon Appetit");
		}else {
			System.out.println(Math.abs(b - rightAmount));
		}

    }
}
