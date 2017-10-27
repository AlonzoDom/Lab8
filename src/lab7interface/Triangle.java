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
public class Triangle implements Shape{
    private double side1, side2, base;
    private String color;
    
    public Triangle(){
    }
    public Triangle(double a, double b, double c, String color){
        this.side1=a;
        this.side2=b;
        this.base=c;
        this.color = color;
    }
    public double area(){
        double s = (side1 + side2 + base) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - base));
    }
    public double perimeter(){
        return side1+side2+base;
    }
    public String color(){
        return color;
    }
}
