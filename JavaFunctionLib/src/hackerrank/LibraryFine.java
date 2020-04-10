package hackerrank;

import java.time.LocalDate;

public class LibraryFine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// Complete the libraryFine function below.
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
    	LocalDate date1 = LocalDate.of(y1, m1, d1);
        LocalDate date2 = LocalDate.of(y2, m2, d2);
        
        int days = date2.until(date1).getDays();
        int months = date2.until(date1).getMonths();
        if(days <= 0 && y1<=y2) {
            return 0;
        }
        if(y1 != y2) {
            return 10000;
        }
        if((y1 == y2 && m1== m2)&&days > 0) {
            return 15*days;
        }
        if(y1 == y2 && m1 > m2&&days > 0) {
            return 500*(m1-m2);
        }
        
        return -1;

    }

}
