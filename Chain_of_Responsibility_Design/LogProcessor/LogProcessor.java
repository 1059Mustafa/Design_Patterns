package Chain_of_Responsibility_Design.LogProcessor;

public abstract class LogProcessor {
    public static int INFO=1;
    public static int DEBUG=2;
    public static int ERROR=3;
    LogProcessor nextlogProcessor;

    public LogProcessor(LogProcessor logProcessor)
    {
        this.nextlogProcessor=logProcessor;
    }
    public void log(int loglevel,String message)
    {
        if(nextlogProcessor!=null)
        {
            nextlogProcessor.log(loglevel,message);
        }
    }
}
