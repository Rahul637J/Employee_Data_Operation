package com.employee.data;

import java.util.Random;

public class Demo 
{
	public static void main(String[] args) 
	{
		int wagePerHour = 20;
        int fullDay = 8;
        
        Random random=new Random();
        int attendance=random.nextInt(2);
        
        if(attendance == 1)
        {
            System.out.print("Employee is Present");
            System.out.println("");
            System.out.print("The daily wage of Employee is : " + ( wagePerHour * fullDay ));
            System.out.println("");
        }
        else
        {
            System.out.print("Employee is Absent");
            System.out.println("");
            System.out.println("The daily wage of Employee is : 0 " );
            System.out.println("");
        }
	}
}
