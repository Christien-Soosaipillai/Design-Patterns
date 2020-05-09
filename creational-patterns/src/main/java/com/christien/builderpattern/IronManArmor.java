import java.util.*; 

public interface IronManArmor{
	
	public void setVersionNumber(String versionNumber);

	public void setFlyingProtocols(Integer altitudeRange);

	public void setWeaponsProtocol(List<String> weaponsMapping);

	public void setAIProtocol(String aIProtocol);
	
}