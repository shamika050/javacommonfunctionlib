package hackerankJavaPractice;

import java.util.Calendar;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Welcome {

	public static void main(String[] args){

		System.out.println(findDay(3,16,2020));
			
	}//end of main
	
	public static String findDay(int month, int day, int year) {
        Calendar c = Calendar.getInstance();
        c.set(year,month-1,day);
        int date = c.get(Calendar.DAY_OF_WEEK);

        switch(date){
            case 1:
                return "SUNDAY";
 
            case 2:
                return "MODAY";

            case 3:
                return "TUESDAY";

            case 4:
                return "WEDNESDAY";

            case 5:
                return "THURSDAY";

            case 6:
                return "FRIDAY";

            case 7:
                return "SATURDAY";
            default :
                return "";
        }

    }

	}

