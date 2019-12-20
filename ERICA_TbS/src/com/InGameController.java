package com;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.Random;

import com.model.BattleField;
import com.model.BattleField.FieldUnit;
import com.model.Skill;
import com.model.Unit;
import com.view.InGameScene;

public class InGameController extends SceneController
{
	MainApp mainApp;
	BattleField bField;
	public InGameController(MainApp mainApp)
	{
		this.mainApp = mainApp;
		view = new InGameScene(this);
		bField = createBField(0);
	}
	
	public BattleField createBField(int difficulty)
	{
		//test code//
		Unit[][] units = new Unit[2][2];
		for(int i = 0; i < 2; ++i)
		{
			for(int j = 0; j < 2; ++j)
			{
				try
				{
					if(i == BattleField.INDEX_ALLY) // create ally
					{
						Random a = new Random();
						Unit u = new Unit(a.nextInt(2));
						units[i][j] = u;
					}
					else // create enemy
					{
						Random a = new Random();
						Unit u = new Unit(a.nextInt(2));
						units[i][j] = u;
					}
				}
				catch (IOException e)
				{
					Unit u = null;
					e.printStackTrace();
				}
			}
		}
		BattleField bField = new BattleField(units[0][0], units[0][1], units[1][0], units[1][1]);
		return bField;
	}
	
	public BattleField getBField()
	{
		return this.bField;
	}
	
	public DrawInfo getDrawInfo()
	{
		return new DrawInfo();
	}
	
	public class DrawInfo // give info to InGameScene
	{
		public int unitNum = 0;
		public Image[][] imgs = new Image[2][2];
		public int[][][] unitHealth = new int[2][2][2];
		public int[][][] unitMana = new int[2][2][2];
//		public Skill[][] skills = new Skill[2][3];
//		public String[][] skillInfo = new String[2][3];
				
		public DrawInfo()
		{
			FieldUnit[][] fieldUnit = bField.getFieldUnit();
			for(int i = 0; i < 2; ++i)
			{
				for(int j = 0;j < 2; ++j)
				{
					if(fieldUnit[i][j] != null)
					{
						imgs[i][j] = fieldUnit[i][j].getImage();
						if(i == BattleField.INDEX_ALLY)
						{
//							skills[i] = fieldUnit[i][j].getSkillInfo();
//							for(int s = 0; s < 3; ++s)
//								skillInfo[i][s] = skills[i][s].getName();
						}
						unitHealth[i][j][FieldUnit.INDEX_MAX] = fieldUnit[i][j].getMaxHealth();
						unitHealth[i][j][FieldUnit.INDEX_CUR] = fieldUnit[i][j].getCurHealth();
//						unitMana[i][j][FieldUnit.INDEX_MAX] = fieldUnit[i][j].getMaxMana();
//						unitMana[i][j][FieldUnit.INDEX_CUR] = fieldUnit[i][j].getCurHealth();
						++unitNum;
					}
					else
					{
						imgs[i][j] = null;
//						for(int s = 0; s < 3; ++s)
//							skillInfo[i][s] = null;
						unitHealth[i][j][FieldUnit.INDEX_MAX] = -1;
						unitHealth[i][j][FieldUnit.INDEX_CUR] = -1;
					}
				}
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		
	}

}
