package CarApp;

import java.util.ArrayList;
import java.util.List;

public class UsedCars extends Cars{
protected double mileage; 


public UsedCars() {
	super();
}


public UsedCars(String make, String model, int year, double price,double mileage) {
	super(make, model, year, price);
	this.mileage = mileage;
    this.make = make;
    this.model = model;
    this.year = year;
    this.price = price;
    
}




public double getMileage() {
	return mileage;
}


public void setMileage(double mileage) {
	this.mileage = mileage;
}
@Override
public String toString() {
	return super.toString() + " (Used) " + mileage + "miles";
}


	
}

   


