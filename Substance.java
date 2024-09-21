/*
Author: Jesus Arias
GitHub username: ariasje1
Date: 09/21/2024
Description: This class models a substance with defined freezing and boiling points, providing a method to determine its state (freezes, boils, or no change) based on a given temperature.
*/
package freezingandboilingpoint2;

/**
 * The Substance class models a substance with a freezing point and a boiling point.
 * It determines the state of the substance (freezes, boils, or no change) based on a given temperature.
 */
class Substance {
    private int freezingPoint;
    private int boilingPoint;

    /**
     * Constructor for creating a Substance object.
     *
     * @param freeze The freezing point of the substance (in degrees Fahrenheit).
     * @param boil   The boiling point of the substance (in degrees Fahrenheit).
     */
    public Substance(int freeze, int boil) {
        this.freezingPoint = freeze;
        this.boilingPoint = boil;
    }

    /**
     * Method that determines whether the substance freezes, boils, or remains unchanged
     * based on a given temperature.
     *
     * @param temp The temperature to compare against the substance's freezing and boiling points.
     * @return A string representing the state of the substance ("Freezes", "Boils", or "No Changes").
     */
    public String getChanges(int temp) {
        // Check if the temperature is greater than or equal to the boiling point
        if (temp >= boilingPoint) {
            return "Boils";
        }
        // Check if the temperature is less than or equal to the freezing point
        else if (temp <= freezingPoint) {
            return "Freezes";
        }
        // If the temperature is between the freezing and boiling points, return "No Changes"
        else {
            return "No Changes";
        }
    }
}
