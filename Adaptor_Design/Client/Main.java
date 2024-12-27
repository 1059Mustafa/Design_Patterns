package Adaptor_Design.Client;

import Adaptor_Design.Adaptee.WeightMachineForBabies;
import Adaptor_Design.Adapter.WeightMachineAdapter;
import Adaptor_Design.Adapter.WeightMachineAdapterImpl;

//Client===> Adapter====> Adapte

public class Main {

    public static void main(String arg[])
    {
        WeightMachineAdapter weightMachineAdapter=new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightinKg());
    }
}
