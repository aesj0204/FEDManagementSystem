package food;

import java.util.Calendar;
import java.util.Scanner;

public class EdNotSpecified extends Food {
	protected int days;
	
	public void getUserInput(Scanner input) {
		System.out.print("Food Name: ");
		String foodname = input.next();
		this.setFoodname(foodname);
		
		System.out.print("Food Category: ");
		String foodcategory = input.next();
		this.setFoodcategory(foodcategory);
		
		System.out.print("Location: ");
		String location = input.next();
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
		
		input.nextLine();
		
		System.out.print("Note: ");
		String note = input.nextLine();
		this.setNote(note);
	}

}
