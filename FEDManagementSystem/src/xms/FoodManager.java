package xms;

import java.util.Scanner;

public class FoodManager {
	Food food;
	Scanner input;
	FoodManager(Scanner input){
		this.input = input;
	}
	
	public void addFood() {
		food = new Food();
		System.out.print("Food Name: ");
		food.foodname = input.next();
		
		System.out.print("Food Category: ");
		food.foodcategory = input.next();
		
		System.out.print("Location: ");
		food.location = input.next();
		
		System.out.print("Expiry Date: ");
		food.expirydate = input.next();
		
		System.out.print("Food Image: ");
		food.foodimage = input.next();
		
		input.nextLine();
		
		System.out.print("Note: ");
		food.note = input.nextLine();
	}
	
	public void deleteFood() {
		System.out.print("Food Name: ");
		String foodname = input.next();
		if(food == null) {
			System.out.println("the food has not been registered");
			return;
		}
		if(food.foodname.equals(foodname)) {
			food = null;
			System.out.println("the food is deleted");
		}
	}
	
	public void editFood() {
		System.out.print("Food Name: ");
		String foodname = input.next();
		if(food.foodname.equals(foodname)) {
			System.out.println("the food to be edited is " + foodname);
		}
	}
	
	public void viewFood() {
		System.out.print("Food Name: ");
		String foodname = input.next();
		if(food.foodname.equals(foodname)) {
			food.printInfo();
		}
	}

}
