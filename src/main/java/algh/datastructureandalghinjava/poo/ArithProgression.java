package algh.datastructureandalghinjava.poo;

/**
 * Progressao aritimetica
 */
public class ArithProgression extends Progression {

    /** Incremento */
    protected long inc;

    // Herda as variaveis first e cur
    /** Construtor default inicializa com incremento de 1. */
    public ArithProgression() {
        inc = 1;
    }

    /** Construtor parametrico fornece o incremento. */
    public ArithProgression(long inc) {
        this.inc = inc;
    }

    /** Avanca a progressao acrescentando o incremento ao valor atual
     *
     * @return proximo valor da progressao
     */
    protected long nextValue(){
        cur += inc;
        return cur;
    }
    // Herda os metodos firsValue() e printProgression(int).
}
