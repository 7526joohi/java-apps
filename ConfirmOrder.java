package com.example.myapp;
import java.util.Scanner;
	public class ConfirmOrder {
	    public static void confirm()
	    {    Scanner sc = new Scanner (System.in);
	        System.out.println("press 1 for confirm");
	        System.out.println("Press 2 for cancel");
	        System.out.println("Press 3 for change oreder");
	        int press=sc.nextInt();
	        if (press==1)
	        {
	          OrderApp o1= new OrderApp();
	          o1.selectBeverage();
	          o1.selectPizza(); 
	        }

	        else if (press==2)
	        {
	           System.out.println("you are out from order app ");

	        }
	        else if (press==3)
	        {
	          OrderApp o=new OrderApp();
	          o.selectDominos();

	        }
	        else 
	          System.out.println("please choose valid option!!");
	          confirm();
	        }
	}

