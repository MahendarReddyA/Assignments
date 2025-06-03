package assignments;

public class Assignment7_ConditionalStatements {

	public static void main(String[] args) {
		// A bank evaluates loan applicants based on the following criteria:
		String CustomerName="John Doe";
		int creditscore =720;
		double income=55000.0;
		 boolean isEmployed = true;
	     double debtToIncomeRatio = 35.0;
	     System.out.println("Loan evaluation for: " + CustomerName);
	     
			if (creditscore > 750) {
				System.out.println("Loan is automaticallu approved");
			} else if (creditscore >= 650 && creditscore <= 750) {
				if (income >= 50000) {
					if (isEmployed) {
						if (debtToIncomeRatio < 40.0) {
							System.out.println("Loan is Approved : Meets all additional criteria.");
						} else {
							System.out.println("Loan is denied : debtToIncomeRatio is too high");
						}
					} else {
						System.out.println("The loan is denied : Customer is unemployed");
					}

				}

				else {
					System.out.println("Loan Denied: Income is less than required minimum");
				}
			}

			else {
				System.out.println("Loan Denied: Credit score is too low");
			}
		}
	}
	
	 