
public class BattleField {

	public static void main(String[] args) {
		Wearvolve volve = new Wearvolve();
		Dragon dragon = new Dragon();
		Unicorn unicorn = new Unicorn();
		TRex trex = new TRex();
		System.out.println("Wearvolve fights with Dragon and it " + volve.battle(dragon));
		System.out.println("Unicorn fights with TRex and it " + unicorn.battle(trex));
	}

}
