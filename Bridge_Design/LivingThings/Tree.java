package Bridge_Design.LivingThings;

import Bridge_Design.BreathImpl.BreathImplemantor;

public class Tree extends LivingThing{

    protected BreathImplemantor breathobj;
    public Tree(BreathImplemantor breathobj) {
        super(breathobj);
        this.breathobj= breathobj;
    }
    @Override
    public void breathProcess()
    {
        breathobj.breathe();
    }
}
