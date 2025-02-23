package com.example.myapp;

public class Margherita implements Pizza {
	
	@Override
    public void eat()
    {
        System.out.println("Eat margerita pizza"); 
    }

    @Override
    public void getDetails()
    {
        System.out.println("This is margerita pizza");
    }
}
