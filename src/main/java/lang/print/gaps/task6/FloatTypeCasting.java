package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        int roundNumber = Math.round(numberToBeRounded);
        System.out.println(roundNumber);
    }
    public static void main(String[] args) {
        // Create an instance of FloatTypeCasting
        FloatTypeCasting rounder = new FloatTypeCasting();

        // Test the roundNumber method
        rounder.roundNumber(4.3f); // Example: Round 4.3
        rounder.roundNumber(4.6f); // Example: Round 4.6
    }
}
