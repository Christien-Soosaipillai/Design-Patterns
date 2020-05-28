public abstract class RemoteControl{
	
	protected Device device;

	protected RemoteControl(Device device){
		this.device = device;
	}


	public void togglePower(){

		device.setPowerStatus(!device.getPowerStatus());


		if(device.getPowerStatus()){
			System.out.println("System is now on");
		}else{
			System.out.println("System is now off");
		}	
	}

	public void channelup(){
		if(device.getPowerStatus() == true){
			device.setChannel(device.getChannel()+1);
			if(device.getChannel() > 6 || device.getChannel() < 0){
				device.setChannel(0);
			}
		}
	}

	public void channeldown(){

		if(device.getPowerStatus() == true){
			device.setChannel(device.getChannel()-1);
			if(device.getChannel() > 6 || device.getChannel() < 0){
				device.setChannel(0);
			}
		}
	}

	public void volumeUp(){

		if(device.getPowerStatus() == true){	
			if(device.getVolume() == 20){
				System.out.println("Volume is at highest setting:" + device.getVolume());
			}else{
				device.setVolume(device.getVolume() + 1);
			}
		}	
	}



	public void volumeDown(){

		if(device.getPowerStatus() == true){
			if(device.getVolume() == 0){
				System.out.println("Volume is at lowest setting:" + device.getVolume());
			}else{
				device.setVolume(device.getVolume() - 1);
			}
		}	
	}
}