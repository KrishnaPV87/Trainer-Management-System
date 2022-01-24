package com.trainermngmt;

public class DotNetTrainer implements Trainer {

	private int id;
	private String Name;
	private int experience;
	
	String isEligible;

	public DotNetTrainer(int id, String name, int experience) {
		super();
		this.id = id;
		Name = name;
		this.experience = experience;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public String isEligible() {
		// TODO Auto-generated method stub
		
		if(experience>eligibleExperience) {
			isEligible="Eligible";
		}
		else {
			isEligible="Not Eligible";
		}
		return isEligible;

	}

}
