import java.util.Scanner;

import java.util.Random;

public class exp1_4 {



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Random rand = new Random();

		int random_num = rand.nextInt(100)+1;

		int i =1;

		while(i<=7) {

			if(i>6) {

				System.out.println("Game Over! Max Attempts Reached");

				break;

			}

			System.out.println("Attempt No:"+i);

			System.out.println("Enter the number You Guessed");

			int user_guess =sc.nextInt();

			

			if(user_guess>random_num) {

				System.out.println("Too High");

			}

			else if(user_guess<random_num) {

				System.out.println("Too Low");

			}

			else {

				System.out.println("Correct Guess");

				break;

			}

			i++;

			

		

		}

	}



}

}

