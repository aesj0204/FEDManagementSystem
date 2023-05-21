package food;

import java.util.Scanner;

public class EdSpecified extends Food {
	
	public EdSpecified(FoodKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setFoodName(input);
		setFoodCategory(input);
		setFoodLocation(input);
		setFoodExpirydate(input);
		setFoodImage(input);
		setFoodNote(input);
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind: " + skind + " Food Name: " + this.name + " Food Category: " + this.category + " Location: " + this.location + " Expiry Date: " + this.expirydate + " Food Image: " + this.image + " Note: " + this.note + " D-Day: " + DDAY());
	}

}
