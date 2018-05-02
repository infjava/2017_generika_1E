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
class Klietka {
    private Skrecok zviera;

    public Klietka() {
        this.zviera = null;
    }
    
    void vloz(Skrecok zviera) {
        this.zviera = zviera;
    }

    void vypisZvieratko() {
        if (this.zviera == null) {
            System.out.println("Klietka je prazdna");
        } else {
            System.out.println("V klietke je skrecok");
        }
    }
}
