import java.util.Scanner;



public class Exp3_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);





        System.out.print("Enter a string: ");

        String s = sc.next();



        if (s.length() == 0) {

            System.out.println("Empty string entered!");

        } else {

            char a = s.charAt(0);

            String b = s.substring(1);

            b = b.replace(a, '$');



            

            String result = a + b;



            System.out.println("Modified string: " + result);

        }

        

        sc.close();

    }

}
