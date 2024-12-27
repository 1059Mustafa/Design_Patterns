package Singleton_Design.Synchronized.DBConnection3;

import Singleton_Design.Lazy.DBConnection2.DBConnection2;

public class DBConnection3 {
    private static DBConnection3 obj;

    private DBConnection3()
    {

    }
    synchronized public static DBConnection3 getInstance()
    {
        if(obj==null)
        {
            obj=new DBConnection3();
        }
        return obj;
    }
}
