/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que11;

import java.util.Objects;

/**
 *
 * @author S541994
 */
public class Icecream {

    /*declaring and initialization the variable flavor, color, cost*/
    String flavor;
    String color;
    int cost;

    /*creating an constructor for flavor, color, cost*/
    public Icecream(String flavor, String color, int cost) {
        this.flavor = flavor;
        this.color = color;
        this.cost = cost;
    }

    /*writing getter method for flavor and returning it*/
    public String getFlavor() {
        return flavor;
    }

    /*creating setter method for flavor */
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    /*creating getter method for color and returning color*/
    public String getColor() {
        return color;
    }

    /*inserted setter method*/
    public void setColor(String color) {
        this.color = color;
    }

    /*inserted getter method for cost and returing*/
    public int getCost() {
        return cost;
    }

    /*inserted setter method*/
    public void setCost(int cost) {
        this.cost = cost;
    }

    /*implemented hashCode method and initialize the value, adding the flavor and color and cost
    then returning the hash*/
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.flavor);
        hash = 59 * hash + Objects.hashCode(this.color);
        hash = 59 * hash + this.cost;
        return hash;
    }

    /*here boolean checks if the obj equals returns true, if it is null then it returns false
    Then it checks if flavor is not equal to other flavor, color and cost is not equal to other cost
    it return false or else it returns true
    
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Icecream other = (Icecream) obj;
        if (this.cost != other.cost) {
            return false;
        }
        if (!Objects.equals(this.flavor, other.flavor)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return true;
    }

}
