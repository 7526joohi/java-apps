package com.example.myapp;
import java.util.Scanner;

	public class Feedback {
	    public  static void f()
	    { int n; 
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter your feed back between 1 for  one * and 10 for ten *");
	        n=sc.nextInt();
	        if (n>10 || n<1)
	        {
	            System.out.println("enter valid Feedback!!");
	            f();
	        }
	        else
	        {
	        for(int i=1; i<=n; i++)
	        {
	            System.out.print("* ");
	            
	        }
	    }
	        System.out.println();
	    }
	    
	}

