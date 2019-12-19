package com.model;

public abstract class Skill
{
	private String name;
	private int power;
	private int manaCnsp; // mana consumption
	private int sqnc; // sequence
	
	private abstract class AttackSkill extends Skill
	{
		public abstract class SingleTargetSkill extends AttackSkill
		{
			@Override
			public int getNeedTarget()
			{
				return SkillConstCollect.MUST_HAVE_TARGET;
			}
		}
		
		@Override
		public boolean isAttackSkill()
		{
			return true;
		}
	}
	
	public abstract boolean isAttackSkill();
	public abstract int getNeedTarget(); // notice to unit if selecting target is needed
	
	/*
	* write useSkill and getUnitClass at child skill class
	*/
	
	public abstract void useSkill(BattleField bField); // all information to use skill is in battlefield
	public abstract int getUnitClass(); // use this method if unit can learn skill
	
	public int getSqnc()
	{
		return this.sqnc;
	}
	public int getManaCnsp()
	{
		return this.manaCnsp;
	}
	public int getPower()
	{
		return this.power;
	}
	public String getName()
	{
		return this.name;
	}
}

//class AttackSkill
//{
//	
//}
//
//class SupportSkill
//{
//	
//}
