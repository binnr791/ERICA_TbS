package com.model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

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
	private Image unitImage;
	private int unitClass; // 병과, 직업
	private Skill[] learnedSkill = new Skill[3];
	
	public Unit(int id) throws IOException
	{
		switch(id)
		{
			case 0:
				this.id = id;
				this.name = "투사";
				this.maxHealth = 100;
				this.curHealth = maxHealth;
				this.attack = 40;
				this.defense = 60;
				this.speed = 30;
				this.unitClass = 0;
				this.state = null;
				this.unitImage = ImageIO.read(new File("src/resource/image/shield.png"));
				break;
			case 1:
				this.id = id;
				this.name = "검사";
				this.maxHealth = 90;
				this.curHealth = maxHealth;
				this.attack = 50;
				this.defense = 50;
				this.speed = 40;
				this.unitClass = 1;
				this.state = null;
				this.unitImage = ImageIO.read(new File("src/resource/image/sword.png"));
				break;
			default:
				this.id = id;
				this.name = "디폴트 유닛";
				this.maxHealth = 0;
				this.curHealth = maxHealth;
				this.attack = 0;
				this.defense = 0;
				this.speed = 0;
				this.unitClass = 0;
				this.state = null;
				break;
		}
	}
	
	public void turnStarted()
	{
		
	}
	public void turnEnded()
	{
		
	}
	
	public int getMaxHealth() { return this.maxHealth; }
	public int getCurHealth() { return this.curHealth; }
	public int getAttack() { return this.attack; }
	public int getDefense() { return this.defense; }
	public int getSpeed() { return this.speed; }
	public State getState() { return this.state; }
	public int getUnitClass() { return this.unitClass; }
	public Image getImage() { return this.unitImage; }
	public Skill[] getLearnedSkill() { return this.learnedSkill; }
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



//this.id = unitInfo.id;
//this.name = unitInfo.name;
//this.maxHealth = unitInfo.maxHealth;
//this.curHealth = maxHealth;
//this.attack = unitInfo.attack;
//this.defense = unitInfo.defense;
//this.speed = unitInfo.speed;
//this.unitClass = unitInfo.unitClass;
//this.state = null;