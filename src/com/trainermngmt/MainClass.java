package com.trainermngmt;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JavaTrainer j1 = new JavaTrainer(18, "Krishna", 10);
		System.out.println(j1.getName() + " is " + j1.isEligible());
		
		DotNetTrainer d=new DotNetTrainer(1, "Vijay", 25);
		System.out.println(d.getName()+" is "+d.isEligible());
	}

}
