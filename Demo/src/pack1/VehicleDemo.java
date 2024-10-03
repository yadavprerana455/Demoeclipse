package pack1;


abstract class Vehicle{
	public abstract int getNoOfWheels();
}

class Bus extends Vehicle{
	public int getNoOfWheels(){
		return 6;
	}
}

class Auto extends Vehicle{
	public int getNoOfWheels(){
		return 3;
	}
}

public class VehicleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bus b = new Bus();
		System.out.println(b.getNoOfWheels());
		
		Auto a = new Auto();
		System.out.println(a.getNoOfWheels());

	}

}
