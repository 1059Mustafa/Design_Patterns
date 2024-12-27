package Proxy_Design.Main;

import Proxy_Design.EmployeeDao.*;
import Proxy_Design.EmployeeDaoProxy.*;

public class Main {
    public static void main(String args[])
    {
        /*try{
            EmployeeDao employeeDao =new EmployeeDaoProxy();
            employeeDao.create("USER", new EmployeeDao() {
                @Override
                public void create(String client, EmployeeDao obj) throws Exception {

                }

                @Override
                public void delete(String client, int employeeId) throws Exception {

                }

                @Override
                public EmployeeDao get(String client, int employeeID) throws Exception {
                    return null;
                }
            });
            System.out.println("Operation successfull");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }*/

        EmployeeDao employeeDao =new EmployeeDaoProxy();
        employeeDao.create("ADMIN", new EmployeeDaoImpl());
        employeeDao.get("ADMIN",1);
    }
}
