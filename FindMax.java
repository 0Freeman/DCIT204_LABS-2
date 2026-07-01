import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Array size must be greater than 0.");
            scanner.close();
            return;
        }

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        int maxVal = numbers[0];
        int maxIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxVal) {
                maxVal = numbers[i];
                maxIndex = i;
            }
        }

        System.out.println("\n--- Results ---");
        System.out.println("Maximum Value: " + maxVal);
        System.out.println("Occurs at Index: " + maxIndex);

        scanner.close();
    }
}