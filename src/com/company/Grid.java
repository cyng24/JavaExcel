package com.company;

/**
 Grid is a class to encapsulate rows and columns of a spreadsheet
 */

public class Grid {
    static String columns = "ABCDEFGHIJKLM"; // 13 columns in the spreadsheet labeled from A to M
    static int numOfRows = 16; // 11 rows in the spreadsheet
    static String[] cellContents = new String[columns.length()*numOfRows]; // string array to hold cell contents of a 13x11 grid
    // TODO consider a 2-dimension array

    /**
     method to print the column header
     */
    private static void printLetterCell() {
        System.out.print("|          ");
        for (int i=0; i<columns.length(); i++) {
            System.out.print("|    " + columns.charAt(i) + "     ");
        }
        System.out.println("|");
    }

    /**
     method to print row number
     * @param rowIndex
     */
    private static void printNumberCell(int rowIndex) {
        String singleOrDoubleDigit = rowIndex/2 < 10 ? " " : "";
        System.out.print("||   " + rowIndex/2 + singleOrDoubleDigit + "   |");
    }

    /**
     method to print a grid line
     */
    private static void printGridLine() {
        for (int i=0; i<columns.length()+1; i++) {
            System.out.print("-----------");
        }
        System.out.println("-");
    }

    /**
     method to print the entire spreadsheet
     */
    protected static void printGrid() {
        int cellIndex = 0;
        for (int i=0; i<numOfRows*2+3; i++) {
            if(i%2 == 0) {
                printGridLine();
            }
            else if(i == 1){
                printLetterCell();
            }
            else {
                printNumberCell(i);
                for (int j=0; j<columns.length(); j++) {
                    Cell.printCell(cellContents[cellIndex]);
                    cellIndex++;
                }
                System.out.println("|");
            }
        }
    }

    /**
     method to clear the entire spreadsheet
     */
    protected static void clearGrid() {
        String[] newCellContents = new String[columns.length()*numOfRows];
        cellContents = newCellContents;
    }

}
