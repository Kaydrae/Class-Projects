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
public class Square extends Shape {
    
    private double side;
    
    void setSide(double side){
    
        this.side = side;
        setPerimeter(side *4);
        setArea(side * side);
    }
   
    double getSide(){
    
    return side;
    }
}
