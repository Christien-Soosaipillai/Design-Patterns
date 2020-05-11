public class PrototypePatternDemo{
	
	public static void main(String[] args){

		CloneFactory cloneFactory = new CloneFactory();

		Sheep sheep = new Sheep();

		Sheep clonedSheep = (Sheep)cloneFactory.getClone(sheep);

		System.out.println(sheep);
		
		System.out.println(clonedSheep);
		
		System.out.println("Original Sheep: " + System.identityHashCode(sheep) + "\n Cloned Sheep: " + System.identityHashCode(clonedSheep));

	}

}