class Animal{
	public void makeSound(){
		System.out.println("cat");
		
	}
}
class Cat extends Animal{
	public void makeSound(){
		System.out.println("cat");
		super.makeSound();
	}
}
class Inheritance{
	public static void main(String... args){
		Cat c = new Cat();
		c.makeSound();
	}
}
