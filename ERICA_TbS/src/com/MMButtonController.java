package com;

import java.awt.event.ActionEvent;

import com.view.MainMenuButton;

public class MMButtonController {
	//Main Menu Button Controller
	
	MainApp mainApp;
	public MMButtonController(MainApp mainApp)
	{
		this.mainApp = mainApp;
	}
	
	public NewGameButton createNGB()
	{ return new NewGameButton("NEW GAME", mainApp); }
	public LoadGameButton createLGB()
	{ return new LoadGameButton("LOAD GAME", mainApp); }
	public ExitGameButton createEGB()
	{ return new ExitGameButton("EXIT", mainApp); }
}

class NewGameButton extends MainMenuButton
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NewGameButton(String text, MainApp mainApp)
	{
		super(text, mainApp);
	}
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		mainApp.setScene(1);
	}
}

class LoadGameButton extends MainMenuButton
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LoadGameButton(String text, MainApp mainApp)
	{
		super(text, mainApp);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
//		mainApp.setScene(2);
	}
}

class ExitGameButton extends MainMenuButton
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExitGameButton(String text, MainApp mainApp)
	{
		super(text, mainApp);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		System.exit(1);
	}
}