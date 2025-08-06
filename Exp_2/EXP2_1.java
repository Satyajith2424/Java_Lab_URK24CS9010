import java.util.Scanner;

public class EXP2_1 {



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of The Array");

		int b = sc.nextInt();

		char[] a = new char[b];

		System.out.println("Enter the Letter");

		int vow =0;

		int conso=0;

		String vowels = "aeiouAEIOU";

		for (int i=0;i<a.length;i++) {

			char c = sc.next().charAt(0);

			a[i] = c;

			 if (Character.isLetter(c)) {
			        if (vowels.indexOf(c) != -1) {
			            vow++;
			        } else {
			            conso++;
			        }
		}
			 
		}
		System.out.println("The No of Vowels :"+vow);

		System.out.println("The No of Consonants :"+conso);
		System.out.print("Duplicate characters are: ");
        boolean found = false;

        for (int i = 0; i < b; i++) {
            for (int j = i + 1; j < b; j++) {
                if (a[i] == a[j]) {
                    boolean alreadyPrinted = false;
                    for (int k = 0; k < i; k++) {
                        if (a[k] == a[i]) {
                            alreadyPrinted = true;
                            break;
                        }
                    }
                    if (!alreadyPrinted) {
                        System.out.print(a[i] + " ");
                        found = true;
                    }
                }
            }
        }

        if (!found) {
            System.out.print("None");
        }
		

	}
	}

