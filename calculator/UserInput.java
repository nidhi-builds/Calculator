// UserInput.java

import java.util.*;

class UserInput {
    int[] userInput() {
        int[] numbers = new int[2];
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        numbers[0] = scan.nextInt();

        System.out.print("Enter 2nd number: ");
        numbers[1] = scan.nextInt();

        return numbers;
    }

    int[] arrayInput() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }

        return array;
    }

    int singleInput() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    void selectOperation() {
        Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in);

        System.out.println("\nSelect operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Fibonacci Sequence");
        System.out.println("6. Sum of Array");
        System.out.println("7. Mean of Array");
        System.out.print("Enter your choice: ");

        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + calculator.addition());
                break;
            case 2:
                System.out.println("Result: " + calculator.subtraction());
                break;
            case 3:
                System.out.println("Result: " + calculator.multiplication());
                break;
            case 4:
                System.out.println("Result: " + calculator.division());
                break;
            case 5:
                calculator.fibonacciSequence();
                break;
            case 6:
                System.out.println("Result: " + calculator.sumOfArray());
                break;
            case 7:
                System.out.println("Result: " + calculator.meanOfArray());
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
