package com.example.myapp;

public class Burger implements Beverage{

	@Override
	   public void getDetails()
	   {
	    System.out.println("This is Burger");
	   }
	   @Override
	   public void take()
	   {
	    System.out.println("Eat the burger");
	   }
}
