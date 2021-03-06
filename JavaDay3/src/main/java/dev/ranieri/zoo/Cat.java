package dev.ranieri.zoo;

// putting extends inherits from a class. Creates an is-a relationship between two classes
// a Cat is an animal
public class Cat extends Animal implements Carnivore, Herbivore, Petable, Fetchable{
	
	// Cat does have a species and age variable
	// We just do not see it because it was defined in the parent class
	int lives = 9;
	
	public Cat(int age) {
		super("Cat",age);
	}
	
	@Override // just verifies that you are indeed overriding something
	public void makeSound() {
		System.out.println("The cat goes meow");
	}
		
	public void scratch() {
		System.out.println("scratch up everything");
	}

	public void eatPlant() {
		System.out.println("Eats cat nip");		
	}

	public void eatMeat() {
		System.out.println("Eats fish out of a can");		
	}
}
