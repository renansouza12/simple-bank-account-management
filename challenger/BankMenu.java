package challenger;

import java.util.Scanner;

public class BankMenu {

    Scanner sc = new Scanner(System.in);
    double balance;
    double value;
    int option = 0;

    BankMenu(double balance) {
        this.balance = balance;

        String menu = """

                -=-==-=-==-=-==-=-==-=-==-=-==-=-==
                       Choose your option:

                        1 -> Check balances
                        2 -> Transfer funds
                        3 -> Receive funds
                        4 -> Exit

                    Write your option:
                       """;

        while (option != 4) {
            System.out.println(menu);
            option = sc.nextInt();
            checkOption(option);
        }

    }

    void checkOption(int option) {
        switch (option) {
            case 1:
                System.out.printf("Your balance: %.2f $", balance);
                break;
            case 2:
                System.out.println("What value do you want to transfer: ");
                 value = sc.nextDouble();

                if (value > balance) {
                    System.out.println("There is no balance to make the transfer");
                }else{
                    balance -= value;
                    System.out.printf("Balance updated: %.2f $", balance);
                }
                break;
            case 3:
            System.out.println("Type the value to be received:");
            value = sc.nextDouble();
            balance += value;
            System.out.printf("Balance updated: %.2f $", balance);
                break;
            default:
                System.out.println("Option Invalid");
                break;
        }
    }

}
