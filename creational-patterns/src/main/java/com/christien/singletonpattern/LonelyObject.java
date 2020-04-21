public class LonelyObject{
	
	//create an object of LonelyObject
	private static LonelyObject instance = new LonelyObject();

	//make constructor private so that this class cannot be instantiated
	private LonelyObject(){}

	public static LonelyObject getInstance(){
		return instance;
	}

	public void showMessage(){
		System.out.println("Hello From Lonely Object");
	}

}