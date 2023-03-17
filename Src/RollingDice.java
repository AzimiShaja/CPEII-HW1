package Src;

public class RollingDice {
    public static void main(String[] args) {
        // Test the Dice
        Die die = new Die();
        System.out.println("Initial face value of die: " + die.getFaceValue());
        System.out.println("----------------------------------------------------------------");
        die.roll();
        System.out.println("After rolling dice: " + die.getFaceValue());
        System.out.println("----------------------------------------------------------------");
    }
}
