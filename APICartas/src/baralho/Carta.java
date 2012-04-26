/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package baralho;

/**
 *
 * @author thiago
 */
public class Carta {
    private int numero;
    private Naipe naipe;

    public Carta(int numero, Naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    public int getNumero() {
        return numero;
    }

    public Naipe getNaipe() {
        return naipe;
    }
    
    @Override
    public String toString() {
        return this.getNumero() + ", " + this.getNaipe();
    }
}
