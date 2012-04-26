/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package baralho;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author thiago
 */
public class Baralho {

    private Stack<Carta> baralho;

    public Baralho(Stack<Carta> baralho) {
        this.baralho = baralho;
    }

    public Baralho() {
        this.baralho = new Stack<Carta>();
        for (int i = 1; i < 14; i++) {
            for (int j = 0; j < 4; j++) {
                Carta carta = null;
                if (j == 0) {
                    carta = new Carta(i, Naipe.COPAS);
                } else if (j == 1) {
                    carta = new Carta(i, Naipe.ESPADAS);
                } else if (j == 2) {
                    carta = new Carta(i, Naipe.OUROS);
                } else if (j == 3) {
                    carta = new Carta(i, Naipe.PAUS);
                }
                this.addCarta(carta);
            }
        }
    }

    protected boolean addCarta(Carta carta) {
        return this.baralho.add(carta);
    }

    public void embaralhar() {
        Collections.shuffle(this.baralho);
    }

    public boolean cortar(int corte) {
        boolean retorno = false;
        List corteAbaixo = this.baralho.subList(0, corte);
        List corteAcima = this.baralho.subList(corte, size());
        this.baralho = null;
        this.baralho = new Stack<Carta>();
        retorno = this.baralho.addAll(corteAcima);
        if (retorno) {
            retorno = this.baralho.addAll(corteAbaixo);
        } else {
            this.baralho.addAll(corteAbaixo);
        }
        return retorno;
    }

    public Carta getPrimeiraCarta() {
        return this.baralho.pop();
    }

    public Carta getUltimaCarta() {
        return this.baralho.remove(0);
    }

    public void passarPrimeiraCartaParaUltimaPosicao() {
        Carta carta = this.getPrimeiraCarta();
        this.baralho.insertElementAt(carta, 0);
    }

    public int size() {
        return this.baralho.size();
    }

    @Override
    public String toString() {
        String saida = "";
        for (Carta carta : baralho) {
            saida += "[" + carta.toString() + "], ";
        }
        return saida;
    }
}
