
# Bank Account Management Program 💼

The program focuses on handling values, checking balances, transferring, and receiving funds as part of the proposed challenge. Conditional statements are utilized to control the program flow based on the user's chosen option.
## Features

#### Checking Balances: 👀

Within a while loop, the program checks if the user input equals 1.
- If the condition is met, the program prints the updated balance.

#### Fund Transfers: 💸

- If the user input equals 2, the program prompts the user for the transfer amount, which is then stored in a variable.
- It verifies if the balance is sufficient for the transfer.
- If insufficient, it displays a corresponding message.
- If sufficient, it deducts the amount from the balance and displays the new balance.

#### Fund Reception: 📥

- If the input is 3, the program asks the user for the received amount.
- It adds the received amount to the balance and displays the new balance.

#### Handling Invalid Input: ⚠️

- If the user inputs an invalid option (not 1, 2, 3, or 4), it displays a message indicating the option is invalid.
