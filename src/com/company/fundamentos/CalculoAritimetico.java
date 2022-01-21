package com.company.fundamentos;

public class CalculoAritimetico {

    public static void main(String[] args) {

      int a = 6;
      int b = 3 + 2;
      int c = a * b;
      double d =  Math.pow(c , 2);
      int e = 3 * 2;
      double f = d / e;

      int g = 1 - 5;
      int h = 2 - 7;
      int i = g * h;
      int j = 2;
      double l = i / j;
      double m = Math.pow(l , 2);

      double n = f - m;
      double o = Math.pow(n , 3);

      double p = 10;
      double q = Math.pow(p , 3);

      double r = o / q;

        System.out.println(r);

        double numerA = Math.pow(6 * (3 + 2), 2);
        double denomA = 3 * 2;

        double numerB = (1 - 5) * (2 - 7);
        double denomB = 2;

        double superiorA = numerA / denomA;
        double superiorB  = Math.pow(numerB / denomB, 2);

        double superior = Math.pow(superiorA - superiorB, 3);
        double inferior = Math.pow(10,3);

        double resultado =superior / inferior;

        System.out.println(resultado);

    }
}
