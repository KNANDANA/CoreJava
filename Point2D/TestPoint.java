package com.point;
import java.util.Scanner;
import java.math.*;
public class TestPoint 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter coordinates for point 1 :");
		int p1x =sc.nextInt();
		int p1y =sc.nextInt();
		Point2D p1 = new Point2D(p1x,p1y);
		System.out.println("p1 "+p1.getDetails());
		
		System.out.println("Enter coordinates for point 2 : ");
		int p2x =sc.nextInt();
		int p2y =sc.nextInt();
		Point2D p2 = new Point2D(p2x,p2y);
		System.out.println("p2 "+p2.getDetails());
		
		if(p1.isEqual(p2))
		{
			System.out.println("Points are equal");
		}
		System.out.println("Points are not equal");
		
		Point2D p3=p1.createNewPoint(p1x, p1y);
		
		System.out.println("Distance between p1 and p2 is "+p1.calDistance(p2));
	}

}
