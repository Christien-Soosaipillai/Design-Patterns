public class AdvancedRemoteControl extends RemoteControl{
	
	public AdvancedRemoteControl(Device device){
		super(device);
	}

	public void muteVolume(){
		device.setVolume(0);
	}

	public void displaySettings(){

		System.out.println("The devices settings are as follows: \nPower: " + device.getPowerStatus() + "\nVolume: " + device.getVolume() + "\nChannel: " + device.getChannel());

	}

}