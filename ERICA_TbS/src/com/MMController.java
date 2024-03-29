package com;

import java.awt.event.ActionEvent;

import com.view.MainMenuButton;
import com.view.MainMenuScene;

public class MMController extends SceneController
{
	//Main MenuController
	
	MainApp mainApp;
	public MMController(MainApp mainApp)
	{
		this.mainApp = mainApp;
		view = new MainMenuScene(this);
	}
	
	public NewGameButton createNGB()
	{ return new NewGameButton("NEW GAME", mainApp); }
	public LoadGameButton createLGB()
	{ return new LoadGameButton("LOAD GAME", mainApp); }
	public ExitGameButton createEGB()
	{ return new ExitGameButton("EXIT", mainApp); }

	@Override
	public void actionPerformed(ActionEvent e)
	{
		
	}
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
		mainApp.setScene(new InGameController(mainApp));
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