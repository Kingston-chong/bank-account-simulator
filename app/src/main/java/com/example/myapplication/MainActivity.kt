package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

//main file for button actions
class MainActivity : AppCompatActivity() {
    private var bankAccount: BankAccount? = null

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //link to activity_main.xml
        setContentView(R.layout.activity_main)
//define variables
        val initialBalanceInput: EditText = findViewById(R.id.initialBalanceInput)
        val transactionAmountInput: EditText = findViewById(R.id.transactionAmountInput)
        val initializeButton: Button = findViewById(R.id.initializeButton)
        val depositButton: Button = findViewById(R.id.depositButton)
        val withdrawButton: Button = findViewById(R.id.withdrawButton)
        val balanceDisplay: TextView = findViewById(R.id.balanceDisplay)
//initialize button action
        initializeButton.setOnClickListener {
            val initialBalanceStr = initialBalanceInput.text.toString()
            if (initialBalanceStr.isNotEmpty()) {
                val initialBalance = initialBalanceStr.toDouble()
                bankAccount = BankAccount(initialBalance)
                balanceDisplay.text = "Current Balance: $${bankAccount!!.balance}"
                Toast.makeText(this, "Account initialized.", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please enter an initial balance.", Toast.LENGTH_SHORT).show()
            }
        }
//deposit button action
        depositButton.setOnClickListener {
            if (bankAccount != null) {
                val amountStr = transactionAmountInput.text.toString()
                if (amountStr.isNotEmpty()) {
                    val amount = amountStr.toDouble()
                    bankAccount!!.deposit(amount)
                    balanceDisplay.text = "Current Balance: $${bankAccount!!.balance}"
                    Toast.makeText(this, "Deposit successful.", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Please enter an amount.", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Please initialize the account first.", Toast.LENGTH_SHORT).show()
            }
        }
//withdraw button action
        withdrawButton.setOnClickListener {
            if (bankAccount != null) {
                val amountStr = transactionAmountInput.text.toString()
                if (amountStr.isNotEmpty()) {
                    val amount = amountStr.toDouble()
                    if (bankAccount!!.withdraw(amount)) {
                        balanceDisplay.text = "Current Balance: $${bankAccount!!.balance}"
                        Toast.makeText(this, "Withdrawal successful.", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(this, "Insufficient balance.", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    Toast.makeText(this, "Please enter an amount.", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Please initialize the account first.", Toast.LENGTH_SHORT).show()
            }
        }
    }
//operation for deposit
    class BankAccount(var balance: Double) {
        fun deposit(amount: Double) {
            if (amount > 0) {
                balance += amount
            }
        }
//operation for withdrawal
        fun withdraw(amount: Double): Boolean {
            return if (amount > 0 && amount <= balance) {
                balance -= amount
                true
            } else {
                false
            }
        }
    }
}
