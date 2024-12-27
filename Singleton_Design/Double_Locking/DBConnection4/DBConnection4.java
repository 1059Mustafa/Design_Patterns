package Singleton_Design.Double_Locking.DBConnection4;

import Singleton_Design.Synchronized.DBConnection3.DBConnection3;

public class DBConnection4 {
    private static DBConnection4 obj;

    private DBConnection4()
    {

    }
    synchronized public static DBConnection4 getInstance()
    {
        if(obj==null)
        {
            synchronized (DBConnection4.class)
            {
                if(obj==null)
                {
                    obj=new DBConnection4();
                }
            }

        }
        return obj;
    }
}
