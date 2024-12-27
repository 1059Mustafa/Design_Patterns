package Strategy_Design.Vehicle;

import Strategy_Design.DriveStrategy.SportDriverStrategy;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle()
    {
        super(new SportDriverStrategy());
    }
}
