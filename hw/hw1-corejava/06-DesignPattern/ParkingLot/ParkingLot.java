public class ParkingLot {
	private Level[] lvls;
	private final int NUM_OF_LEVELS = 5;

	public ParkingLot() {
		lvls = new Level[NUM_OF_LEVELS];
		for (int count = 0; count < NUM_OF_LEVELS; count++) {
			lvls[count] = new Level(count, 30);
		}
	}

	public boolean parkVeh(Vehicle veh) {
		for (int count = 0; count < lvls.length; count++) {
			if (lvls[count].parkVeh(veh)) {
				return true;
			}
		}
		return false;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int count = 0; count < NUM_OF_LEVELS; count++) {
			sb.append("Level " + count + ": " + lvls[count] + "\n");
		}
		return sb.toString();
	}
}
