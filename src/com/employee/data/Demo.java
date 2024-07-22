package com.employee.data;

import java.util.Random;

public class Demo 
{
	public static void main(String[] args) 
	{
		Random random=new Random();
		int attendance = random.nextInt(2); // 0 or 1
		
		if(attendance==1)
		{
			System.out.println("Employee is present");
		}
		
		else
		{
			System.out.println("Employee is absent");
		}
	}
}
