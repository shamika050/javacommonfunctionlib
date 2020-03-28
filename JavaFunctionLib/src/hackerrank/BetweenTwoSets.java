package hackerrank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BetweenTwoSets {
	
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		a.add(2);
		a.add(6);
		List<Integer> b = new ArrayList<Integer>();
		b.add(24);
		b.add(36);
		b.add(96);
		
		System.out.println(factorMap(a));
		System.out.println(getTotalX(a,b));
	}
	
	public static int getTotalX(List<Integer> a, List<Integer> b) { 
		Collections.sort(a,(x,y)->x-y);
		Collections.sort(b,(x,y)->x-y);
		
		return (int) IntStream.rangeClosed(a.get(a.size() - 1), b.get(0)).filter(y->isElementsAreFactors(a,y)).filter(x->isFactorOfAllElements(b,x)).count();
	}
	
	public static boolean isFactorOfAllElements(List<Integer> a,Integer n) {
		return a.stream().filter(x->x%n==0).count()==a.size();
	}
	
	public static boolean isElementsAreFactors(List<Integer> a,Integer n) {
		return a.stream().filter(x->n%x==0).count()==a.size();
	}

	public static Integer lcm(List<Integer> a) {
		Map<Integer,Integer> map = factorMap(a); 
		return map.keySet().stream().filter(y->map.get(y)!=0).reduce(1, (n,m)->n*pow(m, map.get(m)));
	}
	
	public static int pow(int a,int n) {
		return (int) Math.pow(a, n);
	}
	
	public static Map<Integer,Integer> factorMap(List<Integer> a){
		
		Collections.sort(a, (x,y)->x-y);
		
		int numberH = a.get(a.size() - 1);
		
		List<Integer> primeList = getPrimeList(2,numberH);
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for (Integer i : a) {
			for (Integer j : primeList) {
				if(j > i) {
					break;
				}
				int count = 0;
				int temp = i;
				while(temp%j == 0) {
					temp = temp/j;
					count++;
				}
				if(!map.containsKey(j) || map.get(j) < count) {
					map.put(j, count);
				}
				count = 0;
			}
		}
		return map;
		
	}
	
	
	public static boolean isPrime(int number) {
		return IntStream.rangeClosed(2, (int)Math.sqrt(number)).filter(a->number%a==0).count()==0;
	}
	
	public static List<Integer> getPrimeList(int start,int number){
		
		return IntStream.rangeClosed(start, number).filter(a->isPrime(a)).boxed().collect(Collectors.toList());
		
	}

}
