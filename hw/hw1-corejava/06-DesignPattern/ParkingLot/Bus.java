public class Bus extends Vehicle {
	public Bus() {
		needSpts = 5;
		sz = VehicleSize.Large;
	}

	public boolean canFitSpt(ParkingSpot spt) {
		return spt.getSize() == VehicleSize.Large;
	}
}
