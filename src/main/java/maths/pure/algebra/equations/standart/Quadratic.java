package maths.pure.algebra.equations.standart;

import maths.pure.algebra.equations.standart.model.RootQD;

public interface Quadratic {
     static RootQD sQED(double a, double b, double c){
        if (a==0){
            return null;
        }
        else {
            return new RootQD(a,b,c);
        }
    }
}
