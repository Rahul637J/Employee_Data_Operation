package com.employee.data;

import java.util.Random;

public class Demo 
{
	public static void main(String[] args) 
	{
		int wagePerHour = 20;
        int fullDay = 8;
        int halfDay = 4;
        int totalNoOfDays = 20;
        
        Random random=new Random();
        int attendance=random.nextInt(3);
        
        switch ( attendance ) {
        case 1:
            System.out.print("Employee is Present");
            System.out.println("");
            System.out.print("The daily wage of Employee is : " + ( wagePerHour * fullDay * totalNoOfDays ));
            System.out.println("");
            break;

        case 2:
            System.out.print("Employee is Present but working part time ");
            System.out.println("");
            System.out.print("The daily wage of Employee is : " + ( wagePerHour * halfDay * totalNoOfDays ));
            System.out.println("");
            break;

        case 0:
            System.out.print("Employee is Absent");
            System.out.println("");
            System.out.println("The daily wage of Employee is : 0 ");
            System.out.println("");
            break;

	}
}
