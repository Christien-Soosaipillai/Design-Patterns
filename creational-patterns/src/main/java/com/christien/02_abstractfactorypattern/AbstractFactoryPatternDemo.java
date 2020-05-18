public class AbstractFactoryPatternDemo{
	public static void main(String[] args){

		//Produces an AbstractFactory with the implementation logic for SportsVehicles
		AbstractFactory sportsVehicleFactory = new FactoryProducer().getFactory(true);


		//Produces an AbstractFactory with the implementation logic for Regular Vehicles
		AbstractFactory vehicleFactory = new FactoryProducer().getFactory(false);

		//get SportCar() object and call drive method
		Vehicle sportCar = sportsVehicleFactory.getVehicle("SPORTSCAR");
		sportCar.drive();

		//get SportCar() object and call drive method
		Vehicle sportSUV = sportsVehicleFactory.getVehicle("SPORTSUV");
		sportSUV.drive();

		//get SportCar() object and call drive method
		Vehicle car = vehicleFactory.getVehicle("CAR");
		car.drive();

		//get SportCar() object and call drive method
		Vehicle suv = vehicleFactory.getVehicle("SUV");
		suv.drive();


	}

}