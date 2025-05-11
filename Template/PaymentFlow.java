package LLD_PATTERNS.STRUCTURAL.Template;

public abstract class PaymentFlow {
    public abstract void validateRequest();
    public abstract void calculateFee();
    public abstract void debitAmount();
    public abstract void creditAmount();

    //this is the template method which define the order of steps to execute the task

    public final void sendMoney()
    {
        //Step1
        validateRequest();
        //Step2
        debitAmount();
        //Step3
        calculateFee();
        //Step4
        creditAmount();
    }
}
