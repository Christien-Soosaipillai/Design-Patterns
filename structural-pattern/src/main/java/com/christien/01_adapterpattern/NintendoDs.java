public class NintendoDs implements NintendoSystem{
	
	@Override
	public void playGame(Integer startUpTime){

		System.out.println("Playing nintendo ds game, this will take " + startUpTime + " seconds to start");

	}
	
	@Override
	public void saveGame(Integer saveTime){
		
		System.out.println("Saving to nintendo ds game cartridge, this will take " + saveTime + " seconds");

	}

	@Override
	public void messageFriend(String message){

		System.out.println("message sent: " + message);

	}


}