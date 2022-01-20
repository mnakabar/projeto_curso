package com.company.fundamentos;

import java.util.Scanner;

public class DesafioConversao {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe seu primeiro sálario: ");
        String salario1 = teclado.next().replace("," , ".");

        System.out.println("\nInforme seu segundo sálario: ");
        String salario2 = teclado.next().replace("," , ".");

        System.out.println("\nInforme seu terceiro sálario: ");
        String salario3 = teclado.next().replace("," , ".");

        double valor1 = Double.parseDouble(salario1);
        double valor2 = Double.parseDouble(salario2);
        double valor3 = Double.parseDouble(salario3);

        double soma = valor1 + valor2 + valor3;
        System.out.println("A soma dos salários é: " +  soma);

        double media = soma / 3;
        System.out.println("A média dos três últimos salários é: " + media);

        teclado.close();
    }
}
