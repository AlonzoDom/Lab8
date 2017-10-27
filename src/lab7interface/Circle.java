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
public class Circle implements Shape{
    private double radius;
    private String color;
    public Circle() {
    }
    public Circle(double a, String c) {
        this.radius = a;
        this.color = c;
    }
    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
    public String color(){
        return color;
    }
}
