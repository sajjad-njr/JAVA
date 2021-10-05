/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
 
public class Main implements Printable,Showable{
   
    public static void main(String[] args)
   {
       
       Main main = new Main();
       main.print();
       main.show();
   }

    @Override
    public void print() {
          System.out.println("Printable");
    }

    @Override
    public void show() {
         System.out.println("Showable");
    }
}
