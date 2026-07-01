import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        if (size < 2) {
            System.out.println("Array must have at least 2 elements to find a pair.");
            scanner.close();
            return;
        }

        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter the Target Sum: ");
        int targetSum = scanner.nextInt();

        boolean pairFound = false;

        System.out.println("\n--- Searching for Pairs ---");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == targetSum) {

                    System.out.println("Pair Found!");
                    System.out.println("Indices: [" + i + ", " + j + "]");
                    System.out.println("Values: " + numbers[i] + " and " + numbers[j]);
                    System.out.println("Equation: " + numbers[i] + " + " + numbers[j] + " = " + targetSum);
                    pairFound = true;
                    break; 
                }
            }
            if (pairFound) break; 
        }

        if (!pairFound) {
            System.out.println("No distinct pair exists whose sum equals " + targetSum + ".");
        }

        scanner.close();
    }
}