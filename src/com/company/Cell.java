package com.company;

/**
 Cell is a class to encapsulate a cell in a spreadsheet
 */
public class Cell {
    static int numOfColumns = Grid.columns.length();
    static int cellWidth = 10; // a cell is 10 spaces wide
    /**
     method to print a value of a single cell when printing the entire spreadsheet
     * @param value
     */
    static void printCell(String value) {
        System.out.print("| "); // precede each cell print with a |
        String data = value != null ? value : "";
        System.out.print(data);
        for (int i=0; i<cellWidth-data.length()-1; i++) {
            System.out.print(" ");
        }
    }

    /**
     method to set the value of a cell
     * @param newValue has a syntax cellIndex = cellValue ex// A3 = 'hello'
     */
    static void setCell(String newValue) {
        int separator = newValue.indexOf("=");

        Character cellColumn = newValue.charAt(0); // assuming there are less than 26 columns, there are no double letter columns
        String cellRow = newValue.substring(1, separator-1);
        int contentIndex = Grid.columns.indexOf(cellColumn) + (numOfColumns * (Integer.parseInt(cellRow)-1));
        String cellValue = newValue.substring(separator+2);

        Grid.cellContents[contentIndex] = cellValue;
    }

    /**
     method to print the value of a cell
     * @param cell has a syntax that represents the cell index ex// A3
     */
    static void showCell(String cell) {
        String cellRow = cell.substring(1);
        int contentIndex = Grid.columns.indexOf(cell.charAt(0)) + (numOfColumns * (Integer.parseInt(cellRow)-1));

        System.out.println(Grid.cellContents[contentIndex]);
    }

    /**
     method to clear the value of a cell
     * @param cell has a syntax that represents the cell index ex// A3
     */
    static void clearCell(String cell) {
        String cellRow = cell.substring(1);
        int contentIndex = Grid.columns.indexOf(cell.charAt(0)) + (numOfColumns * (Integer.parseInt(cellRow)-1));

        Grid.cellContents[contentIndex] = "";
    }

}
