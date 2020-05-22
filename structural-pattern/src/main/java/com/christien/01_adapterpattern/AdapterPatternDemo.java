public class AdapterPatternDemo{
	
	public static void main(String[] args){

		NintendoDs nintendoDs = new	NintendoDs();

		GameBoy gameBoy = new GameBoy();

		GameBoyAdapter gameBoyAdapter = new GameBoyAdapter(gameBoy);

		System.out.println("\nThe NintendoDs early Version");

		nintendoDs.playGame(1);
		nintendoDs.saveGame(2);
		nintendoDs.messageFriend("Hello from other ds user");

		System.out.println("\nThe NintendoDs early Version");

		gameBoy.playGameBoyGame(2);
		gameBoy.saveGameBoyGame(4);
		gameBoy.chatOnGameBoy("Messaging from gameboy");

		System.out.println("\nThe NintendoDs latest Version with adapter");

		gameBoyAdapter.playGame(2);
		gameBoyAdapter.saveGame(4);
		gameBoyAdapter.messageFriend("Messaging from gameboy version through the adapter");

	}


}