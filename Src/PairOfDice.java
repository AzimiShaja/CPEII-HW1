/**
 * The PairOfDice class represents a pair of six-sided dice that can be rolled
 * and have their face values set or retrieved.
 */
public class PairOfDice {
    private Die die1;
    private Die die2;

    /**
     * Creates a new PairOfDice object with two dice that are rolled.
     */
    public PairOfDice() {
        die1 = new Die();
        die2 = new Die();
    }

    /**
     * Rolls both dice.
     */
    public void roll() {
        die1.roll();
        die2.roll();
    }

    /**
     * Returns the sum of the face values of both dice.
     * 
     * @return the sum of the face values of both dice
     */
    public int getDiceSum() {
        return die1.getFaceValue() + die2.getFaceValue();
    }

    /**
     * 
     * Returns the face value of the first die.
     * 
     * @return the face value of the first die
     */
    public int getDie1() {
        return die1.getFaceValue();
    }

    /**
     * 
     * Sets the face value of the first die to the specified value.
     * 
     * @param value the value to set the face value of the first die to
     */
    public void setDie1(int value) {
        die1.setFaceValue(value);
    }

    /**
     * 
     * Returns the face value of the second die.
     * 
     * @return the face value of the second die
     */
    public int getDie2() {
        return die2.getFaceValue();
    }

    /**
     * 
     * Sets the face value of the second die to the specified value.
     * 
     * @param value the value to set the face value of the second die to
     */
    public void setDie2(int value) {
        die2.setFaceValue(value);
    }

    /**
     * 
     * Returns a string representation of the face values of both dice.
     * 
     * @return a string representation of the face values of both dice
     */
    public String toString() {
        return die1.getFaceValue() + " " + die2.getFaceValue();
    }

    /**
     * 
     * Compares this pair of dice to another pair of dice to see if they have the
     * same face values.
     * 
     * @param other the other pair of dice to compare to
     * @return true if the two pairs of dice have the same face values, false
     *         otherwise
     */
    public boolean equals(PairOfDice other) {
        return die1.equals(other.die1) && die2.equals(other.die2);
    }
}
