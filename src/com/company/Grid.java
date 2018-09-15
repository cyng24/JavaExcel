package com.company;

public class Grid {

    private static void printGridLine(int numOfColumns) {
        for (int i=0; i<numOfColumns; i++) {
            System.out.print("-----------");
        }
        System.out.println("-");
    }
    private static void printLetterCell() {
        String letters = "ABCDEFGHIJKLM";
        System.out.print("|          ");
        for (int i=0; i<letters.length(); i++) {
            System.out.print("|    " + letters.charAt(i) + "     ");
        }
        System.out.println("|");
    }
    private static void printNumberCell(int rowValue) {
        String numCell = rowValue/2 < 10 ? "    |" : "   |";
        System.out.print("||   " + rowValue/2 + numCell);
    }

    public static void printGrid(int columns, int rows) {
        for (int i=0; i<rows*2+3; i++) {
            if(i%2 == 0) {
                printGridLine(columns);
            }
            else if(i == 1){
                printLetterCell();
            }
            else {
                printNumberCell(i);
                Cell.printCell();
            }
        }
    }

}
