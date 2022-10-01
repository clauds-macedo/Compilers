package br.com.compiladores.analyzer;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LexicalAnalyzer {
    private char[] fileContent;

    public LexicalAnalyzer(String file) {
        try {
            String fileText = new String(Files.readAllBytes(Paths.get(file)), StandardCharsets.UTF_8);
            fileContent = fileText.toCharArray();
        } catch (IOException e) {
            throw new RuntimeException(e.getCause());
        }
    }


}
