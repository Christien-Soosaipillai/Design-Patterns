public class CarFactory{
	
	//use getCar method to get the object of the type Car
	public Car getCar(String carType){

		if(carType == null){
			return null;
		}

		if(carType.equalsIgnoreCase("DODGE")){
			return new Dodge();
		}

		return null;
	}
}