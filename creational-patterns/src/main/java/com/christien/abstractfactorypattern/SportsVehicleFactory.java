public class SportsVehicleFactory extends AbstractFactory{
	
	@Override
	public Vehicle getVehicle(String vehicleType){
		if(vehicleType.equalsIgnoreCase("SPORTSCAR")){
			return new SportsCar();
		}else if(vehicleType.equalsIgnoreCase("SPORTSUV")){
			return new SportSUV();
		}
		return null;
	}
}