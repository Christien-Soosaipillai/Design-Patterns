public class SingletonPatternDemo{
	public static void main(String[] args){

		//illegal construct
		//Compile Time Error: The constructor SingleObject() is not visible
		// LonelyObject object = new LonelyObject();

		LonelyObject object = LonelyObject.getInstance();
		object.showMessage();
	}
}