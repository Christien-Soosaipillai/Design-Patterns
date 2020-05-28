public interface Device{
	
	public boolean getPowerStatus();
	
	public void setPowerStatus(boolean powerStatus);

	public Integer getChannel();

	public void setChannel(Integer increment);

	public Integer getVolume();
	
	public void setVolume(Integer increment);

}