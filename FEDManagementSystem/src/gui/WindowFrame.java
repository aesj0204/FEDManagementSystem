package gui;

import javax.swing.*;

import xms.FoodManager;

public class WindowFrame extends JFrame {
	FoodManager foodManager;
	MenuSelection menuselection;
	FoodAdder foodadder;
	FoodViewer foodviewer;

	public WindowFrame(FoodManager foodManager) {
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.foodManager = foodManager;
		this.menuselection = new MenuSelection(this);
		this.foodadder = new FoodAdder(this);
		this.foodviewer = new FoodViewer(this, this.foodManager);
		
		
		this.setupPanel(menuselection);
		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public FoodAdder getFoodadder() {
		return foodadder;
	}

	public void setFoodadder(FoodAdder foodadder) {
		this.foodadder = foodadder;
	}

	public FoodViewer getFoodviewer() {
		return foodviewer;
	}

	public void setFoodviewer(FoodViewer foodviewer) {
		this.foodviewer = foodviewer;
	}

}
