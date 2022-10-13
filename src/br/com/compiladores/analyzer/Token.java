package br.com.compiladores.analyzer;

public class Token {

    public static TOKENS_ID category = null;
    private int type;
    private String text;

    public Token (TOKENS_ID category) {
        setCategory(category);
    }

    public Token() {
        super();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setCategory(TOKENS_ID category) {
        this.category = category;
    }

    public TOKENS_ID getCategory() {
        return category;
    }
}
