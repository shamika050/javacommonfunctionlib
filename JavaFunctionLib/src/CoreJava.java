
public class CoreJava {
	
	public static void main(String[] args) {
		Nested ns = new Nested();
		ns.name();
		
		//NestedInner ni = (new CoreJava()).new NestedInner();
		//ni.name();
	}
	
	static void hellMe() {
		System.out.println("Hell me");
	}
	
	void Blao() {
		System.out.println("Blao me");
	}
	
	static class Nested{
		
		static int val = 9;
		
		public Nested() {
			//val = 10;
			System.out.println("Constructor calling ...");
		}
		
		static {
			val = 11;
			System.out.println("Block executing...");
		}
		
		public void name() {
			NestedInner ni = (new CoreJava()).new NestedInner();
			ni.name();
			//Blao();
			System.out.println("Val "+val);
			System.out.println(this.getClass().getSimpleName());
		}
		
	}
	
	class NestedInner{
		public void name() {
			Blao();
			System.out.println(this.getClass().getSimpleName());
		}
		
	}
	
	

}
