package challenger;

import java.util.Locale;
import java.util.Scanner;

public class BankUserDetail {
    String username;
    String accountType;
    double balance;

    BankUserDetail(){
        Scanner sc = new Scanner(System.in);

        System.out.printf("""
                ------------------
                    Welcome
                ------------------

                Please fill out with your data

                """);


        customSentence("Your name:");
        username = sc.nextLine();
        
        customSentence("Your Account Type:");
        accountType = sc.nextLine();

        customSentence("Your Balance:");
        balance = sc.nextDouble();


        customerDetails(username, accountType, balance);
    }

    void customSentence(String phrase){
        System.out.printf("""
                ------------------
                    %s
               
                """,phrase);
    }

    void customerDetails(String name, String accountType, double balance){
        System.out.printf(Locale.US,"""
            ----------------

                ===========================
                Customer Details:


                Name:                %s
                Account Type:        %s
                Balance:             %.2f $
                ============================
            """,name,accountType,balance);
    }
}
