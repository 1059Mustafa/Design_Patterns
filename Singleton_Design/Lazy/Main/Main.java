package Singleton_Design.Lazy.Main;

import Singleton_Design.Eager.DBConnection.DBConnection;

public class Main {
    public static void main(String[] args)
    {

        DBConnection dbConnection =DBConnection.getInstance();
    }
}
