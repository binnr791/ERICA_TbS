package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.view.SceneView;

public abstract class SceneController implements ActionListener
{
	SceneView view;
	public SceneController(SceneView view)
	{
		
	}
	
	public void draw()
	{
//		view.draw();
	}
	
	public abstract void actionPerformed(ActionEvent e);
}
