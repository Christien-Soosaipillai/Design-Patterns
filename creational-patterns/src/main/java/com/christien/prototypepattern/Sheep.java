class Sheep implements Animal{
	
	public Sheep(){

		System.out.println("Sheep is Made");

	}

	public Animal makeCopy(){

		System.out.println("Sheep is bieng cloned");

		Sheep sheepObject = null;
		try{

			sheepObject = (Sheep) super.clone();


		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}

		return sheepObject;
	}


	public String toString(){
		return "Sheep is here!";
	}

}