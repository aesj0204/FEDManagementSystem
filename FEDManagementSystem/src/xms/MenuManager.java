package xms;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FoodManager foodManager = new FoodManager(input);
		
		selectMenu(input, foodManager);

	}
	
	public static void selectMenu(Scanner input, FoodManager foodManager) {
		int num = -1;
		while(num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					foodManager.addFood();
					break;
				case 2:
					foodManager.deleteFood();
					break;
				case 3:
					foodManager.editFood();
					break;
				case 4:
					foodManager.viewFoods();
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	
	public static void showMenu() {
		LocalDate now = LocalDate.now();
		System.out.println("*** FED Management System Menu ***");
		System.out.printf("Today: %s", now + "\n");
		System.out.println("1. Add Food");
		System.out.println("2. Delete Food");
		System.out.println("3. Edit Food");
		System.out.println("4. View Foods");
		System.out.println("5. Exit");
		System.out.print("Select one number between 1-5: ");
		
	}

}
