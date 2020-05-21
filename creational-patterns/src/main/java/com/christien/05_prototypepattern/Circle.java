public class Circle extends Shape{
	
	public Circle(){
		type= "Circle";
	}

	@Override
	public void draw(){
		System.out.println("Inside Shape of type " + type + "::draw() method");
	}

}