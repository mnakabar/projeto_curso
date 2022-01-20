package com.company.inferencia;

public class TiposPrimitivos {

    public static void main(String[] args) {

        // Tipo numericos inteiros
        byte anosDeEmpresa = 23;
        short numerosDeVoo = 542;
        int id = 56786;
        long pontosAculumulados = 3_134_987_456L; // obrigatorio por L no final

        // Tipo numericos reais
        float salario = 11_445.9F; // obrigatorio por  no final
        double vendasAcumuladas = 9.09876555;//

        // Tipo boolean
        boolean estaDeFerias = false;// || true;

        // Tipo caracter
        char status = 'A'; // entre aspas simples

        System.out.println(anosDeEmpresa * 365);

        System.out.println(numerosDeVoo / 4);

        System.out.println(id - 5000);

        System.out.println(pontosAculumulados * vendasAcumuladas);

        int porcentagem = 10;
        System.out.println(salario * porcentagem + salario);

        System.out.println("O aluno está de férias? " + estaDeFerias)ls;

        System.out.println("status: " + status);

    }
}
