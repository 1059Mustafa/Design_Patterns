package Strategy_Design.DriveStrategy;

public class NormalDriverStrategy implements DriveStrategy{
    @Override
    public void drive()
    {
        System.out.println("Normal drive strategy");
    }
}

