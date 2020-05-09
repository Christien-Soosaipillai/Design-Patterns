public class BuilderPatternDemo{
	
	public static void main(String[] args){

		IronManArmorBuilder markOneBuilder = new MarkOneBuilder();
		ArmorDirector armorDirector = new ArmorDirector(markOneBuilder);
		armorDirector.programArmor();
		Armor armor = armorDirector.getArmor();
		armor.systemDisplays();
	}

}