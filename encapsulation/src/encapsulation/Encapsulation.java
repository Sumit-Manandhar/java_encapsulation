/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author Sumit
 */
public class Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        modela ma = new modela();
ma.setstdName("sumit");
System.out.println(ma.getStdName());
     ma.setid(10);
    System.out.println(ma.getstdid());
   
    ma.setstdMarks(99.5);
System.out.println(ma.getStdMarks());
    
    }

   
   
}
