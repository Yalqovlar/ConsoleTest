package maths.pure.arithmetic.number_feature;

import java.util.ArrayList;
import java.util.List;

public final class Number_Feature_Engine {

    //Sonni naturallikka tekshiradi
    public static boolean isNatural(Double number){
        return number > 0 && number % 10 == 0;
    }

    //Berilgan sonni tub bo'luvchilarga ajratadi
    public static List<Integer> primeFactors(int numbers) {
        int n = numbers;
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }
}
