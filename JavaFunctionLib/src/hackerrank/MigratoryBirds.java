package hackerrank;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MigratoryBirds {
	
	static int migratoryBirds(List<Integer> arr) {
		
		return Collections.max(arr.stream()
		.sorted((a,b)->a-b)
		.collect(
				Collectors.groupingBy(
						Function.identity(),
						Collectors.counting()
				)
		).entrySet(),Map.Entry.comparingByValue()).getKey();

    }

}
