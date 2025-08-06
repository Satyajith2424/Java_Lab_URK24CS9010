import java.util.Scanner;
import java.util.Random;
public class exp1_4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int Random_num = rand.nextInt(100) + 1; // 1 to 100
        int User_guess;

        System.out.println("Guess a number between 1 and 100:");

        while (true) {
            System.out.print("Enter your guess: ");
            User_guess = sc.nextInt();

            if (User_guess > Random_num) {
                System.out.println("Too High");
            } else if (User_guess < Random_num) {
                System.out.println("Too Low");
            } else {
                System.out.println("Correct Guess!");
                break; 
            }
        }


	}

}
