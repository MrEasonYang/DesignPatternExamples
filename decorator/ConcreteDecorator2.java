package com.designpattern.realDecorator;

/**
 * Created by Eason Yang on 12/31/2016.
 */
public class ConcreteDecorator2 extends Decorator
{
	public ConcreteDecorator2(Component component) {
		super(component);
	}

	@Override
	public void test() {
		super.test();
		this.test2();
	}

	private void test2() {
		System.out.println("Function 3");
	}
}

