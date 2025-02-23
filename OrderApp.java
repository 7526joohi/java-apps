package com.example.myapp;
import java.util.Scanner;
public class OrderApp {
 OrderApp()
        {
         System.out.println("==============Go indise the Display for start order=============== ");
        }
         Scanner sc=new Scanner(System.in);
         int quantity; double amount;

    public void selectDominos()
    {   
        System.out.println("-------Choose 1 for Pizza--------");
        System.out.println("------Choose 2 for Beverage------");
        int choice=sc.nextInt();

        if(choice==1)
            {
              System.out.println("You have choosen Pizza");
              Pizza p=selectPizza();
              p.getDetails();
              p.eat();
            }
        
        else if(choice==2)
            {
              System.out.println("You have choosen Beverage");
              Beverage b=selectBeverage();
              b.getDetails();
              b.take();
           }
        else 
           {
           System.out.println("Invalid option!! please select Valid option");
            selectDominos();
           } 
        }
       public Pizza selectPizza()
    {    double p1=350; double pcorn=400; double clprice=200.00;
        System.out.println("======Press 1 for Margherita=====");
        System.out.println("========Press 2 for CornPizza========");
        System.out.println("=====Press 3 for Classic Pizza===");
        
        int c=sc.nextInt();
        switch (c)
            {
        case 1:
                  System.out.println("You added Margerita pizza");
                  System.out.println("Price is 350");
                  
                  System.out.println("Add quantity! how much you want?");
                  
                  quantity=sc.nextInt();
                  System.out.println("Total amount you need to pay: "+(quantity*p1));
                
                  amount=sc.nextDouble();
                if (amount==quantity*p1){
                    System.out.println("Transaction is Successful");
                    System.out.println("get your order");
                    return new Margherita();
                    }
                else if (amount<quantity*p1)
                    {
                        System.out.println("insufficent amout kindly pay remaining amount: "+((quantity*p1)-amount));
                        sc.nextDouble();
                        System.out.println("get your margerita Pizza");
                        return new Margherita();

                    }
                else if (amount>quantity*p1)
                    System.out.println("Please collect your remaining amount and take your order: "+(amount-(quantity*p1)));
                    
            return new Margherita();
                


        case 2:
                  System.out.println("You added Corn pizza");
                  System.out.println("Price is 400");
                  System.out.println("Add quantity! how much you want?");
                  quantity=sc.nextInt();
                  System.out.println("Total amount you need to pay: "+(quantity*pcorn));
                  amount=sc.nextDouble();
                if (amount==quantity*pcorn){
                    System.out.println("Transaction is Successful");
                    System.out.println("get your order");
                    return new CornPizza();
                    }
                else if (amount<quantity*pcorn)
                    {
                        System.out.println("insufficent amout kindly pay remaining amount: "+((quantity*pcorn)-amount));
                        sc.nextDouble();
                        return new CornPizza();

                    }
                else if (amount>quantity*pcorn)
                    System.out.println("Please collect your remaining amount and take your order: "+(amount-(quantity*pcorn)));
                                                                      
           return new CornPizza();

      case 3:
               System.out.println("You added Classic pizza");
               System.out.println("Price is 200.00");
               System.out.println("Add quantity! how much you want?");
               quantity=sc.nextInt();
               System.out.println("Total amount you need to pay: "+(quantity*clprice));

               amount=sc.nextDouble();
                if (amount==quantity*clprice){
                    System.out.println("Transaction is Successful");
                    System.out.println("get your order");
                    return new ClassicPizza();
                    }
                else if (amount<quantity*clprice)
                    {
                        System.out.println("insufficent amout kindly pay remaining amount: "+((quantity*clprice)-amount));
                        sc.nextDouble();
                        return new ClassicPizza();

                    }
                else if (amount>quantity*clprice)
                    System.out.println("Please collect your remaining amount and take your order: "+(amount-(quantity*clprice)));
                                                        
             return new ClassicPizza();
         
        default:
              System.out.println("Invalid option choosen !!");
               
            return  selectPizza();
            }
    }

