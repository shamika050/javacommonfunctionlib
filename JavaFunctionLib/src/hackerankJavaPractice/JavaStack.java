package hackerankJavaPractice;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class JavaStack {

	public static void main(String[] args) {
	   String input="}])}";
       System.out.println(isClosed(input));

	}
	
	private static boolean isClosed(String s) {
		if(s.length()%2==1) {
			return false;
		}
		Deque<Character> stack  = new ArrayDeque<Character>();
		for(int i = 0;i < s.length();i++) {
			if(isOpenB(s.charAt(i))) {
				stack.push(s.charAt(i));
			}
			if(isClsedB(s.charAt(i))) {
				if(stack.size() == 0) {
					return false;
				}
				Character c = stack.pop();
				if(c != oppotitChar(s.charAt(i))) {
					return false;
				}
			}
			if(i == s.length() - 1 && stack.size() !=0 ) {
				return false;
			}
			
		}
		return true;

	}
	
	private static Character oppotitChar(Character c) {
		
		if(c == '{') {
			return '}'; 
		}
		if(c == '(') {
			return ')'; 
		}
		if(c == '[') {
			return ']'; 
		}
		if(c == '}') {
			return '{'; 
		}
		if(c == ')') {
			return '('; 
		}
		if(c == ']') {
			return '['; 
		}
		return null;
	}
	
	private static Boolean isClsedB(Character c) {
		
		if(c == '}') {
			return true; 
		}
		if(c == ')') {
			return true; 
		}
		if(c == ']') {
			return true; 
		}
		return false;
	}
	
private static Boolean isOpenB(Character c) {
		
		if(c == '{') {
			return true; 
		}
		if(c == '(') {
			return true; 
		}
		if(c == '[') {
			return true; 
		}
		return false;
	}

}
