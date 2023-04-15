package FEDManagementSystem;

import java.time.LocalDate;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		Scanner input = new Scanner(System.in);
		FoodManager foodManager = new FoodManager(input);
		int num = -1;
		
		while(num != 5) {
			System.out.println("*** FED Management System Menu ***");
			System.out.printf("Today: %s", now + "\n");
			System.out.println("1. Add Food");
			System.out.println("2. Delete Food");
			System.out.println("3. Edit Food");
			System.out.println("4. View Food");
			System.out.println("5. Exit");
			System.out.print("Select one number between 1-5: ");
			num = input.nextInt();
			if(num == 1) {
				foodManager.addFood();
			}
			else if(num == 2) {
				foodManager.deleteFood();
			}
			else if(num == 3) {
				foodManager.editFood();
			}
			else if(num == 4) {
				foodManager.viewFood();
			}
			else {
				continue;
			}
		}

	}

}
