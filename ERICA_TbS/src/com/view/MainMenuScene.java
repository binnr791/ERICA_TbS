package com.view;

import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class MainMenuScene extends Scene
{
	//
	
	
	@Override
	public void mousePressed(MouseEvent arg0) {
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		
	}
	
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
	}
}

abstract class MainMenuButton extends JButton
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6956916840138883768L;

	//
	public MainMenuButton(String text, Scene scene)
	{
		super(text);
		setSize(100, 40);
		addMouseListener(scene);
		setVisible(true);
	}
}

