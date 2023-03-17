package Src;

import java.util.Random;

public class Die {
    private int faceValue; // instance varibale of dice
    private final int MAX = 6; // maximum variable of dice

    // Constructor
    public Die() {
        roll(); // to roll the dice
    }

    // Roll the die
    public void roll() {
        Random rand = new Random();
        faceValue = rand.nextInt(MAX) + 1;
    }

    // Set the face value of the di
    public void setFaceValue(int value) {
        faceValue = value;
    }

    // Get the face value of the die
    public int getFaceValue() {
        return faceValue;
    }

    // String representation of the die
    public String toString() {
        return Integer.toString(faceValue);
    }

    // Compare two dice objects
    public boolean equals(Die other) {
        return faceValue == other.getFaceValue();
    }
}
