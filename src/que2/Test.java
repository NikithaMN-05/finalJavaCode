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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("***NARSING RAO NIKITHA MADHARI***");

        GeometricObject[] geoMetricObject = new GeometricObject[5];
        geoMetricObject[0] = new Triangle(10, 11);
        geoMetricObject[1] = new Rectangle(12, 11);
        geoMetricObject[2] = new Square();
        geoMetricObject[3] = new Rhombus(7, 5);
        geoMetricObject[4] = new Parallelogram(2, 25);

        for (int i = 0; i < geoMetricObject.length; i++) {

            System.out.println("index " + i + " area = " + geoMetricObject[i].getArea());
            if (geoMetricObject[i] instanceof Colorable) {
                System.out.println("How to color: " + ((Colorable) geoMetricObject[i]).howToColor());
            }
        }

    }
}
