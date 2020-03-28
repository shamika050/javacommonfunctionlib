package hackerrank;
import java.util.Arrays;

public class ElectronicsShop {

	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		Arrays.sort(keyboards);
		Arrays.sort(drives);
		if(keyboards[0] + drives[0] > b) {
			return -1;
		}
		int max = 0;
		for(int i = 0;i < keyboards.length;i++) {
			for(int j = 0;j < drives.length;j++) {
				if(max < keyboards[i]+drives[j] && keyboards[i]+drives[j] <= b) {
					max = keyboards[i]+drives[j];
				}
			}
		}
		return max;
    }
	
}
