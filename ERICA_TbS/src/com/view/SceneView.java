package com.view;

import java.awt.Color;

import javax.swing.JPanel;

import com.MainApp;

public abstract class SceneView
{
	MainApp mainApp;
	JPanel panel = new JPanel();
	
	public SceneView(MainApp mainApp)
	{
		this.mainApp = mainApp;
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
	
	public void update()
	{
		panel.revalidate();
		panel.repaint();
	}
}
