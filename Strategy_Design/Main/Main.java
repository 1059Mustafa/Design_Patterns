package Strategy_Design.Main;

import Strategy_Design.Vehicle.GoodsVehicle;
import Strategy_Design.Vehicle.Vehicle;

public class Main {
    public static void main(String[] args)
    {
        Vehicle vehicle=new GoodsVehicle();
        vehicle.drive();
    }
}
