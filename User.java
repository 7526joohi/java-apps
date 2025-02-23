package com.example.myapp;
import java.util.Scanner;
	public class User {
	    public static void main(String[] args) {
	        char c;
	        Scanner sc = new Scanner(System.in);
	        do {
	        OrderApp oa=new OrderApp();
	        oa.selectDominos();
	        System.out.println("Press y/Y for more order and for termination this press any key !!");
	        c=sc.next().charAt(0);
	        }while(c=='y' || c=='Y');
	        Feedback.f();
	         
	        System.out.println("Thank you !! Order ends ");
	    }
	    
	}

