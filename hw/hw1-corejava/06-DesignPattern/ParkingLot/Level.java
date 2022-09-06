public class Level {
	private ParkingSpot[] spts;
	private int avaSpots = 0;
	private static final int SPOTS_PER_ROW = 10;

	public Level() {
	}

	public Level(int flr, int numSpts) {
		int smSpts = 0;
		int medSpts = 0;
		int lgSpts = 0;
		int spots = 0;
		int row = 0;
		avaSpots = numSpts;
		spts = new ParkingSpot[numSpts];
		smSpts = numSpts / 4;
		lgSpts = numSpts / 4;
		medSpts = numSpts - smSpts - lgSpts;
		spots = medSpts + lgSpts;
		for (int count = 0; count < numSpts; count++) {
			VehicleSize sz = VehicleSize.Bike;
			if (count < lgSpts) {
				sz = VehicleSize.Large;
			} else if (count < spots) {
				sz = VehicleSize.Car;
			}
			row = count / SPOTS_PER_ROW;
			spts[count] = new ParkingSpot(this, row, count, sz);
		}
	}

	public int availSpts() {
		return avaSpots;
	}

	public boolean parkVeh(Vehicle veh) {
		int sptNum = fiAvaSpts(veh);
		if (availSpts() < veh.getSptsNeeded()) {
			return false;
		}
		if (sptNum < 0) {
			return false;
		}
		return parkSAtSpot(sptNum, veh);
	}

	private boolean parkSAtSpot(int numb, Vehicle veh) {
		boolean succ = true;
		for (int count = numb; count < (Vehicle.needSpts + numb); count++) {
			succ = succ & spts[count].park(veh);
		}
		avaSpots = avaSpots - Vehicle.needSpts;
		return succ;
	}

	private int fiAvaSpts(Vehicle veh) {
		int sptNeeded = veh.getSptsNeeded();
		int lastR = -1;
		int sptsFd = 0;
		int sptMOne = 0;
		for (int count = 0; count < spts.length; count++) {
			ParkingSpot spt = spts[count];
			if (lastR != spt.getRow()) {
				sptsFd = 0;
				lastR = spt.getRow();
			}
			if (spt.fitVeh(veh)) {
				sptsFd++;
			} else {
				sptsFd = 0;
			}
			sptMOne = sptNeeded - 1;
			if (sptsFd == sptNeeded) {
				return (count - sptMOne);
			}
		}

		return -1;
	}

	public void frSpt() {
		avaSpots++;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int count = 0; count < spts.length; count++) {
			if (count == 10 || count == 20) {
				sb.append(" ");
			}
			sb.append(spts[count]);
		}
		return sb.toString();
	}
}
