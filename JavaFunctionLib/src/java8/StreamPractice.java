package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
	
	public static void main(String[] args) {
		int[] array = {12,3,4,2,5,21};
		List<Integer> list = Arrays.stream(array).boxed().map(a->a*a).collect(Collectors.toList());
		int sum = Arrays.stream(array).sum();
		int even = Arrays.stream(array).reduce(0,(i,j)->i+j);	
		list.forEach(System.out::println);
	}

}
