package hackerrank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ClimbingLeaderboard {
	public static void main(String[] args) {
		int[] sc = {100,100,50,40,40,20,10};
		int[] al = {5,25,50,120};	
//		int[] sc = {100,90,90,80,75,60};
//		int[] al = {50,65,77,90,102};
		Arrays.stream(climbingLeaderboard(sc,al)).forEach(System.out::println);
	}
	
//	 static int[] climbingLeaderboard(int[] scores, int[] alice) {
//		 Map<Integer,Integer> map = new HashMap<Integer,Integer>();
//		 List<Integer> output = new ArrayList<Integer>();
//		 int a = 1;
//		 map.put(scores[0], a);
//		 for (int j = 0;j < scores.length - 1;j++) {
//			if(scores[j] > scores[j+1]) {
//				a++;
//				map.put(scores[j+1], a);
//	    	}
//	    	
//		}
//		
//		 
//		 
//		 return output.stream().mapToInt(Integer::intValue).toArray();
//	 }
	

	// Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
    	
    	List<Integer> score_l = Arrays.stream(scores).boxed().collect(Collectors.toList());
    	List<Integer> rank = getRankList(score_l);
    	//Collections.reverse(score_l);
    	List<Integer> output = new ArrayList<Integer>();
    	int c = 0;
    	for(int i = 0;i < alice.length;i++) {
   		
    		for(int k = 0;k < score_l.size();k++) {
    			
    			if(alice[i] >= score_l.get(k)) {
    				output.add(rank.get(k));
    				score_l = updateScoreList(score_l,k,alice[i]);
    				rank = updateRankList(score_l,rank,k,rank.get(k));
    				break;
    			}
    			
    			if(k == score_l.size() || alice[i] > score_l.get(k)) {
    				break;
    			}
    		}

    		if(alice[i] < score_l.get(score_l.size() - 1)) {
    			rank.add(rank.get(rank.size() - 1)+1);
    			score_l.add(alice[i]);
				output.add(rank.get(rank.size() - 1));

			}
    		if(alice[i] > score_l.get(0)) {
				output.add(0);
				score_l.add(alice[i]);
				rank.add(1);
			}
    		
    	}
    	return output.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public static List<Integer> getRankList(List<Integer> score_l){
    	List<Integer> rank = new ArrayList<Integer>();
    	int a = 0;
    	rank.add(1);
    	for (int j = 0;j < score_l.size() - 1;j++) {
    		if(score_l.get(j) > score_l.get(j+1)) {
    			a++;
    		}
    		rank.add(a+1);
		}
    	return rank;
    }
    
    public static List<Integer> updateRankList(List<Integer> score_l,List<Integer> ranks,int n,int newC){
    	ranks.add(0);
    	int temp = ranks.get(n);
    	int temp2 = ranks.get(n);
    	for (int j = n;j < score_l.size() - 1;j++) {
    		
    		if(n == newC) {
    			temp2 = ranks.get(j+1);
    			ranks.set(j+1,temp);
        		temp = temp2;
    		}else {
    			temp2 = ranks.get(j+1);
    			ranks.set(j+1,temp+1);
    			temp = temp2;
    		}
		}
    	ranks.set(n, newC);
    	return ranks;
    }
    
    public static List<Integer> updateScoreList(List<Integer> score_l,int n,int newC){
    	score_l.add(0);
    	int temp = score_l.get(n);
    	int temp2 = score_l.get(n);
    	for (int j = n;j < score_l.size() - 1;j++) {
    		temp2 = score_l.get(j+1);
    		score_l.set(j+1,temp);
    		temp = temp2;
		}
    	score_l.set(n, newC);
    	return score_l;
    }
}
