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
public class CARDELARSHIP {

    String Make;
    String Model;
    String ModelDetails;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Car myobj=new Car();
    System.out.println("Make:."+ myobj.Make);
    System.out.println("Mode:l."+ myobj.Model);
    System.out.println("ModelDetails:"+ myobj.ModelDetails);
    }
    
}
