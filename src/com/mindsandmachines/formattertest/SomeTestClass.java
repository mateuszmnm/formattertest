package com.mindsandmachines.formattertest;

/**
 * Test something.
 */
public class SomeTestClass {
	public SomeTestClass() {
	}

	public void someFunction() {
		int value = 1;

		value = addSomethingToValue(value);
	}

	private int addSomethingToValue(final int value) {
		return value + 10;
	}
}
