package com;

import java.awt.Container;

import javax.swing.JPanel;

import com.view.GFrame;
import com.view.GameScene;
import com.view.SceneView;
import com.view.MainMenuScene;

public class MainApp {
	public static int SCREEN_WIDTH = 1200;
	public static int SCREEN_HEIGHT = 960;
	
	public static final int MAINMENUSCENE = 0;
	public static final int GAMESCENE = 1;
	
	GFrame application;
	Container container;
	SceneView currentScene; //manage panel and etc
	JPanel currentPanel; //viewed on screen
	
	SceneView mainMenuScene = new MainMenuScene(this);
	SceneView gameScene = new GameScene(this);
	
	SceneView[] sceneSet = new SceneView[3];
	
	public MainApp()
	{
		application = new GFrame();
		currentScene = new MainMenuScene(this);
		container = application.getContentPane();
		currentPanel = currentScene.getPanel();
		container.add(currentPanel);
		
		sceneSet[0] = mainMenuScene;
		sceneSet[1] = gameScene;
	}
	
	public void setScene(SceneView newScene)
	{
		currentScene = newScene;
		currentPanel = currentScene.getPanel();
		application.revalidate();
		application.repaint();
	}
	
	public void setScene(int sceneNum)
	{
		currentScene = sceneSet[sceneNum];
		currentPanel = currentScene.getPanel();
		application.revalidate();
		application.repaint();
	}
	
	public SceneView getScene()
	{
		return currentScene;
	}
	//
}
