/**
 * Classes are a template for creating objects.
 * They encapsulate data with code to work on that data.
 * Classes in JS are built on prototypes but also have some syntax
 * and semantics that are not shared with ES5 class-like semantics.
 */

class Animal {
	constructor(age) {
		this.age = age;
	}

	move() {
		/* ... */
	}
}

/**
 * Inheritance enables you to define a class that takes all the functionality
 * from a parent class and allows you to add more.
 * To use class inheritance, you use the extends keyword
 */
class Mammal extends Animal {
	constructor(age, furColor) {
		super(age);
		this.furColor = furColor;
	}

	liveBirth() {
		/* ... */
	}
}

const mammal = new Mammal(1, "brown");
mammal.liveBirth();
mammal.move();

/**
 * Here, Human is a subclass of Mammal, which is a subclass of Animal.
 */
class Human extends Mammal {
	constructor(age, furColor, languageSpoken) {
		super(age, furColor);
		this.languageSpoken = languageSpoken;
	}

	speak() {
		/* ... */
	}
}

const human = new Human(25, "brown", "English");
human.speak();
human.move();
