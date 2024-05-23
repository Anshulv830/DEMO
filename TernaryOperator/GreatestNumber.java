package TernaryOperator;

import java.util.Scanner;

public class GreatestNumber {

    public static void main(String[] args) {
        int a, b, c, Result;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter all three numbers:");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        Result = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        System.out.println("Greatest Number: " + Result);
    }
}
