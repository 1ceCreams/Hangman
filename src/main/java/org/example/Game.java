package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Game {
    private final GameStates states;
    private String word;
    private boolean gameover = false;


    public Game(){
        states = new GameStates();
        try {
            word = new WordSelector().getWord("src/main/resources/russian_nouns.txt");
        }catch (IOException e){
            System.out.println("Файл не найден");
        }
    }

    public void run(){
        Scanner in = new Scanner(System.in);
        StringBuilder visibleWord = new StringBuilder();
        char userLatter;
        char[] chars = word.toCharArray();

        for (int i = 0; i < word.length(); i++){
            visibleWord.append("_");
        }
        System.out.println(states.getStates().get(0));
        System.out.println(visibleWord.toString());
        while(!gameover){
            System.out.println("Введите букву");
            int letterIndex = 0;
            userLatter = in.next().charAt(0);
            if(userLatter == ' '){
                continue;
            }
            for (char letter:chars){
                if(letter == userLatter){
                    visibleWord.setCharAt(letterIndex,userLatter);
                }
                letterIndex++;
            }
            System.out.println(visibleWord);
        }
    }
}
