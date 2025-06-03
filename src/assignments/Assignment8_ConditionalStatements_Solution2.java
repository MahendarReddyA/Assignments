package assignments;

import java.util.ArrayList;

public class Assignment8_ConditionalStatements_Solution2 {

	public static void main(String[] args) {
		// to store data in the Arraylist
		//to store all transactions
		
		ArrayList<Integer> transactions = new ArrayList<>();
		    transactions.add(50000);
	        transactions.add(-2000);
	        transactions.add(3000);
	        transactions.add(-15000);
	        transactions.add(-200);
	        transactions.add(-300);
	        transactions.add(4000);
	        transactions.add(-3000);
	        
	     // Variables to store the count and amount of credits and debits
			int totalCredits = 0;
			int totalDebits = 0;
			int totalCreditAmount = 0;
			int totalDebitAmount = 0;
			int suspiciousTransactions = 0;
			
			for(int amount : transactions) {
				if(amount>0) {
					totalCredits++;
					totalCreditAmount+=amount;
					
				}else {
					totalDebits++;
					totalDebitAmount+=amount;
				}
				if(amount>10000) {
					System.out.println("Suspicious credit transaction with Amount: " + amount);
					suspiciousTransactions++;
					
				}
				
				if(amount<-10000) {
				System.out.println("Suspicious debit transaction with Amount: " + amount);
				suspiciousTransactions++;
			}
	
	
			int balance = totalCreditAmount + totalDebitAmount;
			
			System.out.println("----- Transaction Summary -----");
			System.out.println("Total number of credit transactions: " + totalCredits);
			System.out.println("Total number of debit transactions: " + totalDebits);
			System.out.println("Total amount credited: " + totalCreditAmount);
			System.out.println("Total amount debited: " + totalDebitAmount);
			System.out.println("Final remaining amount in the account: " + balance);
			System.out.println("Total number of suspicious transactions: " + suspiciousTransactions);

	}

}}
