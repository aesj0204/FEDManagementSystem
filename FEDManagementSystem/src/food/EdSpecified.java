package food;

import java.util.Scanner;

public class EdSpecified extends Food implements FoodInput {
	
	public EdSpecified(FoodKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Food Name: ");
		String foodname = input.next();
		this.setFoodname(foodname);
		
		System.out.print("Food Category: ");
		String foodcategory = input.next();
		this.setFoodcategory(foodcategory);
		
		System.out.print("Location: ");
		input.nextLine();
		String location = input.nextLine();
		this.setLocation(location);
		
		System.out.print("Expiry Date: ");
		String expirydate = input.next();
		this.setExpirydate(expirydate);
		
		System.out.print("Food Image: ");
		String foodimage = input.next();
		this.setFoodimage(foodimage);
		
		System.out.print("Note: ");
		input.nextLine();
		String note = input.nextLine();
		this.setNote(note);
	}
	
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case EdSpecified:
			skind = "ED O";
			break;
		case EdNotSpecified:
			skind = "ED X";
			break;
		default:
		}
		System.out.println("kind: " + skind + " Food Name: " + this.foodname + " Food Category: " + this.foodcategory + " Location: " + this.location + " Expiry Date: " + this.expirydate + " Food Image: " + this.foodimage + " Note: " + this.note + " D-Day: " + DDAY());
	}

}
