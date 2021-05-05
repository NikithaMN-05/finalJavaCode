/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que5;

/**
 *
 * @author S541994
 */
public class Circle {

    private double radius;
    private double pi = 3.14;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Double getArea() {
        return pi * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
