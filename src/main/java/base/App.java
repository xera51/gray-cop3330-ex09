/*
 *  UCF COP3330 Summer 2021 Exercise 6 Solution
 *  Copyright 2021 Christopher Gray
 */
package base;

import java.util.Scanner;

public class App {

    Scanner in = new Scanner(System.in);
    static final int SQUARE_FEET_PER_GALLON = 350;

    public static void main(String[] args) {
        App myApp = new App();

        int length = myApp.readLength();
        int width = myApp.readWidth();
        int area = myApp.calculateArea(length, width);
        int numGallons = myApp.calculateNumGallons(area);

        String output = myApp.generateOutputString(area, numGallons);
        myApp.displayOutput(output);

    }

    public int readLength() {
        System.out.print("What is the length? ");
        return Integer.parseInt(in.nextLine());
    }

    public int readWidth() {
        System.out.print("What is the width? ");
        return Integer.parseInt(in.nextLine());
    }

    public int calculateArea(int length, int width) {
        return length * width;
    }

    public int calculateNumGallons(int area) {
        return (int) Math.ceil(1.0 * area / SQUARE_FEET_PER_GALLON);
    }

    public String generateOutputString(int area, int numGallons) {
        return String.format("You will need to purchase %d gallons of paint to cover %d square feet.",
                numGallons, area);
    }

    public void displayOutput(String output) { System.out.println(output); }
}
