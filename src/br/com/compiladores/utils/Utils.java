package br.com.compiladores.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Utils {
    // classe para conter funções úteis para verificação de caracteres.

    public boolean isDigit(String c) {
        return Pattern.matches("[0-9]+", c);
    }

    public boolean isChar(String c) {
        return Pattern.matches("[a-zA-Z]+", c);
    }

    private boolean verifyOperators(String c) {
        boolean isOperator = false;
        for (String string : new String[]{"-", "+", "*", "**", "/", "//"}) {
            if (string == c) {
                isOperator = true;
                break;
            }
        }

        return isOperator;
    }

    public boolean isOperator(String c) {
        return verifyOperators(c);
    }

    public boolean isSpace(String c) {
        System.out.println(c);
        return c == " " || c == "\t" || c == "\n" || c == "\r";
    }

}
