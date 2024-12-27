package Strategy_Design.Vehicle;

import Strategy_Design.DriveStrategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;
    //this is know as constructor injection
    public Vehicle(DriveStrategy driveStrategy)
    {
        this.driveStrategy=driveStrategy;
    }

    public void drive()
    {
        driveStrategy.drive();
    }
}
