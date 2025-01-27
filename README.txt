Bank Account Simulator By Kingston Chong
=========================================

This is a simple mobile application built using Kotlin in Android Studio. The app simulates a basic "bank account" system where users can set an initial balance, perform deposits, make withdrawals, and view their current balance after each transaction.

Features includes:

Set Initial Balance: Users can input an initial balance when starting the app.

Deposit Money: Users can add money to their account.

Withdraw Money: Users can withdraw money with validation to ensure the withdrawal amount does not exceed the current balance.

View Current Balance: The app displays the updated balance after every transaction.

---------------------
TOOLS USED
---------------------
Language: Kotlin

IDE: Android Studio

Layout: XML for UI design


---------------------
GETTING STARTED
---------------------
Prerequisites

To compile, please ensure Android Studio is installed on your computer.

---------------------
INSTALLATION
---------------------

1. Clone this repository: git clone https://github.com/kingston-chong/bank-account-simulator.git
OR extract the "bank-account-simulator" folder in the .zip file.

2. Open the project in Android Studio.

3. Sync the Gradle files.

4. Build and run the app on an emulator or physical device.

---------------------
FILE STRUCTURE
---------------------

MainActivity.kt: Contains the main logic for the app, including UI interactions and manages account transactions (deposit, withdraw, get balance).

activity_main.xml: Defines the user interface for the app.

---------------------
HOW TO USE
---------------------

Launch the app.

Enter an initial balance and click Set Initial Balance.

To deposit money, enter an amount in the "Deposit" field and click Deposit.

To withdraw money, enter an amount in the "Withdraw" field and click Withdraw.

The current balance is displayed at the top after each transaction.


Validation Rules

The initial balance must be a non-negative number.
Deposits must be positive values.
Withdrawals cannot exceed the current balance.



For any questions or suggestions, feel free to reach out:

Email: chongkingston391@gmail.com
GitHub: kingston-chong



