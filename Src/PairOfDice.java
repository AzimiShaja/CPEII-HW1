package Src;

public class PairOfDice {
    private Die die1;
    private Die die2;

    // Constructor
    public PairOfDice() {
        die1 = new Die();
        die2 = new Die();
    }

    // Roll the dice
    public void roll() {
        die1.roll();
        die2.roll();
    }

    // Get the sum of the dice
    public int getDiceSum() {
        return die1.getFaceValue() + die2.getFaceValue();
    }

    // Get the face value of die1
    public int getDie1() {
        return die1.getFaceValue();
    }

    // Set the face value of die1
    public void setDie1(int value) {
        die1.setFaceValue(value);
    }

    // Get the face value of die2
    public int getDie2() {
        return die2.getFaceValue();
    }

    // Set the face value of die2
    public void setDie2(int value) {
        die2.setFaceValue(value);
    }

    // String representation of the dice
    public String toString() {
        return die1.getFaceValue() + " " + die2.getFaceValue();
    }

    // equals Method
    public boolean equals(PairOfDice other) {
        return die1.equals(other.die1) && die2.equals(other.die2);
    }
}
