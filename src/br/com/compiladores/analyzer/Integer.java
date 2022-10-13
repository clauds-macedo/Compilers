package br.com.compiladores.analyzer;

public class Integer extends Token{
    private int newInteger;

    public Integer(int newValue) {
        super(TOKENS_ID.TK_NUMBER);
        this.newInteger = newValue;
    }

    public String toString() {
        return "Token: <" + super.getCategory() + " - " + newInteger;
    }

}
