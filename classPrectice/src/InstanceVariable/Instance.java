/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturepractice;

/**
 *
 * @author Talha Bin Rais
 */
public class Instance {
    
}

class Circle{
    int center_x,center_y;
    double radius;
    
    
    Circle(int center_x,int center_y,double radius)
    {
        this.center_x =  center_x;
        this.center_y = center_y;
        this.radius = radius;
    }
    
    void icca(double radius)
    {
        this.radius = 10.5;
    }
     
}

class CicrleTest{
    public static void main(String[] args) {
            Circle myCircle = new Circle(2,3,5.5);
            
        myCircle.icca(7.8);  
        System.out.println("Radius = "+myCircle.radius);
    }
}