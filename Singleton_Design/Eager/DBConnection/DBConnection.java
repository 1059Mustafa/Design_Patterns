package Singleton_Design.Eager.DBConnection;

public class DBConnection {
    private static final DBConnection obj= new DBConnection();

    private DBConnection()
    {

    }
    public static DBConnection getInstance()
    {
        return obj;
    }
}
