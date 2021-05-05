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
public class Parallelogram extends GeometricObject {
	int width, height;

	public Parallelogram(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return width * height;
	}

}
