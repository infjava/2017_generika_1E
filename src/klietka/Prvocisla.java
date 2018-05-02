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
public class Prvocisla implements Iterable<Integer> {

    private final int max;

    public Prvocisla(int max) {
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new PrvocislaIterator();
    }

    private class PrvocislaIterator implements Iterator<Integer> {
        private int aktualne;
        
        public PrvocislaIterator() {
            this.aktualne = 2;
        }

        @Override
        public boolean hasNext() {
            return this.aktualne <= Prvocisla.this.max;
        }

        @Override
        public Integer next() {
            int ret = this.aktualne;
            this.vypocitajDalsie();
            return ret;
        }

        private void vypocitajDalsie() {
            do {
                this.aktualne++;
            } while (!this.jePrvocislo());
        }

        private boolean jePrvocislo() {
            int maxSkusane = (int) Math.sqrt(this.aktualne);
            
            for (int i = 2; i <= maxSkusane; i++) {
                if (this.aktualne % i == 0)
                    return false;
            }
            
            return true;
        }
    }
}
