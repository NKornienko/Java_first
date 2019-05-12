package ru.stqa.pft.sandbox;

public class My_Сalculation_task2 {
   public static void main(String[] args) {

      Point a = new Point(5.7,3.0);
      Point b = new Point(2.1,1.1);
      System.out.println ("точка A имеет координаты :  x = " +  a.x + " и  y = " +  a.y  );
      System.out.println ("точка B имеет координаты :  x = " +  b.x + " и  y = " +  b.y);

      System.out.println ("Расстояние между точками А и В   = " + distance(a,b));
   }

public static double distance(Point a,Point b){
      return Math.sqrt((a.x -b.x)*(a.x -b.x)+(a.y -b.y)*(a.y -b.y));

}
}

