package maths.pure.arithmetic.ekub_and_ekuk;

import java.util.ArrayList;
import java.util.List;

public final class Ekub_Ekuk_Engine {
 public static int ekub(int a, int b){
  while (a != b)
  {
   if (a > b) a %= b;
   else b %= a;

   if (a == 0) a = b;
   if (b == 0) b = a;
  }
  return a;
 }
 public static int ekuk(int a, int b){
 return a*b/ekub(a,b);

 }
 public static int multiEkub(List<Integer> list){
  int a = 0;
  while (list.size()>1) {
   List<Integer> list1=new ArrayList<>();
   for (int i = 1; i < list.size(); i++) {
    list1.add(ekub(list.get(i - 1), list.get(i)));
   }
   list = list1;
  }
  a=list.get(0);
  return a;
 }
 public static int multiEkuk(List<Integer> list){
  int a = 0;
  while (list.size()>1) {
   List<Integer> list1=new ArrayList<>();
   for (int i = 1; i < list.size(); i++) {
    list1.add(ekuk(list.get(i - 1), list.get(i)));
   }
   list = list1;
  }
  a=list.get(0);
  return a;
 }
}
