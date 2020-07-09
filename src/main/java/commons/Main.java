package commons;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> randoms = new ArrayList<Integer>();
        for (int i = 0; i <10 ; i++) {
//            System.out.println(RandomEngine.qaytar(5,6));
//            System.out.println(RandomEngine.randomMultiTakrorlanmasin(1000, 1000));
            System.out.println(RandomEngine.randomInterval(10, 15));
        }
    }
}
