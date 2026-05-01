import java.util.Scanner;

public class SumUntilSingleDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = num;
        while (result >= 10) {
            int sum = 0;
            while (result > 0) {
                sum += result % 10;
                result /= 10;
            }
            result = sum;
        }

        System.out.println("Single-digit sum: " + result);
        sc.close();
    }
}