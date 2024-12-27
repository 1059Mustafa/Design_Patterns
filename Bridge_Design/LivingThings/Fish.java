package Bridge_Design.LivingThings;

import Bridge_Design.BreathImpl.BreathImplemantor;
//import Bridge_Design.BreathImpl.WaterBreath;

public class Fish extends LivingThing{
    BreathImplemantor breathobj;
    public Fish(BreathImplemantor breathobj) {
        super(breathobj);
        this.breathobj= breathobj;

    }

    @Override
    public void breathProcess()
    {
        breathobj.breathe();
    }
}
