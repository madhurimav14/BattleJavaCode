
public class Unicorn implements Battle{

	public String getName() {
		return "Unicorn";
	}

	public String battle(Battle battleWith) {
		if(battleWith.getName().equals("Unicorn")){
			return "Tied";
		}
		return (battleWith.getName().equals("Wearvolve") || battleWith.getName().equals("TRex"))?"Won":"lost";
	}

}
