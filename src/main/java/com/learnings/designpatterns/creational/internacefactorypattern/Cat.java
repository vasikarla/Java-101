package com.learnings.designpatterns.creational.internacefactorypattern;

/**
 * The Class Cat.
 */
public class Cat implements Animal {

	/* (non-Javadoc)
	 * @see com.learnings.designpatterns.factorypattern.Animal#eat()
	 */
	public void eat() {
		System.out.println("Cat is eating..");
	}

}
