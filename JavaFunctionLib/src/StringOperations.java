import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringOperations {
	
	//String s = "278 576 496 727 410 124 338 149 209 702 282 718 771 575 436";
	static List<Integer> StringToIntegerList(String s){
		return Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
	}

}
