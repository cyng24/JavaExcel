package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int numberOfColumns = 14;
        int numberOfRows = 12;

        boolean running = true;
        while(running) {
            System.out.print("Command? ");
            Scanner myScanner = new Scanner(System.in);
            String command = myScanner.nextLine();

            switch (command) {
                case "print":
                    Grid.printGrid(numberOfColumns, numberOfRows);
                    break;
                case "display":
                    System.out.println("Which cell?");
                    break;
                case "set value":
                    System.out.println("What value?");
                    break;
                case "clear":
                    System.out.println("Which cell?");
                    break;
                case "sort":
                    System.out.println("Ascending or descending?");
                    break;
                case "quit":
                    System.out.println("Thanks for playing!");
                    running = false;
                    break;
                default:
                    System.out.println("Not a command.");
            }
        }
    }
}
