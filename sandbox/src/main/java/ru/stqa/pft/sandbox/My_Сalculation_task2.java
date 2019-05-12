package ru.stqa.pft.sandbox;

public class My_Сalculation_task2 {
   public static void main(String[] args) {

      Point a = new Point(5.7,3.0);

      System.out.println ("точка A имеет координаты :  x = " +  a.x + " и  y = " +  a.y  );
      
      System.out.println ("Расстояние между точками А и В   = " + a.distance(2.0,5.6));
   }
}
