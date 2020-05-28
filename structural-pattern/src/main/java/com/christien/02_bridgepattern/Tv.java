public class Tv implements Device{
	
	private boolean powerStatus;

	private int channel;

	private int volume;

	public Tv(){
		this.powerStatus = false;
		this.channel = 0;
		this.volume = 0;
	}


	public boolean getPowerStatus(){
		return powerStatus;
	}
	
	public void setPowerStatus(boolean powerStatus){
		this.powerStatus = powerStatus;
	}

	public Integer getChannel(){
		return this.channel;
	}

	public void setChannel(Integer increment){
		this.channel = increment;
	}

	public Integer getVolume(){
		return this.volume;
	}
	
	public void setVolume(Integer increment){
		this.volume = increment;
	}

}