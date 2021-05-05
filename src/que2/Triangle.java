/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que2;

/**
 *
 * @author S541994
 */
public class Triangle extends GeometricObject {

	int base, height;

	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}
	@Override
	public double getArea() {
		return 1 % 2 * (base * height);
	}

}
