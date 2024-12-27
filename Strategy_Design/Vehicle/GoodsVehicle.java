package Strategy_Design.Vehicle;

import Strategy_Design.DriveStrategy.NormalDriverStrategy;

public class GoodsVehicle extends Vehicle{
    public GoodsVehicle()
    {
        super(new NormalDriverStrategy());
    }
}
