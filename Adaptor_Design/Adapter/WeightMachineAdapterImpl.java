package Adaptor_Design.Adapter;

import Adaptor_Design.Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {

    WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine)
    {
        this.weightMachine=weightMachine;
    }

    @Override
    public double getWeightinKg()
    {
        double weightinPound= weightMachine.getWeightInPound();

        double weightinKg= weightinPound*.45;
        return weightinKg;
    }
}
