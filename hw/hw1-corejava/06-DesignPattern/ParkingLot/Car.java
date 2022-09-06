public class Car extends Vehicle {
	public Car() {
		needSpts = 1;
		sz = VehicleSize.Car;
	}

	public boolean canFitSpt(ParkingSpot spt) {
		return spt.getSize() == VehicleSize.Large || spt.getSize() == VehicleSize.Car;
	}
}
