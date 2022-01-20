package com.company.fundamentos;

import javax.swing.*;
import java.math.BigDecimal;

public class StringoToNumberFundamentos {

    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Informe o primeiro número: ");

        String valor2 = JOptionPane.showInputDialog("Informe o segundo número= ");

        System.out.println(valor1 + "\n " + valor1);

        double  n2 = Double.parseDouble(valor1);
        double n3 = Double.parseDouble(valor2);
        double soma =  n2 + n3;
        double media = soma / 2;

        System.out.println(soma);
        System.out.println(media);

    }
}
