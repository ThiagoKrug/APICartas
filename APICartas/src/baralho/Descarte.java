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
public class Descarte {
    
    private Stack<Carta> baralho;

    public Descarte() {
        this.baralho = new Stack<Carta>();
    }
    
    public boolean addCarta(Carta carta) {
        Carta verifica = this.baralho.push(carta);
        if (verifica != null) {
            return true;
        }
        return false;
    }
    
    public Carta verCarta(int posicao) {
        return this.baralho.get(posicao);
    }
}
