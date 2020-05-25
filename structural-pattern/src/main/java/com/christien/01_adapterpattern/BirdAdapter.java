class BirdAdapter implements ToyBird{
	
	//you need to implement the interface that your client is expected to use
	Bird bird;

	public BirdAdapter(Bird bird){
		//get reference to the 	object we are adapting
		this.bird = bird;
	} 

	//get the implementation to behave like the class we are adpating to
	public void squeak(){
		bird.makeSound();
	}


}