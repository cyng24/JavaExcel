package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("You can:");
        System.out.println();
        System.out.println("display the spreadsheet");
        System.out.println("clear the spreadsheet");
        System.out.println("display a value");
        System.out.println("set a value");
        System.out.println("clear a value");
        System.out.println("quit");

        boolean running = true;
        while(running) {
            System.out.println("What would you like to do?");
            Scanner myScanner = new Scanner(System.in);
            String command = myScanner.nextLine();

            switch (command) {
                case "display the spreadsheet":
                    Grid.printGrid();
                    break;
                case "clear the spreadsheet":
                    Grid.clearGrid();
                    System.out.println("Spreadsheet cleared.");
                    break;
                case "display a value":
                    System.out.println("Which cell?");
                    String displayedCell = myScanner.nextLine();
                    Cell.showCell(displayedCell);
                    break;
                case "set a value":
                    System.out.println("What value?");
                    String newValue = myScanner.nextLine();
                    Cell.setCell(newValue);
                    break;
                case "clear a value":
                    System.out.println("Which cell?");
                    String clearedCell = myScanner.nextLine();
                    Cell.clearCell(clearedCell);
                    System.out.println("Cell cleared.");
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
