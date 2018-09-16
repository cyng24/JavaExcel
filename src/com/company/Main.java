package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        boolean running = true;
        while(running) {
            System.out.print("Command? ");
            Scanner myScanner = new Scanner(System.in);
            String command = myScanner.nextLine();

            switch (command) {
                case "print":
                    Grid.printGrid();
                    break;
                case "display value":
                    System.out.println("Which cell?");
                    String displayedCell = myScanner.nextLine();
                    Cell.showCell(displayedCell);
                    break;
                case "set value":
                    System.out.println("What value?");
                    String newValue = myScanner.nextLine();
                    Cell.setCell(newValue);
                    break;
                case "clear value":
                    System.out.println("Which cell?");
                    String clearedCell = myScanner.nextLine();
                    Cell.clearCell(clearedCell);
                    break;
                case "clear spreadsheet":
                    Grid.clearGrid();
                    System.out.println("Spreadsheet cleared.");
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
