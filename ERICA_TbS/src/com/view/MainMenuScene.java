package com.view;

import java.awt.event.ActionEvent;


import javax.swing.JButton;
import com.MMController;
import com.MainApp;

public class MainMenuScene extends SceneView
{
	// JPanel panel
//	MMController controller;
	public MainMenuScene(MMController controller)
	{
		super(controller);
		JButton newGame = controller.createNGB();
		JButton loadGame = controller.createLGB();
		JButton exitGame = controller.createEGB();
		
		newGame.setLocation(100, 600);
		loadGame.setLocation(100, 700);
		exitGame.setLocation(100, 800);
		
		panel.add(newGame);
		panel.add(loadGame);
		panel.add(exitGame);
	}
}

