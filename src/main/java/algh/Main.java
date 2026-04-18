package algh;


import algh.datastructureandalghinjava.poo.ArithProgression;
import algh.datastructureandalghinjava.poo.GeomProgression;
import algh.datastructureandalghinjava.poo.Progression;

public class Main {
    public static void main(String[] args) {

        Progression prog = new Progression();
        ArithProgression arith = new ArithProgression(10);
        GeomProgression geom = new GeomProgression();

        arith.printProgression(10);

        prog.printProgression(30);

        geom.printProgression(20);

    }
}