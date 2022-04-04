package calculate;

import java.util.Scanner;

public class Main {
    //create main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean contniue = true;
        char Y, N;

        while ((contniue)) {
            System.out.println(" Please enter first number:");
            int num = input.nextInt();
            System.out.println(" Please enter second number:");
            int num2 = input.nextInt();
            System.out.println("please enter one symbol :");
            char symbol = input.next().charAt(0);
//       // int a = input.nextInt();
            Calculator obj = new Calculator();
            obj.calculateResult(num, num2,symbol);
            System.out.println("would you like to do more calculator");
            char ans = input.next().charAt(0);
            if (ans == 'Y' || ans == 'Y') {
                contniue = true;
            } else {
                System.out.println('N');
                System.out.println("End  of programme");
                break;
            }
        }
    }
}