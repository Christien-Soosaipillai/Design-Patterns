import java.util.*; 

public class MarkOneBuilder implements IronManArmorBuilder{
	
	private Armor armor;

	public MarkOneBuilder(){
		this.armor = new Armor();
	}
	
	@Override
	public void buildVersionNumber(){
		this.armor.setVersionNumber("Mark I");
	}
	
	@Override
	public void buildFlyingProtocols(){
		this.armor.setFlyingProtocols(9000);
	}
	
	@Override
	public void buildWeaponsProtocol(){
		List<String> weaponsList = new ArrayList<>();
		weaponsList.add("Missles");
		weaponsList.add("repulsors");
		weaponsList.add("gattling gun");
		this.armor.setWeaponsProtocol(weaponsList);
	}

	@Override
	public void buildAIProtocol(){
		this.armor.setAIProtocol("Jarvis");
	}

	public Armor getArmor(){
		return this.armor;
	}


}