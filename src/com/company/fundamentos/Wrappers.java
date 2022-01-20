package com.company.fundamentos;

public class Wrappers {

    public static void main(String[] args) {

        // No Java temos para cada versão tipo primitivo uma versão equivalente OO

        Byte b = 10; // byte
        Short s = 100; // short
        Integer i = 1000; // int
        Long l = 123000L; // long
        Float f = 1000.10F; // float
        Double d = 1234.098; // double

        Character c = 'A'; // char
        Boolean bo = false || true; // boolean

        System.out.println(b + " / " + s + " / " + i + " / "
        + l + " / " + f + " / " + d + " / " + c + " / " +bo);
    }

}
