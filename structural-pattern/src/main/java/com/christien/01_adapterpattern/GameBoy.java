public class GameBoy{
	
	public void playGameBoyGame(Integer startUpTime){

		System.out.println("Playing nintendo gameboy game, this will take " + (startUpTime) + " seconds to start");

	}

	public void saveGameBoyGame(Integer saveTime){

		System.out.println("Saving to nintendo ds game cartridge, this will take " + (saveTime) + " seconds");

	}

	public void chatOnGameBoy(String message){

		System.out.println("message sent via wire connection: " + message);

	}

}