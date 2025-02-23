package com.example.myapp;

public class ClassicPizza implements Pizza {
	
	 @Override
	    public void eat()
	    {
	        System.out.println("Eat Classic pizza"); 
	    }
	     @Override
	    public void getDetails()
	    {
	        System.out.println("This is classic pizza");
	    }
}
