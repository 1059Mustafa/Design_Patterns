package Decorator_Design.ToppingDecorator;

import Decorator_Design.Base.BasePizza;

public class Extra_Mushroom extends ToppingDecorator{

    BasePizza basePizza;
    public Extra_Mushroom(BasePizza basePizza)
    {
        this.basePizza=basePizza;
    }
    public int cost()
    {
        return this.basePizza.cost()+15;
    }
}
