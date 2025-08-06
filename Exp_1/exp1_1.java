import java.util.Scanner;
public class exp1_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double base = 200;

		System.out.println("Enter the age of individual :");

		int a = s.nextInt();

		System.out.println("Enter the day of viewing cinema");

		System.out.println("Monday-Friday - Type 1");
		
		System.out.println("Saturday-Sunday - Type 2");

		int b = s.nextInt();
		double d=0 ;
		
		if(a<5 && a>0) {
			System.out.println("Fare : Free");
		}
		else if (a>=5 && a<=18) {
			d=base-(base*0.40);
			if (b==1) {
				d-=base*0.10;
				System.out.print("Fare:"+d);
			}
			else {
				System.out.print("Fare:"+d);
			}
		}
		else if(a>=19 && a<=60){
			System.out.print("Fare:"+base);
		}
		else if(a>60) {
			d=base-(base*0.30);
			if (b==1) {
				d-=base*0.10;
				System.out.print("Fare:"+d);
			}
			else {
				System.out.print("Fare:"+d);
			}
		}
		else {
				System.out.print("Invalid");
			}
	}
}
