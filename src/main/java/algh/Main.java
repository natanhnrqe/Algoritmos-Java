package algh;


import algh.datastructureandalghinjava.poo.ArithProgression;
import algh.datastructureandalghinjava.poo.FiboProgression;
import algh.datastructureandalghinjava.poo.GeomProgression;
import algh.datastructureandalghinjava.poo.Progression;

public class Main {
    public static void main(String[] args) {

        Progression prog = new Progression();
        ArithProgression arith = new ArithProgression();
        GeomProgression geom = new GeomProgression();
        FiboProgression fibo = new FiboProgression();

        arith.printProgression(30);

        prog.printProgression(30);

        fibo.printProgression(30);

        geom.printProgression(30);

    }
}