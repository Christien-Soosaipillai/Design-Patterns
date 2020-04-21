public class FactoryProducer{
	public static AbstractFactory getFactory(boolean isSport){

		if(isSport){
			return new SportsVehicleFactory();
		}else{
			return new VehicleFactory();
		}
	}
}