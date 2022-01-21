package com.company.fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {

    public static void main(String[] args) {

       Scanner teclado = new Scanner(System.in);

        System.out.println( "informe a idade: ");
        String id = teclado.next().toUpperCase(Locale.ROOT);

        System.out.println("Informe o valor: ");
        String idade = teclado.next().replace("," , ".");

        double id1    = Double.parseDouble(id);
        double idade1 = Double.parseDouble(idade);
        teclado.close();

    }
}
