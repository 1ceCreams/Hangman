package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Game {
    private final GameStates states;
    private final short MAX_ERRORS = 6;
    private String word;
    private boolean gameover = false;
    StringBuilder visibleWord;


    public Game(){
        states = new GameStates();
    }

    public void run() throws IOException {
        word = new WordSelector().getWord("src/main/resources/russian_nouns.txt");
        Scanner in = new Scanner(System.in);
        gameover = false;
        visibleWord = new StringBuilder();
        char userLatter;
        char[] chars = word.toCharArray();
        boolean letterFound;
        boolean win = false;
        short errorCounter = 0;

        for (int i = 0; i < word.length(); i++){
            visibleWord.append("_");
        }
        while(!gameover){
            System.out.println(states.getStates().get(errorCounter));
            System.out.println(visibleWord.toString());
            if(errorCounter == MAX_ERRORS){
                System.out.println("Вы проиграли\n загаданное слово:"+word);
                gameover = true;
                continue;
            }
            System.out.println("Введите букву");
            int letterIndex = 0;
            userLatter = in.next().charAt(0);
            if(userLatter == ' '){
                continue;
            }
            letterFound = false;
            for (char letter:chars){
                if(letter == userLatter){
                    visibleWord.setCharAt(letterIndex,userLatter);
                    letterFound = true;
                }
                if(visibleWord.indexOf(String.valueOf('_')) == -1){
                    win = true;
                }
                letterIndex++;
            }
            if(!letterFound){
                errorCounter++;
            }
            if(win){
                System.out.println("Вы победили");
                break;
            }

        }
    }
}
