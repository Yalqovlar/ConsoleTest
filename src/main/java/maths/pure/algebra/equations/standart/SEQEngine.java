package maths.pure.algebra.equations.standart;

import maths.pure.algebra.equations.standart.model.RootQD;

public final class SEQEngine implements Linear, Quadratic{
    public static RootQD sQED(double a, double b, double c){

        return Quadratic.sQED(a,b,c);
    }

    public static Double sLE(double a, double b){
        return Linear.sLE(a,b);
    }
}
