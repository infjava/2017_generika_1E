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
        Klietka<Lev> k = new Klietka<Lev>();
        k.vloz(new Lev());
        k.vlozPotravu(new Skrecok());
        k.vypisZvieratko();
        
        /*** priklad 2. ***/
        for (Integer cislo : new Postupnost(1, 10)) {
            System.out.println("- " + cislo);
        }
        
        /*
        prepisane:
            Iterator<Integer> prst = new Postupnost(1, 10).iterator();
            while (prst.hasNext()) {
                Integer cislo = prst.next();
                System.out.println("- " + cislo);
            }
        */
    }
}
