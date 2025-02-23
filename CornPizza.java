package com.example.myapp;

public class CornPizza implements Pizza {
	
	@Override
    public void eat()
    {
        System.out.println("Eat Corn pizza"); 
    }

    @Override
    
    public void getDetails()
    {
        System.out.println("This is Corn pizza");
    }

}
