/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hutthike;

/**
 *
 * @author Ke'Ondrae
 */

public class HuttHike {

  
    public static void main(String[] args) {
        
       for(int num = 0; num <= 100; num = num +1)
        {
        
        if(num == 21){
            System.out.print("Hutt/Hike, ");
            }
              
        else if(num % 3 == 0){
            
            System.out.print("Hutt, ");   
            }
            
        else if (num % 7 ==0){
            System.out.print("Hike, ");
            
        }       
        else{
                    
            System.out.print(num + ", " );     
                    }
        }
    }
    
}



