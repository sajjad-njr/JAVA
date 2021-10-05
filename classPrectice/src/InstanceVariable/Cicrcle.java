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
class Cicrcle {

    int center_x, center_y;
    double radius;

    double getArea() {
        return 3.14 * radius * radius;
    }

    double getCircumference() {
        return 2 * 3.14 * radius;

    }
}

class CircleTest {

    public static void main(String[] args) {
        Cicrcle myCircle , myCircle2;
       
        myCircle = new Cicrcle();
        myCircle.center_x = 10;
        myCircle.center_y = 5;
        myCircle.radius = 3.5;

         myCircle2 = new Cicrcle();
        myCircle2.center_x = 120;
        myCircle2.center_y = 35;
        myCircle2.radius = 3.15;
        
        //myCircle2 = myCircle ;
        myCircle = myCircle2 ;
        
        System.out.println("The  radious of  Circle 1 is = " + myCircle.radius);
        System.out.println("The radius  of Circle 2 is = " + myCircle2.radius );
        System.out.println(myCircle);
        System.out.println(myCircle2);
    }
}
