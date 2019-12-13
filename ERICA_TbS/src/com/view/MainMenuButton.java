package com.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.MainApp;

abstract public class MainMenuButton extends JButton implements ActionListener
{
		/**
	 * 
	 */
	private static final long serialVersionUID = -6956916840138883768L;

	protected MainApp mainApp;
	//visual layout for button in main menu
	public MainMenuButton(String text, MainApp mainApp)
	{
		super(text);
		this.mainApp = mainApp;
		
		setSize(225, 60);
		setBorderPainted(false);
		setFocusPainted(false);
		setForeground(Color.white);
		setBackground(ColorSet.darkblue);
		setFont(FontSet.getBaseRegularFont());
		addActionListener(this);
		setVisible(true);
	}

	@Override
	public abstract void actionPerformed(ActionEvent e);
}
