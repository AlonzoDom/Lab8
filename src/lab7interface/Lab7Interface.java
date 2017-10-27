/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7interface;

/**
 *
 * @author ad144
 */
public class Lab7Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape Rectangle = new Rectangle(7,8,"Green");
        System.out.println("Width of Rectangle = " + 7 + " Length of Rectangle = " + 8 + "\nArea of Rectangle = " + Rectangle.area() + "\nPerimeter of Rectangle = " + Rectangle.perimeter());
        System.out.println("Color of Rectangle = " + Rectangle.color());
        System.out.println("\n\n");
        
        Shape Triangle = new Triangle(9,10,11,"Orange");
        System.out.println("Length of Side 1, Side 2, and the Base respectively are: " + 9 + " " + 10 + " and " + 11 + "\nArea of Triangle = " + Triangle.area() + "\nPerimeter of Triangle = " + Triangle.perimeter());
        System.out.println("Color of Triangle = " + Triangle.color());
        System.out.println("\n\n");
        
        Shape Circle = new Circle(12,"Black");
        System.out.println("Radius of Circle " + 12 + "\nArea of Circle = " + Circle.area() + "\nPerimeter of Circle = " + Circle.perimeter());
        System.out.println("Color of Circle = " + Circle.color());
    }
    
}
