package org.cvtc.shapes;
public class ShapeFactory {
Dialog dialog;

/**
 * @return the dialog
 */
public Dialog getDialog() {
	return dialog;
}

/**
 * @param dialog the dialog to set
 */
public void setDialog(Dialog dialog) {
	this.dialog = dialog;
}

/**
 * @param dialog
 */
public ShapeFactory(Dialog dialog) {
	this.dialog = dialog;
}

public Renderer make(ShapeType type) {
	if (type == null) {
		return null;
		}
	if (type == ShapeType.Sphere ) {
		return new Sphere(10, new MessageBox());
		}
	if (type == ShapeType.Cuboid) {
		return new Cuboid(10, 10, 10, new MessageBox());
		}
		return new Cylinder(10, 10, new MessageBox());
  	}
}


