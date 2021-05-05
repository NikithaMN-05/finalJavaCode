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
public class ComparableCircle extends Circle implements Comparable<Circle> {

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Circle circle) {
        return this.getArea().compareTo(circle.getArea());
    }

}
