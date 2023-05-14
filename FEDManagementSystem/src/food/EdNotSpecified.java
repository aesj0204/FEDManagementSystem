package food;

import java.util.Calendar;
import java.util.Scanner;

public class EdNotSpecified extends Food implements FoodInput {
	protected int days;
	
	public EdNotSpecified(FoodKind kind) {
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
		
		days = 0;
		System.out.print("How many days are left before the expiry date?: ");
		days = input.nextInt();
		Calendar date = Calendar.getInstance();
		date.add(Calendar.DAY_OF_MONTH, days);
		int year = date.get(Calendar.YEAR);
		int month = date.get(Calendar.MONTH);
		int ddday = date.get(Calendar.DAY_OF_MONTH);
		String expirydate = Integer.toString(year) + '/' + Integer.toString(month+1) + '/' + Integer.toString(ddday);
		this.setExpirydate(expirydate);
		
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer !='N') {
			System.out.print("Do you have an image? (Y/N): ");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Food Image: ");
				String foodimage = input.next();
				this.setFoodimage(foodimage);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				this.setFoodimage("");
				break;
			}
			else {
			}
		}
		
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
