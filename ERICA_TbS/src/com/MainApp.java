package com;

import java.awt.Container;

import com.view.GFrame;
import com.view.GameScene;
import com.view.Scene;
import com.view.MainMenuScene;

public class MainApp {
	public static int SCREEN_WIDTH = 1200;
	public static int SCREEN_HIEGHT = 960;
	
	public static final int MAINMENUSCENE = 0;
	public static final int GAMESCENE = 1;
	
	static GFrame application;
	static Container container;
	static Scene currentScene;
	
	static Scene mainMenuScene = new MainMenuScene();
	static Scene gameScene = new GameScene();
	
	static Scene[] sceneSet = new Scene[3];
	public static void main(String[] args)
	{
		application = new GFrame();
		currentScene = new MainMenuScene();
		container = application.getContentPane();
	}
	
	public void setScene(Scene newScene)
	{
		currentScene = newScene;
		application.revalidate();
		application.repaint();
	}
	
	public void setScene(int sceneNum)
	{
		currentScene = sceneSet[sceneNum];
		application.revalidate();
		application.repaint();
	}
	
	public Scene getScene()
	{
		return currentScene;
	}
	//
}
