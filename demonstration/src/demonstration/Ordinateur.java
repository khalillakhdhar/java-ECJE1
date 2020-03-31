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
public class Ordinateur {
   private String marque,cpu,graphiques;
    private int ram;
   private float prix;

    public Ordinateur(String marque, String cpu, String graphiques, int ram, float prix) {
        this.marque = marque;
        this.cpu = cpu;
        this.graphiques = graphiques;
        this.ram = ram;
        this.prix = prix;
    }

    public Ordinateur() {
    }

    public String getMarque() {
        return marque;
    }

    public String getCpu() {
        return cpu;
    }

    public String getGraphiques() {
        return graphiques;
    }

    public int getRam() {
        return ram;
    }

    public float getPrix() {
        return prix;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setGraphiques(String graphiques) {
        this.graphiques = graphiques;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Ordinateur{" + "marque=" + marque + ", cpu=" + cpu + ", graphiques=" + graphiques + ", ram=" + ram + ", prix=" + prix + '}';
    }
    
   
   protected void taxes()
   {
       double taxes= prix*0.12 ;
       double pf=taxes+this.prix;
       JOptionPane.showMessageDialog(null, "le taux de TVA est de "+taxes+" et le prix totale est: "+pf);
   }
    
    
    
}
