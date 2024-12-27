package Chain_of_Responsibility_Design.LogProcessor;

public class ErrorLogProcessor extends LogProcessor{
    public ErrorLogProcessor(LogProcessor nextlogProcessor)
    {
        super(nextlogProcessor);
    }

    public void log(int loglevel,String message)
    {
        if(loglevel==ERROR)
        {
            System.out.println("ERROR:"+message);
        }
        else
        {
            super.log(loglevel,message);
        }
    }
}
