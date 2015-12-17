/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathstuff;

/**
 *
 * @author Ke'Ondrae
 */
public class Circle extends Shape {
    
    private double radius; 
    
    void setRadius(double radius){
    
        this.radius = radius;
        setPerimeter(2 * Math.PI * radius); //Circumference
        setArea(Math.PI * radius * radius);
    }
    
    double getRadius(){
    
    return radius;
    }
}
