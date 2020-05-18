public class VehicleFactory extends AbstractFactory{
	
	@Override
	public Vehicle getVehicle(String vehicleType){

		if(vehicleType.equalsIgnoreCase("CAR")){
			return new Car();
		}else if(vehicleType.equalsIgnoreCase("SUV")){
			return new SUV();
		}
		return null;
	}
}