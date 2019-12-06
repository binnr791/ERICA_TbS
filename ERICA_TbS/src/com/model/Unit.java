package com.model;

public class Unit
{	
	private int id;
	private String name;
	private int maxHealth;
	private int curHealth;
	private int attack;
	private int defense;
	private int speed;
	private State state;
	private int unitClass; // 병과, 직업
	
	public Unit(int id)
	{
//		this.id = unitInfo.id;
//		this.id = unitInfo.naem;
//		this.maxHealth = unitInfo.maxHealth;
//		this.curHealth = maxHealth;
//		this.attack = unitInfo.attack;
//		this.defense = unitInfo.defense;
//		this.speed = unitInfo.speed;
//		this.unitClass = unitInfo.unitClass;
	}
	
	public void turnStarted()
	{
		
	}
	public void turnEnded()
	{
		
	}
	
	public int getMaxHealth() { return this.maxHealth; }
	public int getCurHealth() { return this.curHealth; }
	public double getAttack() { return this.attack; }
	public double getDefense() { return this.defense; }
	public int getSpeed() { return this.speed; }
	public State getState() { return this.state; }
	public int getUnitClass() { return this.unitClass; }
}

class State
{
	// builder pattern
	public int remainedTurn; // 상태이상이 남은 턴 수
	public int sort;
	
	public static class Builder
	{
		private int remainedTurn = -1;
		private int sort = -1;
		
		public Builder remainedTurn(int val)
		{
			this.remainedTurn = val;
			return this;
		}
		public Builder sort(int val)
		{
			this.sort = val;
			return this;
		}
		public State build()
		{
			return new State(this);
		}
	}
	
	private State(Builder builder)
	{
		remainedTurn = builder.remainedTurn;
		sort = builder.sort;
	}
	
	public void turnStarted()
	{
		if(remainedTurn > 0)
			remainedTurn -= 1;
		if(remainedTurn == 0)
			sort = 0;
	}
	
	public void turnEnded()
	{
		
	}
	
	public void moved() // call if move on the map
	{
		this.turnStarted();
		this.turnStarted();
	}
}
