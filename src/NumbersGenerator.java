import java.util.ArrayList;
import java.util.List;

public class NumbersGenerator {

    // Function to find all possible numbers from given digits
    public static List<Integer> findAllNumbers(int[] digits) {
        List<Integer> result = new ArrayList<>();
        boolean[] used = new boolean[digits.length];
        StringBuilder currentNumber = new StringBuilder();
        generateNumbers(digits, used, currentNumber, result);
        return result;
    }

    // Backtracking function to generate numbers
    private static void generateNumbers(int[] digits, boolean[] used, StringBuilder currentNumber, List<Integer> result) {
        if (currentNumber.length() == digits.length) {
            result.add(Integer.parseInt(currentNumber.toString()));
            System.out.println("etape 2 currentNumber = "+currentNumber);
            return;
        }

        for (int i = 0; i < digits.length; i++) {
            if (!used[i]) {
                System.out.println("i = "+i+",  currentNumber = "+currentNumber);
                for (int j = 0; j < used.length; j++) {
                    System.out.println("used["+j+"] = "+used[j]+", "); // Print 1 for true, 0 for false
                }
                used[i] = true;
                currentNumber.append(digits[i]);
                generateNumbers(digits, used, currentNumber, result);
                currentNumber.deleteCharAt(currentNumber.length() - 1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[] digits = {0, 1, 2};
        List<Integer> numbers = findAllNumbers(digits);
        System.out.println("All possible numbers from given digits:");
        System.out.println(numbers);
    }
}
