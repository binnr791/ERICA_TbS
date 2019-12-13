package com.view;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import com.MMButtonController;
import com.MainApp;

public class MainMenuScene extends SceneView
{
	// JPanel panel
	MMButtonController buttonController;
	public MainMenuScene(MainApp mainApp)
	{
		super(mainApp);
		buttonController = new MMButtonController(mainApp);
		JButton newGame = buttonController.createNGB();
		JButton loadGame = buttonController.createLGB();
		JButton exitGame = buttonController.createEGB();
		
		newGame.setLocation(100, 600);
		loadGame.setLocation(100, 700);
		exitGame.setLocation(100, 800);
		
		panel.add(newGame);
		panel.add(loadGame);
		panel.add(exitGame);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		
	}
}

