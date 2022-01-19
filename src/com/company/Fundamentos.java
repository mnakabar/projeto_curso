package com.company;

public class Fundamentos {

    public static void main(String[] args) {

        double raio = 5;
        final double pi = 3.16;

        raio = 12;
        double calculo =  pi * raio * raio;
        System.out.println("Area total é " + raio * pi + " m2");
    }
}
