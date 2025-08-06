import java.util.Scanner;
public class exp1_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] units = new int[12] ;
		double total=0;
		System.out.println("Enter the units charged for each month from month 1-12");
		for (int i=0;i<12;i++) {
			System.out.println("Month"+(i+1)+":");
			units[i]=s.nextInt();
			total +=units[i];
		}
		double avg = total/12.0;
		System.out.println("Total Units Consumed:"+total);
		System.out.println("Average Units Consumed Per Month"+avg);
		if(avg>500) {
			System.out.println("High Consumption Alert !");
		}
	}

}
