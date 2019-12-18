package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.view.SceneView;

public abstract class SceneController implements ActionListener
{
	SceneView view;
	public SceneController()
	{
		
	}
	
	public void update()
	{
//		model.update();
//		view.draw();
	}
	
	public SceneView getView()
	{
		return view;
	}
	
	public abstract void actionPerformed(ActionEvent e);
}
