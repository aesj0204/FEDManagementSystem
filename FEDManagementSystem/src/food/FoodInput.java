package food;

import java.util.Scanner;

public interface FoodInput {
	
	public String getFoodname();
	
	public void setFoodname(String foodname);
	
	public void setFoodcategory(String foodcategory);
	
	public void setLocation(String location);
	
	public void setExpirydate(String expirydate);
	
	public void setFoodimage(String foodimage);
	
	public void setNote(String note);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();

}
