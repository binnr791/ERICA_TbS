package com.model;

public class BattleField
{
	Unit ally1, ally2;
	Unit enemy1, enemy2;
	
	public BattleField(Unit ally1, Unit ally2, Unit enemy1, Unit enemy2)
	{
		ally1 = this.ally1;
		ally2 = this.ally2;
		enemy1 = this.enemy1;
		enemy2 = this.enemy2;
	}
	
	public Unit[] setOrder()
	{
		Unit[] order = new Unit[4];
		int speed1 = ally1.getSpeed();
		int speed2 = ally2.getSpeed();
		int speed3 = enemy1.getSpeed();
		int speed4 = enemy2.getSpeed();
		
//		s1 = Math.min(speed1, speed2);
//		s2 = Math.min(speed3, speed4);
		
		return order;
	}
}