package Proxy_Design.EmployeeDao;

public interface EmployeeDao {

    public void create(String client,EmployeeDao obj) ;
    public void delete(String client, int employeeId) ;
    public  EmployeeDao get(String client, int employeeID);
}
