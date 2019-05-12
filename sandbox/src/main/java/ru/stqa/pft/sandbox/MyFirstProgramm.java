package ru.stqa.pft.sandbox;

public class MyFirstProgramm {

   public static void main(String[] args) {

      hello("world");
      hello("user");
      hello("Nady");

      Square s = new Square(5.7);
      System.out.println("площадь квадрата со стороной " + s.l + " равна " + s.area());

      Rectangle r = new Rectangle(4,7.3);
      System.out.println("площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
   }

   public static void hello(String somebody) {

      System.out.println("Hello," + somebody + "!");
   }


}


