public class ParkingSpot {
	private int row;
	private int numOfSp;
	private VehicleSize sizeOfSp;
	private Level lv;
	private Vehicle veh;

	public ParkingSpot() {
	}

	public ParkingSpot(Level lvl, int ro, int no, VehicleSize vs) {
		numOfSp = no;
		row = ro;
		lv = lvl;
		sizeOfSp = vs;
		lv = lvl;
	}

	public int getSptNum() {
		return numOfSp;
	}

	public int getRow() {
		return row;
	}

	public VehicleSize getSize() {
		return sizeOfSp;
	}

	public boolean isAvail() {
		return (veh == null);
	}

	public boolean fitVeh(Vehicle veh) {
		return veh.canFitSpt(this) && isAvail();
	}

	public boolean park(Vehicle ve) {
		if (!fitVeh(ve)) {
			return false;
		}
		veh = ve;
		veh.parkSpts(this);
		return true;
	}

	public void rvVehicle() {
		lv.frSpt();
		veh = null;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (!isAvail()) {
			if (veh.getSize() == VehicleSize.Large) {
				sb.append('B');
			} else if (veh.getSize() == VehicleSize.Car) {
				sb.append('C');
			} else {
				sb.append('M');
			}
		} else {
			if (sizeOfSp == VehicleSize.Large) {
				sb.append('l');
			} else if (sizeOfSp == VehicleSize.Car) {
				sb.append('c');
			} else {
				sb.append('m');
			}
		}
		return sb.toString();
	}
}
