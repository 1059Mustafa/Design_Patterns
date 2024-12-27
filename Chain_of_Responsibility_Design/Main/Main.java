package Chain_of_Responsibility_Design.Main;

import Chain_of_Responsibility_Design.LogProcessor.DebugLogProcessor;
import Chain_of_Responsibility_Design.LogProcessor.ErrorLogProcessor;
import Chain_of_Responsibility_Design.LogProcessor.InfoLogProcessor;
import Chain_of_Responsibility_Design.LogProcessor.LogProcessor;

public class Main {
    public static void main(String[] args)
    {
        LogProcessor logProcessor =new InfoLogProcessor(new ErrorLogProcessor(new DebugLogProcessor(null)));

        logProcessor.log(LogProcessor.ERROR,"Exception happen");
        logProcessor.log(LogProcessor.DEBUG,"Need to debug this");
        logProcessor.log(LogProcessor.INFO,"Just for Info");
    }
}
