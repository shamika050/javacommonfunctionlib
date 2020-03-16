package hackerankJavaPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class RegexJava{

    public static void main(String[] args){
    	//String IP = "255.";
    	String IP = "300.300.300.300";
        System.out.println(IP.matches(new MyRegex().pattern));

    }
}

	class MyRegex{
        //static final String pattern = "[0-9]{3}.{1}[0-9]{3}.{1}[0-9]{3}.{1}[0-9]{3}.{1}";
        static final String pattern = "^([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])[.]([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])[.]([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])[.]([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])$";
    } 
//Write your code here