    public Beverage selectBeverage()
    {   double p1=99.11; double p2=25.00; double p4=99.99; double p5=150.00;
        System.out.println("======Press 1 for BURGER=====");
        System.out.println("========Press 2 for COLD DRINK========");
        System.out.println("======Press 3 for BROWNI=======");
        System.out.println("======Press 4 for CAKE======");
        int c1=sc.nextInt();
        switch (c1)
            {
        case 1:
                  System.out.println("You added BURGER");
                  System.out.println("Price is "+p1);
                  System.out.println("Add quantity! how much you want?");
                  quantity=sc.nextInt();
                  System.out.println("Total amount you need to pay: "+(quantity*p1));

                  amount=sc.nextDouble();
               if (amount==quantity*p1){
                   System.out.println("Transaction is Successful");
                   System.out.println("get your order");
                   return new Burger();
                   }
               else if (amount<quantity*p1)
                   {
                       System.out.println("insufficent amout kindly pay remaining amount: "+((quantity*p1)-amount));
                       sc.nextDouble();
                       return new Burger();

                   }
            else if (amount>quantity*p1)
                System.out.println("Please collect your remaining amount and take your order: "+(amount-(quantity*p1)));
                                                               
            return new Burger();
            
        case 2:
                  System.out.println("You added COLD DRINK");
                  System.out.println("Price is: "+p2);
                  System.out.println("Add quantity! how much you want?");
                  quantity=sc.nextInt();
                  System.out.println("Total amount you need to pay: "+(quantity*p2));

                  amount=sc.nextDouble();
               if (amount==quantity*p2){
                   System.out.println("Transaction is Successful");
                   System.out.println("get your order");
                   return new ColdDrink();
                   }
               else if (amount<quantity*p2)
                   {
                       System.out.println("insufficent amout kindly pay remaining amount: "+((quantity*p2)-amount));
                       sc.nextDouble();
                       return new ColdDrink();

                   }
               else if (amount>quantity*p2)
                   System.out.println("Please collect your remaining amount and take your order: "+(amount-(quantity*p2)));
                                                                      
           return new ColdDrink();

      case 3:
               System.out.println("You added BROWNI");
               System.out.println("Price is: "+p4);
               System.out.println("Add quantity! how much you want?");
               quantity=sc.nextInt();
               System.out.println("Total amount you need to pay: "+(quantity*p4));

               amount=sc.nextDouble();
               if (amount==quantity*p4){
                   System.out.println("Transaction is Successful");
                   System.out.println("get your order");
                   return new Brownie();
                   }
               else if (amount<quantity*p4)
                   {
                       System.out.println("insufficent amout kindly pay remaining amount: "+((quantity*p4)-amount));
                       sc.nextDouble();
                       return new Brownie();

                   }
               else if (amount>quantity*p4)
                   System.out.println("Please collect your remaining amount and take your order: "+(amount-(quantity*p4)));
                                                        
             return new Brownie();
         
        case 4:
               System.out.println("You added CAKE");
               System.out.println("Price is: "+p5);
               System.out.println("Add quantity! how much you want?");
               quantity=sc.nextInt();
               System.out.println("Total amount you need to pay: "+(quantity*p5));

               amount=sc.nextDouble();
               if (amount==quantity*p5){
                   System.out.println("Transaction is Successful");
                   System.out.println("get your order");
                   return new Cake();
                   }
               else if (amount<quantity*p5)
                   {
                       System.out.println("insufficent amout kindly pay remaining amount: "+((quantity*p5)-amount));
                       sc.nextDouble();
                       return new Cake();

                   }
               else if (amount>quantity*p5)
                   System.out.println("Please collect your remaining amount and take your order: "+(amount-(quantity*p5)));
                                                               
             return new Cake();

        default:
             System.out.println("Invalid option choosen !!");
               
            return  selectBeverage();
            }
    
  }
      
}
