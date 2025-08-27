import java.util.Scanner;



public class Exp3_2 {



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Paragraph : ");

        String s = sc.nextLine();

        String a = s.toLowerCase();

        String[] arr =a.split(" ");

        System.out.println("Enter the string You want to search");

        String b = sc.next();

        String c = b.toLowerCase();

        int count=0;

        for (int i=0;i<arr.length;i++)

        {

        	if (c.equals(arr[i])) {

        		count += 1;

        	}

        }

        System.out.println("The no of times it occured in para :"+count);



	}      



}
