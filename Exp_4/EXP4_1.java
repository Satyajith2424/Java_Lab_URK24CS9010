import java.util.Scanner;
class Bank {
    private String Acc_num;
    private String Holder_name;
    private float balance;
    public Bank(String a, String b, float c) {
        this.Acc_num = a;
        this.Holder_name = b;
        this.balance = c;
    }
    public void Deposit(float amount) {
        balance += amount;
        System.out.println("Amount deposited successfully.");
    }
    public void Withdraw(float amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Low Balance. Cannot withdraw.");
        }
    }
    public void Display() {
        System.out.println("Account Number: " + Acc_num);
        System.out.println("Account Holder Name: " + Holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("----------------------------");
    }
}
public class EXP4_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the Details of the 1st Account");
        System.out.print("Account Number: ");
        String acc1Num = s.next();
        System.out.print("Account Holder Name: ");
        String acc1Name = s.next();
        System.out.print("Balance: ");
        float acc1Bal = s.nextFloat();
        Bank Acc1 = new Bank(acc1Num, acc1Name, acc1Bal);

        System.out.println("\nEnter the Details of the 2nd Account");
        System.out.print("Account Number: ");
        String acc2Num = s.next();
        System.out.print("Account Holder Name: ");
        String acc2Name = s.next();
        System.out.print("Balance: ");
        float acc2Bal = s.nextFloat();
        Bank Acc2 = new Bank(acc2Num, acc2Name, acc2Bal);
        System.out.println("\nAccounts created successfully!\n");
        while (true) {
            System.out.println("Select the account to access (1 or 2), or 0 to exit:");
            int choice = s.nextInt();
            if (choice == 0) {
                System.out.println("Exiting! Thank you.");
                break;
            }
            Bank selectedAcc;
            if (choice == 1) selectedAcc = Acc1;
            else if (choice == 2) selectedAcc = Acc2;
            else {
                System.out.println("Invalid Choice.");
                continue;
            }
            boolean back = false;
            while (!back) {
                System.out.println("\nSelect the operation:");
                System.out.println("1. Deposit Money");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Display Details");
                System.out.println("4. Back to Account Selection");
                int op = s.nextInt();
                switch (op) {
                    case 1:
                        System.out.print("Enter the amount to deposit: ");
                        float d = s.nextFloat();
                        selectedAcc.Deposit(d);
                        selectedAcc.Display();
                        break;
                    case 2:
                        System.out.print("Enter the amount to withdraw: ");
                        float w = s.nextFloat();
                        selectedAcc.Withdraw(w);
                        selectedAcc.Display();
                        break;
                    case 3:
                        selectedAcc.Display();
                        break;
                    case 4:
                        back = true;
                        break;
                    default:
                        System.out.println("Invalid Choice");
                }
            }
        }
        s.close();
    }
}

