package com.company.temperatura;

public class ConversaoTemperatura {

    public static void main(String[] args) {

        //Utilizar Constante para armazenar os valores "32 e "5/9"
        //Utilizar Variavel para armazenar °F e °C

        final double recurso  = 5.0 / 9.0;
        final double recurso1 = 1.8;
        final double subtrair = 32;


        //C° = 5/9 * (F°(temperatura dada) - 32)
        double fahrenheit = 50;
        double celsius = recurso * (fahrenheit - subtrair);
        System.out.println("1˚ valor é " + celsius + ".");

        //(°F - 32) x 5/9 = °C;
        double fahrenheit1 = 150;
        double celsius1 = (fahrenheit1 - subtrair);
        System.out.println("2˚ valor é "  + celsius1 + ".");

        //°F = °C × 1,8 + 32
        double celsius2 = 10.0;
        double fahrenheit2 = celsius2 * recurso1 + subtrair;
        System.out.println("3˚ valor é " + fahrenheit2 + ".");

        //°C = (°F - 32)/1,8
        double fahrenheit3 = 50;
        double celsius3 = (fahrenheit3 - subtrair) / recurso1;
        System.out.println("4˚ valor é " + celsius3 + ".");
    }
}
