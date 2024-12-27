package Bridge_Design.LivingThings;

import Bridge_Design.BreathImpl.BreathImplemantor;

public abstract class LivingThing {


    public BreathImplemantor breathImplemantor;

    public LivingThing(BreathImplemantor breathobj)
    {
        this.breathImplemantor= breathobj;
    }
    abstract public void breathProcess();
}
