package baralho;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * Representa um baralho, sendo este uma pilha formada por
 * objetos Carta.
 *
 * @see Carta
 * @author thiago
 */
public class Baralho {

    /**
     * Pilha de cartas chamada baralho
     */
    private Stack<Carta> baralho;

    /**
     * Constrói um Baralho de acordo com a pilha de Cartas
     * passada por parâmetro
     * 
     * @see Carta
     * @param baralho - pilha de Cartas
     */
    public Baralho(Stack<Carta> baralho) {
        this.baralho = baralho;
    }

    /**
     * Cria um Baralho com 52 Cartas. 13 Cartas de cada Naipe, sendo os naipes
     * copas, espadas, ouros e paus.
     * 
     * @see Carta
     * @see Naipe
     */
    public Baralho() {
        this.baralho = new Stack<Carta>();
        for (int i = 1; i < 14; i++) {
            Carta carta1 = new Carta(i, Naipe.COPAS);
            this.addCarta(carta1);
            Carta carta2 = new Carta(i, Naipe.ESPADAS);
            this.addCarta(carta2);
            Carta carta3 = new Carta(i, Naipe.OUROS);
            this.addCarta(carta3);
            Carta carta4 = new Carta(i, Naipe.PAUS);
            this.addCarta(carta4);
        }
    }

    /**
     * Adiciona uma Carta no final da pilha.
     * 
     * @see Carta
     * @param carta a ser adicionada
     * @return true caso a Carta tenha sido adicionada com sucesso
     */
    protected boolean addCarta(Carta carta) {
        return this.baralho.add(carta);
    }

    /**
     * Embaralha o baralho
     */
    public void embaralhar() {
        Collections.shuffle(this.baralho);
    }

    public boolean cortar(int corte) {
        boolean retorno = false;
        List corteAbaixo = this.baralho.subList(0, corte);
        List corteAcima = this.baralho.subList(corte, baralho.size());
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

    @Override
    public String toString() {
        String saida = "";
        for (Carta carta : baralho) {
            saida += "[" + carta.toString() + "], ";
        }
        return saida;
    }
}
