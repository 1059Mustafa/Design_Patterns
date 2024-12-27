package Chain_of_Responsibility_Design.LogProcessor;

public class InfoLogProcessor extends LogProcessor{

    public InfoLogProcessor(LogProcessor nextlogProcessor)
    {
        super(nextlogProcessor);
    }

    public void log(int loglevel,String message)
    {
        if(loglevel==INFO)
        {
            System.out.println("INFO:"+message);
        }
        else
        {
            super.log(loglevel,message);
        }
    }
}
