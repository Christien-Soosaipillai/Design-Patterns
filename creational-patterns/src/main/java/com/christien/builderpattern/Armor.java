import java.util.*;  

public class Armor implements IronManArmor{


	private String versionNumber;
	private Integer altitudeRange;
	private List<String> weaponsMapping;
	private String aIProtocol;

	@Override
	public void setVersionNumber(String versionNumber){
		this.versionNumber = versionNumber;
	}

	public String getVersionNumber(){
		return versionNumber;
	}
	
	@Override
	public void setFlyingProtocols(Integer altitudeRange){
		this.altitudeRange = altitudeRange;
	}

	public Integer getFlyingProtocols(){
		return altitudeRange;
	}
	
	@Override
	public void setWeaponsProtocol(List<String> weaponsMapping){
		this.weaponsMapping = weaponsMapping;
	}

	public List<String> getWeaponsProtocol(){
		return weaponsMapping;
	}
	
	@Override
	public void setAIProtocol(String aIProtocol){
		this.aIProtocol = aIProtocol;
	}

	public String getAIProtocol(){
		return aIProtocol;
	}

	public void systemDisplays(){
		System.out.println("Display System Readings");
		System.out.println("Armor " + versionNumber + " with AI protocol " + aIProtocol + "equipped");
		System.out.println("Flight altitude range set at " + altitudeRange + "ft");
		for( String item : weaponsMapping){
			System.out.println("weapon operational: " + item);
		}
	}		

}