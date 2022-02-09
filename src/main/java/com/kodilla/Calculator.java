package com.kodilla;

public class Calculator
{
    public void add(int a, int b)
    {
        System.out.println(a+ " + " + b + " = " + (a+b) );
    }

   public void subtraction(int a, int b)
   {
       System.out.println(a+ " - " + b + " = " + (a-b) );
   }

    public static void main(String[] args)
    {
        Calculator calculator= new Calculator();
        calculator.add(5,2);
        calculator.subtraction(10,7);
    }

}

