public class ProtoTypePatternDemo{
	
	public static void main(String[] args){

		Circle circle = new Circle();
		circle.setId("1");

		Square square = new Square();
		square.setId("2");

		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");

		System.out.println("Befopre cloning....");
		System.out.println(circle.getId() + "---" + rectangle.getId() + "---" + square.getId());
	
		System.out.println("After cloning....");
		Shape circle2 = circle.clone();
		

		System.out.println("original id: " + circle.getId() + "---clone id: " + circle2.getId());

	}

}