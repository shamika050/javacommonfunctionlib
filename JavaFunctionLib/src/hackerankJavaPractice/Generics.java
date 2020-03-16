package hackerankJavaPractice;

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	class Printer<T>
	{
		public void printArray(T[] array) {
			for (T t : array) {
				System.out.println(t);
			}
		}
	 
	}

}
