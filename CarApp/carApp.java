package CarApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class carApp {
	public static Scanner scnr = new Scanner(System.in);
	public static List<Cars> C = new ArrayList<>();

	public static void main(String[] args) {
        addCar();
		
		System.out.println("Cars you added");
		listCars();
    
	
	}

	public static void addCar() {
		System.out.println("How many cars do you want to add?");
	    int	num = scnr.nextInt();
		
		for(int i = 0;i < num;i++) { 
			Cars car = new Cars();
		System.out.println("Make: ");
		car.setMake(scnr.next());
		
		System.out.println("Year:");
		car.setYear(scnr.nextInt());
		
		System.out.println("Model: ");
		car.setModel(scnr.next());
		
		System.out.println("Price: ");
		car.setPrice(scnr.nextDouble());
		scnr.nextLine();
	    C.add(car);
		}
	}
	public static void listCars() {
     for(int i = 0;i < C.size();i++) {
      System.out.println("Car " +(i + 1)+":" + C.get(i));	 
     }
	}
}
