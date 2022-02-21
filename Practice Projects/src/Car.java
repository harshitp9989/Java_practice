import java.util.Scanner;
import java.io.*;
public class Car {
	int passengers;
	double milage;
	public int cost;
	
	public Car(int a, double b)
	{
		passengers = a;
		milage= b;
	} 
	
	
	
	
	
public static void main(String args[])
{
	Car Audi = new Car(4, 15.5);
	System.out.print("enter cost");
	Scanner scnr = new Scanner(System.in);
	Audi.cost = scnr.nextInt();
	System.out.printf("%d,%f,%d",Audi.passengers, Audi.milage, Audi.cost);
}
	
	
}
