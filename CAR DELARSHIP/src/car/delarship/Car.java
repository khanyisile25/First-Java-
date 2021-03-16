/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.delarship;

/**
 *
 * @author makhanyi
 */
public class Car {

    String Make="Audi german car";
    String Model="A4,2021 year of manufature new Audi A4";
    String ModelDetails="Five seat, All wheel drive standard, Standard mild hybreed system";
 
public static void main (String[]args){
    Car myobj=new Car();
    System.out.println("Make."+ myobj.Make);
    System.out.println("Model."+ myobj.Model);
    System.out.println("ModelDetails"+ myobj.ModelDetails);
}    
    
}
