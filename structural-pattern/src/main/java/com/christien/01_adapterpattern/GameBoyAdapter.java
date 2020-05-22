public class GameBoyAdapter implements NintendoSystem{
	
	GameBoy gameBoy;


	public GameBoyAdapter(GameBoy gameBoy){
		this.gameBoy = gameBoy;
	}

	@Override
	public void playGame(Integer startUpTime){
		startUpTime *= 2;
		gameBoy.playGameBoyGame(startUpTime);
	}
	
	@Override
	public void saveGame(Integer saveTime){
		saveTime *= 4;
		gameBoy.saveGameBoyGame(saveTime);
	}
	
	@Override
	public void messageFriend(String message){
		gameBoy.chatOnGameBoy(message);
	}


}