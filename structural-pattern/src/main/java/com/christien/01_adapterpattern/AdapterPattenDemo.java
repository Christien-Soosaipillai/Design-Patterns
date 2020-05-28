class AdapterPattenDemo{
	
	public static void main(String[] args){

		BlueJay bluejay = new BlueJay();
		WoodenCardinal woodenCardinal = new WoodenCardinal();

		//Wrap a birdadapter sp that it behaves like a toyduck
		ToyBird birdAdapter = new BirdAdapter(bluejay);

		System.out.println("BlueJay implementation of Bird interface");
		bluejay.fly();
		bluejay.makeSound();

		System.out.println("\nWoodenCardinal implementation of ToyBird interface");
		woodenCardinal.squeak();

		//Here the "ToyBird birdAdapter" calls the method "squek()" however it behaves like a "Bird" becase inside that method it calls "bird.makeSound()"
		System.out.println("\nToyBird implementation behaving like Bird interface");
		birdAdapter.squeak();
	}

}