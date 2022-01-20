package com.company.temperatura;

import java.util.Locale;
import java.util.Scanner;

public class ConversaoTemperatura {

    public static void main(String[] args) {

        //Utilizar Constante para armazenar os valores "32 e "5/9"
        //Utilizar Variavel para armazenar °F e °C

        final double subtrair = 32;
        final double fator = 5.0 / 9.0;
        final double fator1 = 1.8;

        //C° = 5/9 * (F°(temperatura dada) - 32)
        double fahrenheit = 100;
        double celsius = fator * (fahrenheit - subtrair);
        System.out.println(celsius);

        //(°F - 32) x 5/9 = °C;
        double c;
        double fah = 180;
        c = (fah - subtrair) * fator;
        System.out.println(c);

        //°F = °C × 1,8 + 32
        double celsius1 = 80.0;
        double fahrenheit2;
        fahrenheit2 = celsius1 * fator1 + subtrair;
        System.out.println(fahrenheit2);


        //°C = (°F - 32)/1,8
        double f4 = 80;
        double c1 = (f4 - subtrair) / fator1;
        System.out.println(c1);

        Scanner digitar = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = digitar.nextLine().toUpperCase(Locale.ROOT);

        System.out.println("\n Informe seu sobrenome: ");
        String sobrenome = digitar.nextLine();

        System.out.println("\n nome completo " + nome + " " + sobrenome);

        digitar.close();







    }
}
