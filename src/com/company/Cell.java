package com.company;

public class Cell {

    static void printCell(String value) {
        System.out.print("| ");
        String data = value != null ? value : "";
        System.out.print(data);
        for (int i=0; i<10-data.length()-1; i++) {
            System.out.print(" ");
        }
    }

    static void setCell(String newValue) {
        int separator = newValue.indexOf("=");

        String cellIndex = newValue.substring(0,separator-1);
        Character cellRow = cellIndex.charAt(1);
        int contentIndex = Grid.columns.indexOf(cellIndex.charAt(0)) + (13 * (Character.getNumericValue(cellRow)-1));

        String cellValue = newValue.substring(separator+2);

        Grid.cellContents[contentIndex] = cellValue;
    }

    static void showCell(String cell) {
        Character cellRow = cell.charAt(1);
        int contentIndex = Grid.columns.indexOf(cell.charAt(0)) + (13 * (Character.getNumericValue(cellRow)-1));

        System.out.println(Grid.cellContents[contentIndex]);
    }

    static void clearCell(String cell) {
        Character cellRow = cell.charAt(1);
        int contentIndex = Grid.columns.indexOf(cell.charAt(0)) + (13 * (Character.getNumericValue(cellRow)-1));

        Grid.cellContents[contentIndex] = "";
    }

}
