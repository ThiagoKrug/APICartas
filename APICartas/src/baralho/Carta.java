package baralho;

/**
 * A classe Carta contém o número da carta e o Naipe que
 * ela representa.
 *
 * @see Naipe
 * @author thiago
 */
public class Carta {
    
    /**
     * Número da carta
     */
    private int numero;
    
    /**
     * Naipe da carta
     * @see Naipe
     */
    private Naipe naipe;

    /**
     * Construtor da classe Carta. Deve ser passado o número da
     * carta e o Naipe que ela representa.
     * 
     * @see Naipe
     * @param numero da Carta.
     * @param naipe da Carta.
     */
    public Carta(int numero, Naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    /**
     * Método que retorna o número em int da Carta.
     * 
     * @return O número em int da Carta
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Método que retorna o Naipe da Carta
     * 
     * @see Naipe
     * @return O Naipe da Carta
     */
    public Naipe getNaipe() {
        return naipe;
    }
    
    /**
     * Método que retorna uma String com o número e o Naipe da Carta
     * 
     * @return O número e o Naipe da Carta
     */
    @Override
    public String toString() {
        return this.getNumero() + ", " + this.getNaipe();
    }
}
