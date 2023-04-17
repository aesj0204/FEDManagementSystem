package xms;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodManager {
	ArrayList<Food> foods = new ArrayList<Food>();
	Scanner input;
	FoodManager(Scanner input){
		this.input = input;
	}
	
	public void addFood() {
		Food food = new Food();
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
		
		foods.add(food);
	}
	
	public void deleteFood() {
		System.out.print("Food Name: ");
		String foodname = input.next();
		int index = -1;
		for(int i = 0; i<foods.size(); i++) {
			if(foods.get(i).foodname.equals(foodname)) {
				index = i;
				break;
			}
		}
		
		if(index >= 0) {
			foods.remove(index);
			System.out.println("the food " + foodname + " is deleted");
		}
		
		else {
			System.out.println("the food has not been registered");
			return;
		}
		
	}
	
	public void editFood() {
		System.out.print("Food Name: ");
		String foodname = input.next();
		for(int i = 0; i<foods.size(); i++) {
			Food food = foods.get(i);
			if(food.foodname.equals(foodname)) {
				int num = -1;
				
				while(num != 7) {
					System.out.println("*** Food Info Edit Menu ***");
					System.out.println("1. Edit Food Name");
					System.out.println("2. Edit Food Category");
					System.out.println("3. Edit Location");
					System.out.println("4. Edit Expiry Date");
					System.out.println("5. Edit Food Image");
					System.out.println("6. Edit Note");
					System.out.println("7. Exit");
					System.out.print("Select one number between 1-7: ");
					num = input.nextInt();
					if(num == 1) {
						food.foodname = input.next();
					}
					else if(num == 2) {
						food.foodcategory = input.next();
					}
					else if(num == 3) {
						food.location = input.next();
					}
					else if(num == 4) {
						food.expirydate = input.next();
					}
					else if(num == 5) {
						food.foodimage = input.next();
					}
					else if(num == 6) {
						input.nextLine();
						food.note = input.nextLine();
					}
					else {
						continue;
					}
				}
				break;
			}
		}
		
	}
	
	public void viewFoods() {
		for(int i = 0; i<foods.size(); i++) {
			foods.get(i).printInfo();
		}
	}

}
