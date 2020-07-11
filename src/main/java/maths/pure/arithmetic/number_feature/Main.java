package maths.pure.arithmetic.number_feature;

public class Main {
    public static void main(String[] args) {
        System.out.println(Number_Feature_Engine.isNatural(0d));
        System.out.println(Number_Feature_Engine.primeFactors(387420489));
        System.out.println(Number_Feature_Engine.primeFactorsPollardRho("387420489"));
    }
}
