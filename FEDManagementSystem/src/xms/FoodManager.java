package xms;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import food.FoodInput;
import food.FoodKind;
import food.EdNotSpecified;
import food.EdSpecified;
import food.Food;

public class FoodManager implements Serializable {
	
	private static final long serialVersionUID = -1080666487036940320L;
	
	ArrayList<FoodInput> foods = new ArrayList<FoodInput>();
	transient Scanner input;
	FoodManager(Scanner input){
		this.input = input;
	}
	
	public void setScanner(Scanner input) {
		this.input = input;
	}
	
	public void addFood() {
		int kind = 0;
		FoodInput foodInput;
		while(kind != 1 && kind != 2) {
			try {
				System.out.println("1. Expiry date specified");
				System.out.println("2. Expiry date not Specified");
				System.out.print("Select num for Food Kind between 1 and 2: ");
				kind = input.nextInt();
				if(kind == 1) {
					foodInput = new EdSpecified(FoodKind.EdSpecified);
					foodInput.getUserInput(input);
					foods.add(foodInput);
					break;
				}
				else if(kind == 2) {
					foodInput = new EdNotSpecified(FoodKind.EdNotSpecified);
					foodInput.getUserInput(input);
					foods.add(foodInput);
					break;
				}
				else {
					System.out.println("Select num for Food Kind between 1 and 2: ");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 2!");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}
	
	public void deleteFood() {
		System.out.print("Food Name: ");
		String foodname = input.next();
		int index = findIndex(foodname);
		removefromFoods(index, foodname);
		
	}
	
	public int findIndex(String foodname) {
		int index = -1;
		for(int i = 0; i<foods.size(); i++) {
			if(foods.get(i).getName().equals(foodname)) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromFoods(int index, String foodname) {
		if(index >= 0) {
			foods.remove(index);
			System.out.println("the food " + foodname + " is deleted");
			return 1;
		}
		
		else {
			System.out.println("the food has not been registered");
			return -1;
		}
	}
	
	public void editFood() {
		System.out.print("Food Name: ");
		String name = input.next();
		for(int i = 0; i<foods.size(); i++) {
			FoodInput food = foods.get(i);
			if(food.getName().equals(name)) {
				int num = -1;
				while(num != 7) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						food.setFoodName(input);
						break;
					case 2:
						food.setFoodCategory(input);
						break;
					case 3:
						food.setFoodLocation(input);
						break;
					case 4:
						food.setFoodExpirydate(input);
						break;
					case 5:
						food.setFoodImage(input);
						break;
					case 6:
						food.setFoodNote(input);
						break;
					default:
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
	
	public int size() {
		return foods.size();
	}
	
	public FoodInput get(int index) {
		return (Food) foods.get(index);
	}
	
	public void showEditMenu() {
		System.out.println("*** Food Info Edit Menu ***");
		System.out.println("1. Edit Food Name");
		System.out.println("2. Edit Food Category");
		System.out.println("3. Edit Location");
		System.out.println("4. Edit Expiry Date");
		System.out.println("5. Edit Food Image");
		System.out.println("6. Edit Note");
		System.out.println("7. Exit");
		System.out.print("Select one number between 1-7: ");
	}

}
