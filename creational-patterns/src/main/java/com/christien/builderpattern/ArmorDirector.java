public class ArmorDirector {
	
	private IronManArmorBuilder ironManArmorBuilder;

	public ArmorDirector(IronManArmorBuilder ironManArmorBuilder){
		this.ironManArmorBuilder = ironManArmorBuilder;
	}

	public Armor getArmor(){
		return this.ironManArmorBuilder.getArmor();
	}

	public void programArmor(){

		this.ironManArmorBuilder.buildVersionNumber();
		this.ironManArmorBuilder.buildFlyingProtocols();
		this.ironManArmorBuilder.buildWeaponsProtocol();
		this.ironManArmorBuilder.buildAIProtocol();
	}

}