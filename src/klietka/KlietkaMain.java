/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klietka;

/**
 *
 * @author janik
 */
public class KlietkaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Klietka<Skrecok> k = new Klietka<Skrecok>();
        k.vloz(new Skrecok());
        k.vlozPotravu(new Kukurica());
        k.vypisZvieratko();
    }
}
