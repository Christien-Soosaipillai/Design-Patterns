public abstract class Shape implements Cloneable{
	
	private String id;
	protected String type;

	abstract void draw();

	public String getType(){
		return type;
	}

	public String getId(){
		return id;
	}

	public void setId(String id){
		this.id = id;
	}

	@Override
	public Shape clone(){
		Object clone = null;

		try{
			System.out.println("Cloning Shape.....");
			clone = super.clone();

		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}

		return (Shape) clone;
	}

}