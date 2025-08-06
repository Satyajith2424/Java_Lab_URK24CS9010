import java.util.Scanner;
public class exp1_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 10000 ;
		int choice;
		while(true) {
			System.out.println("   ATM menu - enter choice(1-4)  ");
			System.out.println("1. Check balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			choice = sc.nextInt();
			if (choice==1) {
				System.out.println("Balance : "+balance);
			}
			else if (choice==2) {
				System.out.println("Enter the deposit amount");
				int amt = sc.nextInt();
				balance += amt;
				System.out.println("Deposited Successfully");
			}
			else if(choice==3) {
				System.out.println("Give the amount to withdraw");
				int amount = sc.nextInt();
				if(amount<=balance) {
					balance-=amount;
					System.out.println("Withdrawn Successfully");
				}
				else {
					System.out.println("Not Enough Balance");
				}
			}
			else if(choice==4) {
				System.out.println("Thank You! Have a nice day ");
				break;
			}
			else {
				System.out.println("Invalid Choice! Try Again");
			}
		}
	}

}
