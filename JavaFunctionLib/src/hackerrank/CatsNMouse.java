package hackerrank;

public class CatsNMouse {

	static String catAndMouse(int x, int y, int z) {
		
		if(Math.abs(x - z) == Math.abs(y - z)) {
			return "Mouse C";
		}
		if(Math.abs(x - z) < Math.abs(y - z)) {
			return "Cat A";
		}
		if(Math.abs(x - z) > Math.abs(y - z)) {
			return "Cat B";
		}
		return "";

    }
	
}
