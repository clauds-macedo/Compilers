package br.com.compiladores.main;

import br.com.compiladores.utils.Utils;

public class Main {
    public static void main(String[] args) {
        Utils utils = new Utils();
        System.out.println(utils.isSpace("oi\toi \noi"));
    }
}
