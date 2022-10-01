package br.com.compiladores.analyzer;
import br.com.compiladores.analyzer.TOKENS_ID;

public class Token {

    public static final TOKENS_ID ID = TOKENS_ID.TK_IDENTIFIER;
    public static final TOKENS_ID NUMBER = TOKENS_ID.TK_NUMBER;
    public static final TOKENS_ID OPERATOR = TOKENS_ID.TK_OPERATOR;
    public static final TOKENS_ID PONCTUATION = TOKENS_ID.TK_PONCTUATION;
    public static final TOKENS_ID ASSIGN = TOKENS_ID.TK_ASSIGN;

    private int type;
    private String text;

    public Token (int type, String text) {
        super();
        this.text = text;
        this.type = type;
    }

    public Token() {
        super();
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
