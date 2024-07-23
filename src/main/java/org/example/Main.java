package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        GameStates states = new GameStates();
        states.printStates();
        WordSelector word = new WordSelector();
        String gameWord = word.getWord("src/main/resources/russian_nouns.txt");
        System.out.println(gameWord);

    }
}