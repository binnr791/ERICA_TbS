package com;

import java.awt.event.ActionEvent;

import com.view.InGameScene;
import com.view.MainMenuScene;

public class InGameController extends SceneController
{
	MainApp mainApp;
	public InGameController(MainApp mainApp)
	{
		this.mainApp = mainApp;
		view = new InGameScene(this);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		
	}

}
