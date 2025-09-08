import java.util.Scanner;
class Account {
    protected String Cus_name;
    protected int acc_no;
    protected double balance;
    public Account(String x, int y, double z) {
        this.acc_no = y;
        this.Cus_name = x;
        this.balance = z;}
    public void view_balance() {
        System.out.println("The balance of acc " + acc_no + " is " + balance);
    }
    public void withdraw(int a) {
        balance -= a;
    }
    public void deposit(double b) {
        balance += b;
    }}
class Savings_account extends Account {
    public Savings_account(String x, int y) {
        super(x, y, 40000); // initial balance
    }
    public void withdraw(int f) {
        if (f > balance) {
            System.out.println("Insufficient Balance! Overdraw not possible.");
        } else {
            super.withdraw(f);
        }}
    public void deposit_1(double c) {
        double intrst = 0.06 * c;
        super.deposit(c + intrst);
        System.out.println("Successfully deposited " + c + " with interest " + intrst);
    }}
class Current_account extends Account {
    public Current_account(String x, int y) {
        super(x, y, 60000); // initial balance
    }
 
    public void withdraw(int m) {
        if (m > balance) {
            double overdrawn = m - balance;
            double serv_char = 0.035 * overdrawn;
            System.out.println("Overdrawn detected! Service charge = " + serv_char);
        } else {
            super.withdraw(m);
        } }
    public void deposit_2(double g) {
        super.deposit(g);
        System.out.println("Successfully deposited " + g);
    }}
public class Exp5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Savings_account sa = new Savings_account("Alice", 1001);
        Current_account ca = new Current_account("Bob", 2002);
        System.out.println("\n--- Savings Account ---");
        sa.view_balance();
        sa.deposit_1(5000);
        sa.withdraw(2000);
        sa.view_balance();
        System.out.println("\n--- Current Account ---");
        ca.view_balance();
        ca.deposit_2(3000);
        ca.withdraw(70000); 
        ca.withdraw(5000);
        ca.view_balance();
    }
}
