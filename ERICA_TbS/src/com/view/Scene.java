package com.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import com.MainApp;

public abstract class Scene implements ActionListener{
	MainApp mainApp;
	JPanel panel = new JPanel();
	
	public Scene(MainApp mainApp)
	{
		this.mainApp = mainApp;
		panel.setBackground(Color.white);
		panel.setLocation(0, 0);
		panel.setSize(MainApp.SCREEN_WIDTH, MainApp.SCREEN_HIEGHT);
		panel.setLayout(null);
		panel.setVisible(true);
	}
	public JPanel getPanel()
	{
		return panel;
	}
	
	public void update()
	{
		panel.revalidate();
		panel.repaint();
	}
	
	public abstract void actionPerformed(ActionEvent e);
}
