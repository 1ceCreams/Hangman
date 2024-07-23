package org.example;

import java.util.ArrayList;
import java.util.List;

public class GameStates {
    private List<String> states = new ArrayList<>();

    public List<String> getStates() {
        return states;
    }

    public GameStates(){
        this.states.add(
                "\n" +
                "  +---+\n" +
                "  |   |\n" +
                "      |\n" +
                "      |\n" +
                "      |\n" +
                "      |\n" +
                "=========''']\n");
        this.states.add(
                "\n" +
                        "  +---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        "      |\n" +
                        "      |\n" +
                        "      |\n" +
                        "=========''']\n");
        this.states.add(
                "\n" +
                        "  +---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        "  |   |\n" +
                        "      |\n" +
                        "      |\n" +
                        "=========''']\n");
        this.states.add(
                "\n" +
                        "  +---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        " /|   |\n" +
                        "      |\n" +
                        "      |\n" +
                        "=========''']\n");
        this.states.add(
                "\n" +
                        "  +---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        " /|\\ |\n" +
                        "      |\n" +
                        "      |\n" +
                        "=========''']\n");
        this.states.add(
                "\n" +
                        "  +---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        " /|\\ |\n" +
                        " /    |\n" +
                        "      |\n" +
                        "=========''']\n");
        this.states.add(
                "\n" +
                        "  +---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        " /|\\  |\n" +
                        " / \\  |\n" +
                        "      |\n" +
                        "=========''']\n");
    }
    public void printStates(){
        for (String state: this.states){
            System.out.print(state);
        }

    }
}
