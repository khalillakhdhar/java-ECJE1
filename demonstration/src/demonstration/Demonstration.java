/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demonstration;

import javax.swing.JOptionPane;

/**
 *
 * @author pro
 */
public class Demonstration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //System.out.println("bienvenu à JAVA");
       // JOptionPane.showMessageDialog(null, "bienvenu à JAVA");
       Ordinateur pc1=new Ordinateur("ASUS GAMER","I7", "GFORCE",16, 2600); //instance
       Ordinateur pc2=new Ordinateur();
       pc2.setMarque("Toshiba");
       Laptop lap1=new Laptop(3, "ASUS GAMER","I7", "GFORCE",16, 2600);
       Ordinateur lap2=new Laptop("teste", "teste", "teste", 8, 2000);
      
       //pc2.marque="toshiba";
       pc2.setCpu("i5");
       pc2.setPrix(1800);
       System.out.println(pc1.toString());
       System.out.println(pc2.toString());
       lap1.taxes();
    }
    
}
