# Bank Account Simulator

This is a simple mobile application built using Kotlin in Android Studio. The app simulates a basic "bank account" system where users can set an initial balance, perform deposits, make withdrawals, and view their current balance after each transaction.

## Features
- **Set Initial Balance**: Users can input an initial balance when starting the app.
- **Deposit Money**: Users can add money to their account.
- **Withdraw Money**: Users can withdraw money with validation to ensure the withdrawal amount does not exceed the current balance.
- **View Current Balance**: The app displays the updated balance after every transaction.

## Technologies Used
- **Language**: Kotlin
- **IDE**: Android Studio
- **Layout**: XML for UI design

## Getting Started

### Prerequisites
- Android Studio installed on your computer.
- Basic understanding of Kotlin and Android development.

### Installation
1. Clone this repository:
   ```bash
   git clone https://github.com/Kingston-chong/bank-account-simulator.git
   ```
2. Open the project in Android Studio.
3. Sync the Gradle files.
4. Build and run the app on an emulator or physical device.

### File Structure
- **MainActivity.kt**: Contains the main logic for the app, including UI interactions and manages account transactions (deposit, withdraw, get balance).
- **activity_main.xml**: Defines the user interface for the app.

## How to Use
1. Launch the app.
2. Enter an initial balance and click **Set Initial Balance**.
3. To deposit money, enter an amount in the "Deposit" field and click **Deposit**.
4. To withdraw money, enter an amount in the "Withdraw" field and click **Withdraw**.
5. The current balance is displayed at the top after each transaction.

## Validation Rules
- The initial balance must be a non-negative number.
- Deposits must be positive values.
- Withdrawals cannot exceed the current balance.

## License
This project is licensed under the MIT License. See the `LICENSE` file for details.

## Contributing
Contributions are welcome! Feel free to open an issue or submit a pull request.

## Contact
For any questions or suggestions, feel free to reach out:
- Email: your.email@example.com
- GitHub: [yourusername](https://github.com/yourusername)

