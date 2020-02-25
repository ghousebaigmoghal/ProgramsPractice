package sixdee.bics.service;


import java.util.List;

import sixdee.bics.model.Employee;

public interface EmployeeService {
	
	public Employee saveEmployee(Employee employee);

	public Employee updateEmployee(Integer id, Employee employee);

	public List<Employee> getAllEmployees();

	public Employee getEmployeeById(Integer id);

	public void deleteEmployeeById(Integer id);
	
	
	
	

}
