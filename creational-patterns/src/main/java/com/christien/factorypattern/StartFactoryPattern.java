public class StartFactoryPattern{

	public static void main(String[] args){
		
		CarFactory carFactory = new CarFactory();
		
		//get an object of Dodge and call its drive method
		Car car1 = carFactory.getCar("Dodge");

		//call drive method of Dodge
		car1.drive();
	}	
}
