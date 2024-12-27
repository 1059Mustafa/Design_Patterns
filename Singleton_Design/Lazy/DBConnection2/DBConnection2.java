package Singleton_Design.Lazy.DBConnection2;

public class DBConnection2 {
    private static DBConnection2 obj;

    private DBConnection2()
    {

    }
    public static DBConnection2 getInstance()
    {
        if(obj==null)
        {
            obj=new DBConnection2();
        }
        return obj;
    }
}
