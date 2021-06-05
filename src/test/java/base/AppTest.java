/*
 *  UCF COP3330 Summer 2021 Exercise 9 Solution
 *  Copyright 2021 Christopher Gray
 */
package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void output_generated_is_formatted_properly() {
        App myApp = new App();

        int area = 360;
        int numGallons = 2;

        String expectedOutput = "You will need to purchase 2 gallons of paint to cover 360 square feet.";
        String actualOutput = myApp.generateOutputString(area, numGallons);

        assertEquals(expectedOutput, actualOutput);
    }
}