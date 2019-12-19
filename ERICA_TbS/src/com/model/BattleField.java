package com.model;

import java.awt.Image;

public class BattleField
{
	public static final int INDEX_ALLY = 0;
	public static final int INDEX_ENEMY = 1;
	
	private int unitNum;

	FieldUnit[][] fieldUnit;
	
	public BattleField(Unit allyIn1, Unit allyIn2, Unit enemyIn1, Unit enemyIn2)
	{
		FieldUnit ally1 = new FieldUnit(allyIn1, this);
		FieldUnit ally2 = new FieldUnit(allyIn2, this);
		FieldUnit enemy1 = new FieldUnit(enemyIn1, this);
		FieldUnit enemy2 = new FieldUnit(enemyIn2, this);
		fieldUnit[INDEX_ALLY][0] = ally1;
		fieldUnit[INDEX_ALLY][1] = ally2;
		fieldUnit[INDEX_ENEMY][0] = enemy1;
		fieldUnit[INDEX_ENEMY][1] = enemy2;
		
		this.unitNum = 0;
		if(ally1 != null)
		{ unitNum += 1; }
		if(ally2 != null)
		{ unitNum += 1; }
		if(enemy1 != null)
		{ unitNum += 1; }
		if(enemy2 != null)
		{ unitNum += 1; }
		
	}
	
	public FieldUnit[] setOrder()
	{
		FieldUnit[] order = new FieldUnit[unitNum];
		// initialize array
		for(int i = 0; i < unitNum; ++i)
			order[i] = fieldUnit[i / 2][i % 2];
		
		// sort unit in array by high speed
		int speedj, speedj_1;
		for(int i = 0; i < unitNum-1; ++i)
		{
			for(int j = i; j < unitNum-1; ++j)
			{
				speedj = 0;
				speedj_1 = 0;
				if(order[j] != null)
					speedj = order[j].getSpeed();
				if(order[j+1] != null)
					speedj_1 = order[j+1].getSpeed();
				if(speedj < speedj_1)
				{
					FieldUnit temp = order[j+1];
					order[j+1] = order[j];
					order[j] = temp;
				}
			}
		}
		
		return order;
	}
	
	public FieldUnit[][] getFieldUnit()
	{
		return this.fieldUnit;
	}
	
//	public int[] getDrawInfo

	public class FieldUnit
	{
		public static final int INDEX_MAX = 0;
		public static final int INDEX_CUR = 1;
		
		BattleField field;
		Unit unit;
		private double attackUp = 1;
		private double defenseUp = 1;
		private double speedUp = 1;
		Unit skillTarget = null;
		
		public FieldUnit(Unit unit, BattleField field)
		{
			this.unit = unit;
		}
		
		public void removeTarget()
		{
			this.skillTarget = null;
		}
		
		public void setTarget(Unit target)
		{
			this.skillTarget = target;
		}
		
		//////adder suber//////
		public void addAttackUp(double val) { this.attackUp += val; }
		public void addDefenseUp(double val) { this.defenseUp += val; }
		public void addSpeedUp(double val) { this.speedUp += val; }
		public void subAttackUp(double val) { this.attackUp -= val; }
		public void subDefenseUp(double val) { this.defenseUp -= val; }
		public void subSpeedUp(double val) { this.speedUp -= val; }
		//////geter//////
		public double getAttackUp() { return this.attackUp; }
		public double getDefenseUp() { return this.defenseUp; }
		public double getSpeedUp() { return this.speedUp; }
		public int getMaxHealth() { return this.unit.getMaxHealth(); }
		public int getCurHealth() { return this.unit.getCurHealth(); }
		public int getAttack() { return this.unit.getAttack(); }
		public int getDefense() { return this.unit.getDefense(); }
		public int getSpeed() { return this.unit.getSpeed(); }
		public State getState() { return this.unit.getState(); }
		public int getUnitClass() { return this.unit.getUnitClass(); }
		public Image getImage() { return this.unit.getImage(); }
		public Skill[] getSkillInfo() { return this.unit.getLearnedSkill(); }
	}
}
