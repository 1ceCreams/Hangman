package org.example;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Game game = new Game();
        boolean exit = false;
        Scanner scanner;

        while(!exit){
            int choice;
            scanner = new Scanner(System.in);
            System.out.println("Выберите пункт меню");
            System.out.println("1. Начать игру");
            System.out.println("2. Выйти");
            try {
                choice = scanner.nextInt();
            }
            catch (InputMismatchException e ){
                System.out.println("Такого варианта нет");
                continue;
            }
            switch (choice){
                case 1:{
                    game.run();
                    break;
                }
                case 2:{
                    exit = true;
                    break;
                }
                default:{
                    System.out.println("Такого варианта нет");
                    break;
                }
            }
        }

    }
}