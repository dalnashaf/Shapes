package org.cvtc.shapes;

public abstract class Shape {
	
	protected Dialog dialog;
	public Shape(Dialog dialog) {
		this.dialog = dialog;
	}
	
	//Abstract classes cannot be instantiated, but they can be sub classed.
	//In other words, a class that is declared with abstract keyword
	public abstract float surfaceArea();
	public abstract float volume();
	
}
