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

		System.out.println("\nToyBird implementation behaving like Bird interface");
		birdAdapter.squeak();

	}

}