package hackerrank;

import java.util.Arrays;

public class DesignerPDFViewer {
	
	public static void main(String[] args) {
		String s = "1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 7";
		String word = "abc";
		Integer[] arr = Arrays.stream(s.split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
		System.out.println(designerPdfViewer(arr,word));
	}
	
	// Complete the designerPdfViewer function below.
    static int designerPdfViewer(Integer[] h, String word) {
    	
    	int maxH = h[0];
    	for(int i = 0;i < word.length();i++) {
    		int index = word.charAt(i) - 'a';
    		if(maxH < h[index]) {
    			maxH = h[index];
    		}
    	}
    	return maxH*word.length();

    }

}
