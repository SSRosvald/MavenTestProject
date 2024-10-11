package com.test.MavenTestProject;

import javax.swing.*;

public class MovieRentalGUI {
	public static void main(String[] args) {
		JFrame frame = new Jframe("Movie Rental System");
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);
		
		frame.setVisible(true);
	}
	
	private static void placeComponents(JPanel panel) {
		panel.setLayout(null);
		
		JLabel movieLabel = new JLabel("Movie");
		movieLabel.setBounds(10, 20, 80, 25);
		panel.add(movieLabel);
		
		JTextField movieText = new JTextField(20);
		movieText.setBounds(10, 20, 165, 25);
		panel.add(movieText);
		
		JButton searchButton = new JButton("Search");
		searchButton.setBounds(10, 80, 80, 25);
		panel.add(searchButton);
	}

}
