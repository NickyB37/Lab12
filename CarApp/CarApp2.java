package CarApp;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp2 extends Cars {
	public static Scanner scnr = new Scanner(System.in);
	public static ArrayList<Cars> car = new ArrayList<>();

	public static void main(String[] args) {

		Cars car1 = new Cars("Ford", "escape", 2017, 20500.50);
		Cars car2 = new Cars("Dodge", "Ram", 2020, 29500.50);
		Cars car3 = new Cars("Porche", "911", 2018, 125000.00);
		UsedCars car4 = new UsedCars("Honda", "Accord", 1987, 4500.00, 999000.00);
		UsedCars car5 = new UsedCars("Ford", "Focus", 2009, 5500.00, 153000.00);
		UsedCars car6 = new UsedCars("Dodge", "Stratus", 2010, 3500.00, 79000.00);

		car.add(car1);
		car.add(car2);
		car.add(car3);
		car.add(car4);
		car.add(car5);
		car.add(car6);
		System.out.println(car);
		System.out.println("Enter number 1-6");
		int num = scnr.nextInt();
        System.out.println(car.get(num-1));
	
       System.out.println("Do you want to buy this car");
       String y = scnr.next();
	     if(y.equalsIgnoreCase("yes")) {
	    	 car.remove(num-1);
	     System.out.println(car);
	     }
	     else {
	    	 System.out.println(car);
	     }
	
	}

}
