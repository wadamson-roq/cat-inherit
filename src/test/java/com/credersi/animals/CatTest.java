package com.credersi.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CatTest {
	@Test
	public void testInitialState() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		assertEquals(cat.howHungry(), 50);
	}

@Test
public void testCatsVsDogs() {
	Cat cat = new Cat();
	Dog dog = new Dog();
	for (int i = 0; i < 2; i++) {
		cat.runs();
		cat.runs();
		dog.runs();
		dog.runs();
	}
	assertTrue(cat.isAlive());
	assertFalse(dog.isAlive());
	}

}