package br.com.compiladores.analyzer;

public enum TOKENS_ID {
    TK_IDENTIFIER(0),
    TK_NUMBER(1),
    TK_OPERATOR(2),
    TK_PONCTUATION(3),
    TK_ASSIGN(4);

    private int TOKEN_VALUE;

    TOKENS_ID(int TOKEN_VALUE) {
        this.TOKEN_VALUE = TOKEN_VALUE;
    }

    public int getTOKEN_VALUE() {
        return TOKEN_VALUE;
    }

}
