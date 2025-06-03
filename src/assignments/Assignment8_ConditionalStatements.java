package assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment8_ConditionalStatements {

	public static void main(String[] args) {
		// Bank Transactions assignment

		Map<String, String> BankTrx = new HashMap<>();
		BankTrx.put("Transactions1", "50000");
		BankTrx.put("Transactions2", "-2000");
		BankTrx.put("Transactions3", "3000");
		BankTrx.put("Transactions4", "-15000");
		BankTrx.put("Transactions5", "-200");
		BankTrx.put("Transactions6", "-300");
		BankTrx.put("Transactions7", "4000");
		BankTrx.put("Transactions8", "-3000");

		// Print total number of credit and debit transactions completed

		int totalcredits = 0;
		int totaldebits = 0;
		int totalCreditAmount = 0;
		int totalDebitAmount = 0;
		int suspiciousTransactions = 0;
		for (Map.Entry<String, String> entry : BankTrx.entrySet()) {
			int amount = Integer.parseInt(entry.getValue());
			if (amount > 0) {
				// It's a credit transaction
				totalcredits++; // Increment the credit transaction count
				totalCreditAmount += amount; // Add to total credited amount

				// Check for suspiciously large credit transaction
				if (amount > 10000) {
					System.out.println("Suspicious credit transaction with Amount: " + amount);
					suspiciousTransactions++;
				}

			} else {
				totaldebits++;
				totalDebitAmount += amount;

				if (amount < -10000) {
					System.out.println("Suspicious debit transaction with Amount: " + amount);
					suspiciousTransactions++;
				}
			}

		}
		int finalbalance = totalCreditAmount + totalDebitAmount;
		// Print a summary of the account activity
		System.out.println("----- Transaction Summary -----");
		System.out.println("Total number of credit transactions: " + totalcredits);
		System.out.println("Total number of debit transactions: " + totaldebits);
		System.out.println("Total amount credited: " + totalCreditAmount);
		System.out.println("Total amount debited: " + totalDebitAmount);
		System.out.println("Final remaining amount in the account: " + finalbalance);
		System.out.println("Total number of suspicious transactions: " + suspiciousTransactions);

	}
}
