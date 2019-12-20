package com;

import java.awt.Container;

import javax.swing.JPanel;

import com.view.GFrame;
import com.view.InGameScene;
import com.view.SceneView;
import com.view.MainMenuScene;

public class MainApp {
	public static int SCREEN_WIDTH = 1200;
	public static int SCREEN_HEIGHT = 960;
	
	public static final int MAINMENUSCENE = 0;
	public static final int GAMESCENE = 1;
	
	GFrame application;
	Container container;
	SceneController currentController = new MMController(this);; //manage view and model 
	SceneView currentView = currentController.getView(); //manage panel and etc
	JPanel currentPanel; //viewed on screen
	
	
	public MainApp()
	{
		application = new GFrame();
		container = application.getContentPane();
		currentPanel = currentView.getPanel();
		container.add(currentPanel);
		
	}
	
	public void setScene(SceneController newSceneCn)
	{
		currentController = newSceneCn;
		currentView = currentController.getView();
		container.removeAll();
		currentPanel = currentView.getPanel();
		container.add(currentPanel);
		application.repaint();
		application.revalidate();
	}
	
	public SceneController getScene()
	{
		return currentController;
	}
	//
}
