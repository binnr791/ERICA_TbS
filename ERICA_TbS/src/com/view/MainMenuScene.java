package com.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;

import com.MMController;

public class MainMenuScene extends SceneView
{
	// JPanel panel
//	MMController controller;
	public MainMenuScene(MMController controller)
	{
		super(controller);
		this.initialize();
		JLabel title = new JLabel("Turn Based Strategy game");
		JButton newGame = controller.createNGB();
		JButton loadGame = controller.createLGB();
		JButton exitGame = controller.createEGB();
		
		title.setFont(FontSet.getBaseBigFont());
		title.setSize(600, 50);
		title.setBackground(Color.white);
		
		title.setLocation(100, 200);
		newGame.setLocation(100, 500);
		loadGame.setLocation(100, 600);
		exitGame.setLocation(100, 700);
		
		panel.add(title);
		panel.add(newGame);
		panel.add(loadGame);
		panel.add(exitGame);
	}
}

