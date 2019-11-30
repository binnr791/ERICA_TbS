package com.view;

import javax.swing.JButton;

public abstract class MainMenuButton extends JButton
{
	public MainMenuButton(Scene scene)
	{
		addMouseListener(scene);
	}
}
