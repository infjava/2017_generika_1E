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
abstract class Zviera {
    void zozer(Jedlo potrava) {
        System.out.println(
                this.getClass().getSimpleName()
                + " ti dakuje za " +
                potrava.getClass().getSimpleName()
        );
    }
}
