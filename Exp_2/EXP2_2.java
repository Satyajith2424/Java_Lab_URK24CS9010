import java.util.Scanner;



public class EXP2_2 {



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of The Array");

		int b = sc.nextInt();

		int[] a = new int[b];

		int totalodd =0;

		int totaleven = 0;

		System.out.println("Enter the elements");

		for (int i=0;i<a.length;i++) {

			int c= sc.nextInt();

			a[i]=c;

			if (c%2==0) {

				totaleven+=c;

			}

			else {

				totalodd+=c;

			}

		}

		System.out.println("The total of Odd Numbers"+totalodd);

		System.out.println("The total of Even Numbers"+totaleven);

	}



}