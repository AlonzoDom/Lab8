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
public class Rectangle implements Shape{
    private double length, width;
    private String color;
    
    public Rectangle(){
    }
    public Rectangle(double w, double l, String c){
        this.width = w;
        this.length = l;
        this.color = c;
    }
    public double area(){
        return length*width;
    }
    public double perimeter(){
        return 2*(width+length);
    }
    public String color(){
        return color;
    }
}
