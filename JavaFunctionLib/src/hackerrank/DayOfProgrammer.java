package hackerrank;

public class DayOfProgrammer {
	
	static String dayOfProgrammer(int year) {
		String d1 = "12.09."+year;
		String d2 = "13.09."+year;
		String d5 = "26.09."+year;
		
		if(year == 1918) {
			return d5;
		}
		if(year%4 == 0 && year < 1918) {
			return d1;
		}else if(year%4 != 0 && year < 1918) {
			return d2;
		}
		if(year%400 == 0 && year > 1918) {
			return d1;
		}else if((year%4 == 0 && year%100 != 0) && year > 1918) {
			return d1;
		}else if(year > 1918) {
			return d2;
		}
		return "";
		
    }

}
