abstract class Vehicle {
	int wheels;
	public int maxspeed;
	abstract void transmission();
	abstract void mileage();
	void logname() {
		System.out.println(this.getClass().getSimpleName()+": Vehicle details ...");
	}
}

class Car extends Vehicle {
	void mileage() {
		System.out.println("15-20 mpg");
	}
	void transmission() {
		System.out.println("automatic");
	}
}

class Truck extends Vehicle {
		
	void mileage() {
		System.out.println("20-25 mpg");
	}
	void transmission() {
		System.out.println("manual");
	}
}

public class TestAbstract {

public static void main(String[] s) {
	Car c = new Car();
	Truck t = new Truck();	
	c.logname();
	c.mileage();
	c.transmission();
	t.logname();
	t.mileage();
	t.transmission();
}
}
