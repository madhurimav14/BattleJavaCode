
public class Wearvolve implements Battle{

	public String getName() {
		return "Wearvolve";
	}

	public String battle(Battle battleWith) {
		if(battleWith.getName().equals("Wearvolve")){
			return "Tied";
		}
		return battleWith.getName().equals("Dragon")?"Won":"Lost";
	}
}
