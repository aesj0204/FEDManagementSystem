package xms;

import java.util.ArrayList;
import java.util.Scanner;

import food.Food;
import food.EdNotSpecified;

public class FoodManager {
	ArrayList<Food> foods = new ArrayList<Food>();
	Scanner input;
	FoodManager(Scanner input){
		this.input = input;
	}
	
	public void addFood() {
		int kind = 0;
		Food food;
		while(kind != 1 && kind != 2) {
			System.out.println("1. Expiry date specified");
			System.out.println("2. Expiry date not Specified");
			System.out.print("Select num for Food Kind between 1 and 2: ");
			kind = input.nextInt();
			if(kind == 1) {
				food = new Food();
				food.getUserInput(input);
				foods.add(food);
				break;
			}
			else if(kind == 2) {
				food = new EdNotSpecified();
				food.getUserInput(input);
				foods.add(food);
				break;
			}
			else {
				System.out.print("Select num for Food Kind between 1 and 2: ");
			}
			
		}
	}
	
	public void deleteFood() {
		System.out.print("Food Name: ");
		String foodname = input.next();
		int index = -1;
		for(int i = 0; i<foods.size(); i++) {
			if(foods.get(i).getFoodname().equals(foodname)) {
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
		String name = input.next();
		for(int i = 0; i<foods.size(); i++) {
			Food food = foods.get(i);
			if(food.getFoodname().equals(name)) {
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
						System.out.print("Food Name: ");
						String foodname = input.next();
						food.setFoodname(foodname);
					}
					else if(num == 2) {
						System.out.print("Food Category: ");
						String foodcategory = input.next();
						food.setFoodcategory(foodcategory);
					}
					else if(num == 3) {
						System.out.print("Location: ");
						String location = input.next();
						food.setLocation(location);
					}
					else if(num == 4) {
						System.out.print("Expiry Date: ");
						String expirydate = input.next();
						food.setExpirydate(expirydate);
					}
					else if(num == 5) {
						System.out.print("Food Image: ");
						String foodimage = input.next();
						food.setFoodimage(foodimage);
					}
					else if(num == 6) {
						System.out.print("Note: ");
						input.nextLine();
						String note = input.nextLine();
						food.setNote(note);
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
		System.out.println("# of registered foods: " + foods.size());
		for(int i = 0; i < foods.size(); i++) {
			foods.get(i).printInfo();
		}
	}

}
