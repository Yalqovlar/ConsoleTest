package maths.pure.algebra.equations.standart;

import maths.pure.algebra.equations.standart.model.RootQD;

public class Main {
    public static void main(String[] args) {
        RootQD rootQD;
        System.out.println(SEQEngine.sLE(5,-10));
        rootQD=SEQEngine.sQED(1,-4,4);
        System.out.println(rootQD.getX1());
        System.out.println(rootQD.getX2());
    }
}
