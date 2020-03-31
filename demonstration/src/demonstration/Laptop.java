/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demonstration;

/**
 *
 * @author pro
 */
public class Laptop extends Ordinateur {
    float autonomie;

    public float getAutonomie() {
        return autonomie;
    }

    public void setAutonomie(float autonomie) {
        this.autonomie = autonomie;
    }

    public Laptop(String marque, String cpu, String graphiques, int ram, float prix) {
        super(marque, cpu, graphiques, ram, prix);
    }

    public Laptop(float autonomie, String marque, String cpu, String graphiques, int ram, float prix) {
        super(marque, cpu, graphiques, ram, prix);
        this.autonomie = autonomie;
    }

    public Laptop() {
    }

   
    
}
