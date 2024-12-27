package Chain_of_Responsibility_Design.LogProcessor;

public class DebugLogProcessor extends LogProcessor{
    public DebugLogProcessor(LogProcessor nextlogProcessor)
    {
        super(nextlogProcessor);
    }

    public void log(int loglevel,String message)
    {
        if(loglevel==DEBUG)
        {
            System.out.println("DEBUG:"+message);
        }
        else
        {
            super.log(loglevel,message);
        }
    }
}
