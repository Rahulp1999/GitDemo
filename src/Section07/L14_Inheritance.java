package Section07;

public class L14_Inheritance {
	public static void main(String[]args) {
		
		Car carObject = new Car();
		carObject.rev();
		System.out.println(carObject.getmake() +" "+carObject.getModel());
	}
	
}

class Vehicle{
	private String make ="BMW";
	
	public String getmake() {
		return make;
	}
	
	public void rev()
	{
		System.out.println("Vroom!");
	}
}
	
class Car extends Vehicle
{
	private String model ="3 series";
	
	public String getModel()
	{
		return model;
	}
	
}



