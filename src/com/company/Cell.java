package com.company;

/**
 Cell is a class to encapsulate a cell in a spreadsheet
 */
public class Cell {

    /**
     method to print a value of a single cell when printing the entire spreadsheet
     * @param value
     */
    static void printCell(String value) {
        System.out.print("| "); // precede each cell print with a |
        String data = value != null ? value : "";
        System.out.print(data);
        for (int i=0; i<10-data.length()-1; i++) {
            System.out.print(" ");
        }
    }

    /**
     method to set the value of a cell
     * @param newValue has a syntax cellIndex = cellValue ex// A3 = 'hello'
     */
    static void setCell(String newValue) {
        int separator = newValue.indexOf("=");

        String cellIndex = newValue.substring(0,separator-1);
        Character cellRow = cellIndex.charAt(1);
        int contentIndex = Grid.columns.indexOf(cellIndex.charAt(0)) + (13 * (Character.getNumericValue(cellRow)-1));
        // what is there are more than 26 columns ex// column AA
        String cellValue = newValue.substring(separator+2);

        Grid.cellContents[contentIndex] = cellValue;
    }

    /**
     method to print the value of a cell
     * @param cell has a syntax that represents the cell index ex// A3
     */
    static void showCell(String cell) {
        Character cellRow = cell.charAt(1);
        int contentIndex = Grid.columns.indexOf(cell.charAt(0)) + (13 * (Character.getNumericValue(cellRow)-1));

        System.out.println(Grid.cellContents[contentIndex]);
    }

    /**
     method to clear the value of a cell
     * @param cell has a syntax that represents the cell index ex// A3
     */
    static void clearCell(String cell) {
        Character cellRow = cell.charAt(1);
        int contentIndex = Grid.columns.indexOf(cell.charAt(0)) + (13 * (Character.getNumericValue(cellRow)-1));

        Grid.cellContents[contentIndex] = "";
    }

}
