package gui;

import javax.swing.*;

public class FoodAdder extends JFrame {
	
	public FoodAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelName = new JLabel("Food Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelCategory = new JLabel("Food Category: ", JLabel.TRAILING);
		JTextField fieldCategory = new JTextField(10);
		labelCategory.setLabelFor(fieldCategory);
		panel.add(labelCategory);
		panel.add(fieldCategory);
		
		JLabel labelLocation = new JLabel("Location: ", JLabel.TRAILING);
		JTextField fieldLocation = new JTextField(10);
		labelLocation.setLabelFor(fieldLocation);
		panel.add(labelLocation);
		panel.add(fieldLocation);
		
		JLabel labelExpirydate = new JLabel("Expiry Date: ", JLabel.TRAILING);
		JTextField fieldExpirydate = new JTextField(10);
		labelExpirydate.setLabelFor(fieldExpirydate);
		panel.add(labelExpirydate);
		panel.add(fieldExpirydate);
		
		JLabel labelImage = new JLabel("Food Image: ", JLabel.TRAILING);
		JTextField fieldImage = new JTextField(10);
		labelImage.setLabelFor(fieldImage);
		panel.add(labelImage);
		panel.add(fieldImage);
		
		JLabel labelNote = new JLabel("Note: ", JLabel.TRAILING);
		JTextField fieldNote = new JTextField(10);
		labelNote.setLabelFor(fieldNote);
		panel.add(labelNote);
		panel.add(fieldNote);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 7, 2, 6, 6, 6, 6);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(panel);
		this.setVisible(true);
	}

}
