/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klietka;

import java.util.Iterator;

/**
 *
 * @author janik
 */
public class Postupnost implements Iterable<Integer> {

    private final int cisloOd;
    private final int cisloDo;

    public Postupnost(int cisloOd, int cisloDo) {
        this.cisloOd = cisloOd;
        this.cisloDo = cisloDo;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new PostupnostIterator();
    }

    private class PostupnostIterator implements Iterator<Integer> {
        private int aktualneCislo;
        
        public PostupnostIterator() {
            this.aktualneCislo = Postupnost.this.cisloOd - 1;
        }

        @Override
        public boolean hasNext() {
            return this.aktualneCislo < Postupnost.this.cisloDo;
        }

        @Override
        public Integer next() {
            this.aktualneCislo++;
            return this.aktualneCislo;
        }
    }
}
