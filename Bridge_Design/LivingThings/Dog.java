package Bridge_Design.LivingThings;

import Bridge_Design.BreathImpl.BreathImplemantor;
//import Bridge_Design.BreathImpl.LandBreath;

public class Dog extends LivingThing{

    BreathImplemantor breathobj;
    public Dog(BreathImplemantor breathobj) {
        super(breathobj);
        this.breathobj= breathobj;
    }

    @Override
    public void breathProcess()
    {
        breathobj.breathe();
    }
}
