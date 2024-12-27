package Proxy_Design.EmployeeDaoProxy;

import Proxy_Design.EmployeeDao.*;

public class EmployeeDaoProxy implements EmployeeDao{

    EmployeeDao employeeDaoObj;
    public EmployeeDaoProxy()
    {
        employeeDaoObj=new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, EmployeeDao obj){
        if(client.equals("ADMIN"))
        {
            employeeDaoObj.create(client,obj);

        }
        else
        {
            System.out.println("ACCESS DENIED");
        }
    }

    @Override
    public void delete(String client, int employeeId) {
        if(client.equals("ADMIN"))
        {
            employeeDaoObj.delete(client,employeeId);
            return;
        }
        else {
            System.out.println("ACCESS DENIED");
        }
    }

    @Override
    public EmployeeDao get(String client, int employeeID) {
        if (client.equals("ADMIN") || client.equals("USER")) {
            return employeeDaoObj.get(client, employeeID);

        } else
        {
            System.out.println("ACCESS DENIED");
            return null;
        }
    }
}
