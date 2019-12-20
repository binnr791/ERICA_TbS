package com.view;

import java.awt.Color;

import javax.swing.JPanel;

import com.MainApp;
import com.SceneController;

public abstract class SceneView
{
	SceneController controller;
	JPanel panel = new JPanel();
	
	public SceneView(SceneController controller)
	{
		this.controller = controller;
//		panel.setBackground(Color.white);
//		panel.setLocation(0, 0);
//		panel.setSize(MainApp.SCREEN_WIDTH, MainApp.SCREEN_HEIGHT);
//		panel.setLayout(null);
//		panel.setVisible(true);
	}
	
	public void initialize()
	{
		panel.setBackground(Color.white);
		panel.setLocation(0, 0);
		panel.setSize(MainApp.SCREEN_WIDTH, MainApp.SCREEN_HEIGHT);
		panel.setLayout(null);
		panel.setVisible(true);
	}
	
	public JPanel getPanel()
	{
		return panel;
	}
	
	public void draw()
	{
		panel.revalidate();
		panel.repaint();
	}
}
