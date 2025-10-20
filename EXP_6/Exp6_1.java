import java.util.Scanner;

abstract class Device {
	int deviceId;
	String Brand;
	int price;

	Device(int a, String b, int c) {
		this.deviceId = a;
		this.Brand = b;
		this.price = c;
	}

	abstract void displayDetails();
}

interface Discountable {
	void applyDiscount(double p);
	double finalPrice();
}

class SmartPhone extends Device implements Discountable {
	double final_price;

	SmartPhone(int d, String e, int f) {
		super(d, e, f);
		final_price = f; // initialize same as price
	}

	void displayDetails() {
		System.out.println("Device Id : " + deviceId);
		System.out.println("Brand Name : " + Brand);
		System.out.println("Price : " + price);
		System.out.println("Final Price After Discount : " + final_price);
	}

	public void applyDiscount(double p) {
		double z = price * (p / 100);
		final_price = price - z;
	}

	public double finalPrice() {
		return final_price;
	}
}

public class Exp6_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SmartPhone mobile = null;
		int choice;

		do {
			System.out.println("---------- Smart Device Store ----------");
			System.out.println("1.Add Smartphone");
			System.out.println("2.Apply Discount");
			System.out.println("3.View Device Details");
			System.out.println("4.Exit");
			System.out.println("Enter your Choice");
			choice = sc.nextInt();

			switch (choice) {
				case 1:
					System.out.println("Enter the Device ID:");
					int id = sc.nextInt();
					System.out.println("Enter the Brand of the Smartphone");
					String br = sc.next();
					System.out.println("Enter the price of the product");
					int pr = sc.nextInt();
					mobile = new SmartPhone(id, br, pr);
					System.out.println("Smartphone Added Successfully!");
					break;

				case 2:
					if (mobile == null) {
						System.out.println("Please add a smartphone first!");
					} else {
						System.out.println("Enter the Discount in percentage :");
						double di = sc.nextDouble();
						mobile.applyDiscount(di);
						System.out.println("Discount Applied. Final Price: " + mobile.finalPrice());
					}
					break;

				case 3:
					if (mobile == null) {
						System.out.println("Please add a smartphone first!");
					} else {
						mobile.displayDetails();
					}
					break;

				case 4:
					System.out.println("Exiting... Thank You!");
					break;

				default:
					System.out.println("Invalid Choice! Try Again.");
			}
		} while (choice != 4);
		sc.close();
	}
}
