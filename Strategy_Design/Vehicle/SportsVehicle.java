package Strategy_Design.Vehicle;

import Strategy_Design.DriveStrategy.SportDriverStrategy;

public class SportsVehicle extends Vehicle{
    public SportsVehicle()
    {
        super(new SportDriverStrategy());
    }
}
