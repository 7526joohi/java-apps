package com.example.myapp;

public class Cake implements Beverage {
	
	@Override
	   public void getDetails()
	   {
	    System.out.println("This is choco lava cake");
	   }
	   @Override
	   public void take()
	   {
	    System.out.println("Eat the cake");
	   }

}
