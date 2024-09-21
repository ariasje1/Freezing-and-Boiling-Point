/*
Author: Jesus Arias
GitHub username: ariasje1
Date: 09/21/2024
Description: This class handles the user interaction, taking temperature input and determining the states (freezing, boiling, or no change) of various substances by utilizing the Substance class.
*/
package freezingandboilingpoint2;

import javax.swing.JOptionPane;

/**
 * The FreezingandBoilingPoint class simulates checking whether various substances
 * (Ethyl Alcohol, Mercury, Oxygen, and Water) freeze or boil at a given temperature.
 */
public class FreezingandBoilingPoint2 {

    /**
     * Main method that drives the program by repeatedly prompting the user to input a temperature
     * and determining whether certain substances freeze, boil, or remain unchanged at that temperature.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Initialize playAgain to an empty string to avoid the compiler error
        String playAgain = "";

        // Create Substance objects for Ethyl Alcohol, Mercury, Oxygen, and Water
        Substance ethylAlcohol = new Substance(-173, 172);
        Substance mercury = new Substance(-38, 676);
        Substance oxygen = new Substance(-362, -306);
        Substance water = new Substance(32, 212);

        // Loop to allow the user to input multiple temperatures
        do {
            try {
                // Get the temperature input from the user
                String tempInput = JOptionPane.showInputDialog("Please enter a temperature (in degrees Fahrenheit):");

                // Check if the user cancels the input dialog
                if (tempInput == null) {
                    JOptionPane.showMessageDialog(null, "Input canceled. Exiting.");
                    break;
                }

                // Convert the input string to an integer
                int temp = Integer.parseInt(tempInput);

                // Get the state of each substance based on the input temperature
                String stateOfEA = ethylAlcohol.getChanges(temp);
                String stateOfMercury = mercury.getChanges(temp);
                String stateOfOxygen = oxygen.getChanges(temp);
                String stateOfWater = water.getChanges(temp);

                // Display the results in a message dialog
                JOptionPane.showMessageDialog(null,
                        "----- Common States of Matter -----\n" +
                                "Temperature: " + temp + " Degrees Fahrenheit\n" +
                                "----------------------------------\n" +
                                "--- Ethyl Alcohol: " + stateOfEA + "\n" +
                                "--- Mercury: " + stateOfMercury + "\n" +
                                "--- Oxygen: " + stateOfOxygen + "\n" +
                                "--- Water: " + stateOfWater + "\n" +
                                "----------------------------------"
                );
            } catch (NumberFormatException e) {
                // Handle invalid input (non-integer value)
                JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid integer.");
                continue; // Restart the loop if the input was invalid
            }

            // Ask the user if they want to enter another temperature
            playAgain = JOptionPane.showInputDialog("Would you like to enter another temperature? (Y/N)");

            // Handle case where the user cancels the input dialog for playAgain
            if (playAgain == null) {
                playAgain = "N"; // Exit loop if the user cancels
            }

        } while (playAgain.equalsIgnoreCase("Y")); // Loop if the user enters "Y" to continue
    }
}
