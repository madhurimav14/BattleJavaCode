
public class TRex implements Battle{

	public String getName() {
		return "TRex";
	}

	public String battle(Battle battleWith) {
		if(battleWith.getName().equals("TRex")){
			return "Tied";
		}
		return battleWith.getName().equals("Wearvolve")?"Won":"Lost";
	}

}
