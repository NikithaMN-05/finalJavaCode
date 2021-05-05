/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que3;

/**
 *
 * @author S541994
 */
public class Icecream {

    private String flavor;
    private String color;
    private double cost;

    public Icecream(String flavor, String color, double cost) {
        this.flavor = flavor;
        this.color = color;
        this.cost = cost;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Icecream{" + "flavor=" + flavor + ", color=" + color + ", cost=" + cost + '}';
    }

}
