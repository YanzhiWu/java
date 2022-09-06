public class Motorcycle extends Vehicle {
	public Motorcycle() {
		needSpts = 1;
		sz = VehicleSize.Bike;
	}

	public boolean canFitSpt(ParkingSpot spt) {
		return spt.getSize() == VehicleSize.Bike || spt.getSize() == VehicleSize.Car
				|| spt.getSize() == VehicleSize.Large;
	}
}
