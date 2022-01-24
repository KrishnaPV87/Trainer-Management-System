package com.trainermngmt;

public class JavaTrainer implements Trainer {

	private int id;
	private String name;
	private int experience;
	private String isVerifiedProfile;

	String eligibility;

	public JavaTrainer(int id, String name, int experience) {
		super();
		this.id = id;
		this.name = name;
		this.experience = experience;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getEligibility() {
		return eligibility;
	}

	public void setEligibility(String eligibility) {
		this.eligibility = eligibility;
	}

	public String isEligible() {
		if (experience > eligibleExperience) {
			eligibility = "Eligible";
		} else {
			eligibility = "Not Eligible";
		}

		return eligibility;
	}

	//new comment is added to the source file
}
