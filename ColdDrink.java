package com.example.myapp;

public class ColdDrink implements Beverage {
	
	@Override
	   public void getDetails()
	   {
	    System.out.println("This is Cold Drink");
	   }
	   @Override
	   public void take()
	   {
	    System.out.println("Drink the Cold Drink");
	   }

}
