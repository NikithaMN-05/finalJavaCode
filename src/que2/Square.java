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

public class Square extends GeometricObject implements Colorable {

	private double x;
    private double y;
    private double side;

    Square() {
        this(0,0,10);
    }

    Square(double x, double y, double side) {
        this.x = x;
        this.y = y;
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }


    @Override
    public String howToColor() {
        return "Color all four sides.";
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
