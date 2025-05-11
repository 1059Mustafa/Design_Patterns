package LLD_PATTERNS.STRUCTURAL.FACADE2;

public class EmployeeFacade {
    EmployeDao employeDao;
    public EmployeeFacade()
    {
        employeDao=new EmployeDao();
    }
    public void insert()
    {
        employeDao.insert();
    }
    public Employee getEmployeeDetails(int empID)
    {
        return employeDao.getEmployeeDetails(empID);
    }
}
