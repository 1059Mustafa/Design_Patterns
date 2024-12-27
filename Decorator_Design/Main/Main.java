package Decorator_Design.Main;

import Decorator_Design.Base.BasePizza;
import Decorator_Design.Base.Margherita;
import Decorator_Design.ToppingDecorator.Extra_Cheese;
import Decorator_Design.ToppingDecorator.Extra_Mushroom;

public class Main {
    public static void main(String args[])
    {
        BasePizza basePizza=new Extra_Mushroom(new Extra_Mushroom(new Extra_Cheese(new Margherita())));
        System.out.println(basePizza.cost());
    }
}
