package com.example.myapp;

public class Brownie implements Beverage {
	
	@Override
	   public void getDetails()
	   {
	    System.out.println("This is Browni");
	   }
	   @Override
	   public void take()
	   {
	    System.out.println("Eat the Browni");
	   }

}
