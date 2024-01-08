package com.Basics;

interface Animal{
	void sound();
}
interface Animal1 extends Animal{
	void sound();
}
class Dog implements Animal,Animal1{
	@Override
	public void sound() {
		System.out.println("Barking Boww");
	}
}

class Cat implements Animal{
	@Override
	public void sound() {
		System.out.println("Making sound Meow");
	}
}
public class TestInterface {

	public static void main(String[] args) {
		Dog d=new Dog();
		Cat c=new Cat();
		d.sound();
		c.sound();
	}
}
