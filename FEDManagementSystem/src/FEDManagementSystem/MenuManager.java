package FEDManagementSystem;

import java.time.LocalDate;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		while(num != 6) {
			System.out.println("*** FED Management System Menu ***");
			System.out.printf("Today: %s", now + "\n");
			System.out.println("1. Add Food");
			System.out.println("2. Delete Food");
			System.out.println("3. Edit Food");
			System.out.println("4. View Expired Food");
			System.out.println("5. View All Food");
			System.out.println("6. Exit");
			System.out.print("Select one number between 1-5: ");
			num = input.nextInt();
			if(num == 1) {
				addFood();
			}
			else if(num == 2) {
				deleteFood();
			}
			else if(num == 3) {
				editFood();
			}
			else if(num == 4) {
				
			}
			else if(num == 5) {
				
			}
			else {
				break;
			}
		}

	}
	
	public static void addFood() {
		Scanner input = new Scanner(System.in);
		System.out.print("Food Name: ");
		String foodname = input.next();
		
		System.out.print("Food Category: ");
		String foodcategory = input.next();
		
		System.out.print("Location: ");
		String location = input.next();
		
		System.out.print("Expiration Date: ");
		String expirationdate = input.next();
		
		System.out.print("Food Image: ");
		String foodimage = input.next();
		
		input.nextLine();
		
		System.out.print("Note: ");
		String note = input.nextLine();
	}
	
	public static void deleteFood() {
		Scanner input = new Scanner(System.in);
		System.out.print("Food Name: ");
		String foodname = input.next();
	}
	
	public static void editFood() {
		Scanner input = new Scanner(System.in);
		System.out.print("Food Name: ");
		String foodname = input.next();
	}

}
