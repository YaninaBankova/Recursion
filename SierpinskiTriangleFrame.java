package edu.smg;

import java.awt.BorderLayout;
//import java.awt.Graphics;
//import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class SierpinskiTriangleFrame extends JFrame {
	//static int r = 0, gr = 0, b = 255;

	private JButton btnMinus = new JButton("-");
	private JButton btnPlus = new JButton("+");
	
	private SierpinskiTrianglePanel trianglePanel = new SierpinskiTrianglePanel(); // To display the pattern

	public SierpinskiTriangleFrame() {
		// Panel to hold label, text field, and a button
		JPanel panel = new JPanel();
		panel.add(btnMinus);
		panel.add(btnPlus);
		// Add a Sierpinski triangle panel to the frame
		add(trianglePanel);
		add(panel, BorderLayout.SOUTH);
		// Register a listener
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(trianglePanel.getOrder() > 0) {
					trianglePanel.setOrder(trianglePanel.getOrder() - 1);
					SierpinskiTrianglePanel.gr = 255;
					SierpinskiTrianglePanel.blue = 0;
				}
			}
		});
		
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				trianglePanel.setOrder(trianglePanel.getOrder() + 1);
				SierpinskiTrianglePanel.gr = 255;
				SierpinskiTrianglePanel.blue = 0;
			}
		});
		

	}

}
