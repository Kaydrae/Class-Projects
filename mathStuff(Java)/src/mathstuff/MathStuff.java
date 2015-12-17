
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
public class MathStuff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Square s1 = new Square();
        Circle c1 = new Circle();
        
        
        //Square
        s1.setSide(5.2);
        System.out.println("Square Area: " + s1.getArea());
        //Space
        System.out.println();
        System.out.println("Square Perimeter: " + s1.getPerimeter());
        
        //Circle
        c1.setRadius(5);
        //Space
        System.out.println();
        System.out.println("Circle Area: " + c1.getArea());
        //Space
        System.out.println();
        System.out.println("Circle Circumference: " + c1.getPerimeter());
    }
    
}
