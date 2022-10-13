package br.com.compiladores.analyzer;

public class Word extends Token {
    private String lexeme = "";

    public Word(TOKENS_ID invalid, String lexeme) {
        super(invalid);
        this.lexeme = lexeme;
    }

    public final static

    // Types
    Word TRUE = new Word(TOKENS_ID.TK_TRUE, "true"),
    FALSE = new Word(TOKENS_ID.TK_FALSE, "false"),
    INT = new Word(TOKENS_ID.TK_NUMBER, "Int"),
    FLOAT = new Word(TOKENS_ID.TK_NUMBER, "Float64"),

    // Delimiters
    OPEN_PARENTESYS = new Word(TOKENS_ID.TK_DELIMITER, "("),
    CLOSE_PARENTESYS = new Word(TOKENS_ID.TK_DELIMITER, ")"),
    COMMA = new Word(TOKENS_ID.TK_DELIMITER, ","),
    SEMICOLON = new Word(TOKENS_ID.TK_DELIMITER, ";"),

    // Operators
    MULTIPLIER = new Word(TOKENS_ID.TK_OPERATOR, "*"),
    DIVISOR = new Word(TOKENS_ID.TK_OPERATOR, "/"),
    ADD = new Word(TOKENS_ID.TK_OPERATOR, "+"),
    SUBTRACTION = new Word(TOKENS_ID.TK_OPERATOR, "-");

    public String toString() {
        return "Token: <" + super.getCategory() + " , " + lexeme;
    }

    public String getLexeme() {
        return lexeme;
    }
}
