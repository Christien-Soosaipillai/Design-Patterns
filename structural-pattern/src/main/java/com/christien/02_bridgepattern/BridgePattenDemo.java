public class BridgePattenDemo{
	
	public static void main(String[] args){

		System.out.println("Starting bridge pattern demo");

		AdvancedRemoteControl tvRemoteControl = new AdvancedRemoteControl(new Tv());
		tvRemoteControl.displaySettings();
		tvRemoteControl.togglePower();
		tvRemoteControl.displaySettings();


	}


}