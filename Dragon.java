
public class Dragon implements Battle{

	public String getName() {
		return "Dragon";
	}

	public String battle(Battle battleWith) {
		if(battleWith.getName().equals("Dragon")){
			return "Tied";
		}
		return battleWith.getName().equals("Wearvolve")?"Lost":"Won";
	}

}
