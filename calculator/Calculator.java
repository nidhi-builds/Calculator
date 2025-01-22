// Calculator.java

class Calculator {
    int addition() {
        int[] num;
        UserInput in = new UserInput();
        num = in.userInput();
        return num[0] + num[1];
    }

    int subtraction() {
        int[] num;
        UserInput in = new UserInput();
        num = in.userInput();
        return num[0] - num[1];
    }

    int multiplication() {
        int[] num;
        UserInput in = new UserInput();
        num = in.userInput();
        return num[0] * num[1];
    }

    double division() {
        int[] num;
        UserInput in = new UserInput();
        num = in.userInput();
        if (num[1] == 0) {
            System.out.println("Division by zero is not allowed.");
            return Double.NaN;
        }
        return (double) num[0] / num[1];
    }

    void fibonacciSequence() {
        UserInput in = new UserInput();
        System.out.print("Enter the number of terms for Fibonacci sequence: ");
        int n = in.singleInput();
        int a = 0, b = 1;
        System.out.print("Fibonacci sequence: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    int sumOfArray() {
        UserInput in = new UserInput();
        int[] array = in.arrayInput();
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    double meanOfArray() {
        UserInput in = new UserInput();
        int[] array = in.arrayInput();
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }
}
