package com.view;

import java.awt.Color;

import javax.swing.JPanel;

import com.MainApp;

public abstract class Scene {
	JPanel panel = new JPanel();
	
	public Scene()
	{
		panel.setBackground(Color.white);
		panel.setLocation(0, 0);
		panel.setSize(MainApp.SCREEN_WIDTH, MainApp.SCREEN_HIEGHT);
		panel.setVisible(true);
	}
	public JPanel getPanel()
	{
		return panel;
	}
}
