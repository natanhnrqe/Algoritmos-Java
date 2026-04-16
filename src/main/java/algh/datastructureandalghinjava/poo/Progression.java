package algh.datastructureandalghinjava.poo;

/*
* Uma Classe de progressao aritimetica
*/
public class Progression {

    // Primeiro valor da progressao
    protected long first;

    // Valor atual da progressao
    protected long cur;

    public Progression() {
        cur = first = 0;
    }

    /** Reinicializa a progressao com o valor inicial.
     *
     * @return valor inicial
     */
    protected long firstValue(){
        cur = first;
        return cur;
    }

    /** Avanca a progressao para o proximo valor
     *
     * @return proximo valor da progressao
     */
    protected long nextValue(){
        return ++cur; // proximo valor default
    }

    /** Imprime os primeiros valores n da progressao
     *
     * @param n de valores a serem impressos
     */
    public void printProgression(int n){
        System.out.print(firstValue());
        for (int i = 2; i <= n; i++)
            System.out.print(" " + nextValue());
        System.out.println(); // termina a linha
    }
}
