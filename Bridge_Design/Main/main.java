package Bridge_Design.Main;

import Bridge_Design.BreathImpl.*;
import Bridge_Design.LivingThings.*;

public class main {

    public static void main(String arg[])
    {
        LivingThing obj=new Dog(new LandBreath());

        obj.breathProcess();

        obj=new Fish(new WaterBreath());

        obj.breathProcess();

        obj=new Tree(new TreeBreath());

        obj.breathProcess();

    }

}
