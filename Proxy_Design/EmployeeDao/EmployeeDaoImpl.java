package Proxy_Design.EmployeeDao;

public class EmployeeDaoImpl implements EmployeeDao{

    @Override
    public void create(String client, EmployeeDao obj)
    {
        System.out.println("created new row in employee table");
    }
    @Override
    public void delete(String client,int employeeId)
    {
        System.out.println("deleted row with employeeID -> "+ employeeId);
    }

    @Override
    public EmployeeDao get(String client, int employeeID)
    {
        System.out.println("Fetching data from database:");
        return new EmployeeDaoImpl();
    }
}
