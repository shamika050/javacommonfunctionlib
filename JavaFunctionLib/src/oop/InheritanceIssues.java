package oop;

public class InheritanceIssues {
	
	public static void main(String[] args) {
		Animal a = new Dog("Lucky");
		a.poop(a.getClass().getSimpleName());
		/**
		 * Problem occuer if we need another class like MurderBotDog with bark(),kill() and drive() abilities
		 * without poop
		 * https://medium.com/humans-create-software/composition-over-inheritance-cb6f88070205
		 * 
		 * To resolve this we need Composition
		 */
	}
	
	static class Animal{
		
		public void poop(String animal) {
			System.out.println(animal+" pooping");
		}
		
	}
	
	static class Robot{
		
		public void drive(String robot) {
			System.out.println(robot+" Driving");
		}
		
	}
	
	static class Dog extends Animal{
		private String name;
		public Dog(String name) {
			super();	
			this.setName(name);
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public void bark() {
			System.out.println(this.getClass().toString()+" "+name+" Barking!");
		}
	}
	
	static class Cat extends Animal{
		private String name;
		public Cat(String name) {
			this.setName(name);
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public void meow() {
			System.out.println(this.getClass().toString()+" "+name+" Meowing!");
		}
	}
	
	static class CleaningBot extends Robot{
		private String name;
		public CleaningBot(String name) {
			this.setName(name);
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public void clean() {
			System.out.println(this.getClass().toString()+" "+name+" Cleaning!");
		}
	}
	
	static class MurderBot extends Robot{
		private String name;
		public MurderBot(String name) {
			this.setName(name);
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public void kill() {
			System.out.println(this.getClass().toString()+" "+name+" Killing!");
		}
	}

}
