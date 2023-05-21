package food;

import java.util.Scanner;

public interface FoodInput {
	
	public String getName();
	
	public void setName(String foodname);
	
	public void setCategory(String foodcategory);
	
	public void setLocation(String location);
	
	public void setExpirydate(String expirydate);
	
	public void setImage(String foodimage);
	
	public void setNote(String note);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setFoodName(Scanner input);
	
	public void setFoodCategory( Scanner input);
	
	public void setFoodLocation( Scanner input);
	
	public void setFoodExpirydate(Scanner input);
	
	public void setFoodImage(Scanner input);
	
	public void setFoodNote(Scanner input);

}
