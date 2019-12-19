package com.view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import com.InGameController;
import com.InGameController.DrawInfo;

public class InGameScene extends SceneView
{
	InGameController controller;
	public InGameScene(InGameController controller)
	{
		super(controller);
		this.controller = controller;
		this.panel = new DrawPanel();
		// TODO Auto-generated constructor stub
	}
	

	public class DrawPanel extends JPanel implements FieldLayout
	{
		// used in status bar drawing
		Color red_top = new Color(200, 20, 20);
		Color red_bottom = new Color(170, 40, 25);
		Color blue_top = new Color(20, 20, 200);
		Color blue_bottom = new Color(25, 40, 170);
		Color[] statusColor;
		
		public DrawPanel()
		{
			statusColor = new Color[4];
			statusColor[0] = red_top;
			statusColor[1] = red_bottom;
			statusColor[2] = blue_top;
			statusColor[3] = blue_bottom;
		}
	
		@Override
		protected void paintComponent(Graphics g)
		{
			/*
			 * order of status bar drawing is
			 * 1 left top 	   	 2 right top
			 * 3 left bottom	 4 right bottom
			 * 
			 * and that of each element is
			 * 1 top part of red(health) bar
			 * 2 bottom part of red bar
			 * 3 top part of blue(mana) bar
			 * 4 bottom part of blue bar
			 */
			super.paintComponent(g);
			DrawInfo drawInfo = controller.getDrawInfo();
			int drawX;
			int drawY;
			int drawWidth = 0;
			int drawHeight;
			{ // draw status bar, red(health), blue(mana) bar
				for(int p = 0; p < 4; ++p) // p = part of status bar
				{
					for(int u = 0; u < drawInfo.unitNum; ++u) // u = unit
					{
						drawX = PRESET_X;
						drawY = PRESET_Y + RECT_HEIGHT * p; // interval between bar is bar height
						if(p < 2) // draw red bar
						{
							drawWidth
							= (int) (RECT_WIDTH * ((double)drawInfo.unitHealth[u/2][u%2][0]
									/ (double)drawInfo.unitHealth[u/2][u%2][1]));
						}
						else // draw blue bar
						{
//							drawWidth
//							= (int) (RECT_WIDTH * ((double)drawInfo.unitMana[u/2][u%2][0]
//									/ (double)drawInfo.unitMana[u/2][u%2][1]));
						}
						drawHeight = RECT_HEIGHT;
						
						if(u % 2 == 1) // draw right side status bar of unit
							drawX += SPACE_BETW_UNIT_LR;
						if(u > 1) // draw down sidestatus bar of unit
							drawY += SPACE_BETW_UNIT_TB;
						if(p > 1) // put space between red bar and blue bar
							drawY += SPACE_UP_DOWN;
						
						g.setColor(statusColor[p]);
						g.fillRect(drawX, drawY, drawWidth, drawHeight);
					}
				}
			}
		}
	}
}
	
interface FieldLayout
{
	// set of constant(final) value
	public final int PRESET_X = 300;
	public final int PRESET_Y = 200;
	public final int RECT_X = 100;
	public final int RECT_Y = 100;
	public final int RECT_WIDTH = 200;
	public final int RECT_HEIGHT = 10;
	public final int SPACE_UP_DOWN = 6; // top - bottom
//	public final int INTRV_LR = 6; // left - right
	public final int SPACE_BETW_UNIT_LR = 500; // unit - unit width
	public final int SPACE_BETW_UNIT_TB = 400; // unit - unit height
}
	
	//{
	//	g.setColor(red_top);
	//	g.fillRect(RECT_X,
	//			RECT_Y,
	//			RECT_WIDTH,
	//			RECT_HEIGHT);
	//	g.fillRect(RECT_X + SPACE_BETW_UNIT_LR,
	//			RECT_Y,
	//			RECT_WIDTH,
	//			RECT_HEIGHT);
	//	g.fillRect(RECT_X,
	//			RECT_Y + SPACE_BETW_UNIT_TB,
	//			RECT_WIDTH,
	//			RECT_HEIGHT);
	//	g.fillRect(RECT_X + SPACE_BETW_UNIT_LR,
	//			RECT_Y + SPACE_BETW_UNIT_TB,
	//			RECT_WIDTH,
	//			RECT_HEIGHT);
	//	
	//	g.setColor(red_bottom);
	//	g.fillRect(RECT_X,
	//			RECT_Y + RECT_HEIGHT * 1, // maybe complier dismiss multiply one
	//			RECT_WIDTH,
	//			RECT_HEIGHT);
	//	g.fillRect(RECT_X + SPACE_BETW_UNIT_LR,
	//			RECT_Y + RECT_HEIGHT * 1,
	//			RECT_WIDTH,
	//			RECT_HEIGHT);
	//	g.fillRect(RECT_X,
	//			RECT_Y + RECT_HEIGHT * 1 + SPACE_BETW_UNIT_TB,
	//			RECT_WIDTH,
	//			RECT_HEIGHT);
	//	g.fillRect(RECT_X + SPACE_BETW_UNIT_LR,
	//			RECT_Y + RECT_HEIGHT * 1 + SPACE_BETW_UNIT_TB,
	//			RECT_WIDTH,
	//			RECT_HEIGHT);
	//	
	//	g.setColor(blue_top);
	//	g.fillRect(RECT_X,
	//			RECT_Y + RECT_HEIGHT * 2 + SPACE_UP_DOWN,
	//			RECT_WIDTH,
	//			RECT_HEIGHT);
	//	g.fillRect(RECT_X + SPACE_BETW_UNIT_LR,
	//			RECT_Y + RECT_HEIGHT * 2 + SPACE_UP_DOWN,
	//			RECT_WIDTH,
	//			RECT_HEIGHT);
	//	g.fillRect(RECT_X,
	//			RECT_Y + RECT_HEIGHT * 2 + SPACE_UP_DOWN + SPACE_BETW_UNIT_TB,
	//			RECT_WIDTH,
	//			RECT_HEIGHT);
	//	g.fillRect(RECT_X + SPACE_BETW_UNIT_LR,
	//			RECT_Y + RECT_HEIGHT * 2 + SPACE_UP_DOWN + SPACE_BETW_UNIT_TB,
	//			RECT_WIDTH,
	//			RECT_HEIGHT);
	//	
	//	g.setColor(blue_bottom);
	//	g.fillRect(RECT_X,
	//			RECT_Y + RECT_HEIGHT * 3 + SPACE_UP_DOWN,
	//			RECT_WIDTH,
	//			RECT_HEIGHT);
	//	g.fillRect(RECT_X + SPACE_BETW_UNIT_LR,
	//			RECT_Y + RECT_HEIGHT * 3 + SPACE_UP_DOWN,
	//			RECT_WIDTH,
	//			RECT_HEIGHT);
	//	g.fillRect(RECT_X,
	//			RECT_Y + RECT_HEIGHT * 3 + SPACE_UP_DOWN + SPACE_BETW_UNIT_TB,
	//			RECT_WIDTH,
	//			RECT_HEIGHT);
	//	g.fillRect(RECT_X + SPACE_BETW_UNIT_LR,
	//			RECT_Y + RECT_HEIGHT * 3 + SPACE_UP_DOWN + SPACE_BETW_UNIT_TB,
	//			RECT_WIDTH,
	//			RECT_HEIGHT);
	//}