package oop;

public class CompositionOverInheritance {
	
	public static void main(String[] args) {
		Dog dog = new Dog("doggy");
		dog.barker.bark(dog.getName());
	}
	
	interface Barkable{
		public void bark(String name);
	}
	
	static class Barker implements Barkable{

		@Override
		public void bark(String name) {
			System.out.println(this.getClass().toString()+" "+name+" Barking!");
		}
		
	}
	
	interface Poopable{
		public void poop(String name);
	}
	
	static class Pooper implements Poopable{

		@Override
		public void poop(String name) {
			System.out.println(this.getClass().toString()+" "+name+" Pooping!");
		}
		
	}
	
	interface Killable{
		public void kill(String name);
	}
	
	static class Killer implements Killable{

		@Override
		public void kill(String name) {
			System.out.println(this.getClass().toString()+" "+name+" Killing!");
		}
		
	}
	
	interface Drivable{
		public void drive(String name);
	}
	
	static class Driver implements Drivable{

		@Override
		public void drive(String name) {
			System.out.println(this.getClass().toString()+" "+name+" Dring!");
		}
	}
	
	interface Meowble{
		public void meow(String name);
	}
	
	static class Meower implements Meowble{

		@Override
		public void meow(String name) {
			System.out.println(this.getClass().toString()+" "+name+" Meowing!");
		}
	}
	
	static class Dog{
		private String name;
		private Barker barker = new Barker();
		public Dog(String name) {
			this.setName(name);
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	
	static class Cat{
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
	
	static class CleaningBot{
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
	
	static class MurderBot{
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
