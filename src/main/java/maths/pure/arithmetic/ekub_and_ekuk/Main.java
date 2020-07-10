package maths.pure.arithmetic.ekub_and_ekuk;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
                List<Integer> list=new ArrayList<>();
                list.add(20);
                list.add(30);
                list.add(40);
                list.add(50);
                list.add(60);
                System.out.println( "Ikki sonning ekubi Evklitda  "+Ekub_Ekuk_Engine.ekubEvklit(12,20));
                System.out.println("Ikki sonning ekuki Evklitda  "+Ekub_Ekuk_Engine.ekukEvklit(12,20));
                System.out.println("Ikki sonning ekubi Shteynda  "+Ekub_Ekuk_Engine.gcdEkub(12,20));
                System.out.println("Ikki sonning ekuki Shteynda  "+Ekub_Ekuk_Engine.gcdEkuk(12,20));
                System.out.println( "Ikkitadan ortiq sonning ekubi Evklitda  "+Ekub_Ekuk_Engine.multiEkubEvlit(list));
                System.out.println( "Ikkitadan ortiq sonning ekuki Evklitda  "+Ekub_Ekuk_Engine.multiEkukEvklit(list));
                System.out.println( "Ikkitadan ortiq sonning ekubi Shteynda  "+Ekub_Ekuk_Engine.gcdMultiEkub(list));
                System.out.println( "Ikkitadan ortiq sonning ekuki Shteynda  "+Ekub_Ekuk_Engine.gcdMultiEkuk(list));
            }
}
