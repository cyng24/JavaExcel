package com.company;

public class Grid {
    static String columns = "ABCDEFGHIJKLM";
    static String[] cellContents = new String[168];

    private static void printLetterCell() {
        System.out.print("|          ");
        for (int i=0; i<columns.length(); i++) {
            System.out.print("|    " + columns.charAt(i) + "     ");
        }
        System.out.println("|");
    }
    private static void printNumberCell(int rowValue) {
        String singleOrDoubleDigit = rowValue/2 < 10 ? " " : "";
        System.out.print("||   " + rowValue/2 + singleOrDoubleDigit + "   |");
    }

    private static void printGridLine() {
        for (int i=0; i<columns.length()+1; i++) {
            System.out.print("-----------");
        }
        System.out.println("-");
    }

    protected static void printGrid() {
        int cellIndex = 0;
        for (int i=0; i<25; i++) {
            if(i%2 == 0) {
                printGridLine();
            }
            else if(i == 1){
                printLetterCell();
            }
            else {
                printNumberCell(i);
                for (int j=0; j<13; j++) {
                    Cell.printCell(cellContents[cellIndex]);
                    cellIndex++;
                }
                System.out.println("|");
            }
        }
    }

    protected static void clearGrid() {
        String[] newCellContents = new String[168];
        cellContents = newCellContents;
    }

}
