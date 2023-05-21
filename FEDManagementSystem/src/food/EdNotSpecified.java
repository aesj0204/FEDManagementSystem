package food;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EdNotSpecified extends Food {
	protected int days;
	
	public EdNotSpecified(FoodKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setFoodName(input);
		setFoodCategory(input);
		setFoodLocation(input);
		setFoodExpirydateNum(input);
		setFoodImagewithYN(input);
		setFoodNote(input);
	}
	
	public void setFoodExpirydateNum(Scanner input) {
		days = -1;
		while(days < 0) {
			try {
				System.out.print("How many days are left before the expiry date?: ");
				days = input.nextInt();
				if(days >= 0) {
					Calendar date = Calendar.getInstance();
					date.add(Calendar.DAY_OF_MONTH, days);
					int year = date.get(Calendar.YEAR);
					int month = date.get(Calendar.MONTH);
					int ddday = date.get(Calendar.DAY_OF_MONTH);
					String expirydate = Integer.toString(year) + '/' + Integer.toString(month+1) + '/' + Integer.toString(ddday);
					this.setExpirydate(expirydate);
				}
				else {
					System.out.println("Please enter it correctly!");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please enter it correctly!!!");
				if(input.hasNext()) {
					input.next();
				}
				days = -1;
			}
		}
	}
	
	public void setFoodImagewithYN(Scanner input) {
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer !='N') {
			System.out.print("Do you have an image? (Y/N): ");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				setFoodImage(input);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				this.setImage("");
				break;
			}
			else {
			}
		}
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind: " + skind + " Food Name: " + this.name + " Food Category: " + this.category + " Location: " + this.location + " Expiry Date: " + this.expirydate + " Food Image: " + this.image + " Note: " + this.note + " D-Day: " + DDAY());
	}
	
}
