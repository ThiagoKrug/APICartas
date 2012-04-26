/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package baralho;

import java.util.Stack;

/**
 *
 * @author thiago
 */
public class Descarte extends Baralho {

    public Descarte(Stack<Carta> descarte) {
        super(descarte);
    }

    public Descarte() {
        super(new Stack<Carta>());
    }
    
    @Override
    public boolean addCarta(Carta carta) {
        return super.addCarta(carta);
    }
}
