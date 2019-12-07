package com.model;

public class SkillManager
{
	private Skill[][] skillList;
	
	public SkillManager()
	{
		skillList = new Skill[9][100];
		
//		skillList[0][0] = 
	}
	
	public Skill getSkill(int id)
	{
		return skillList[id / 100][id % 100]; // first index = 유닛 클래스, second index = 해당 유닛 클래스가 배울 수 있는 스킬
	}
	public String getSkillInfo(int id)
	{
		return "need to write code";
	}
}