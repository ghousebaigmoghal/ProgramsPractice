package sixdee.bics.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sixdee.bics.dao.EmployeeDao;
import sixdee.bics.model.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService{
	
	@Autowired
	EmployeeDao employeeDao;
	
	
	@Override
	public Employee getEmployeeById(Integer id) {
		Optional<Employee> optionalEmployee=employeeDao.findById(id);
		return optionalEmployee.orElseGet(() -> new Employee());
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		Iterable<Employee> listOfEmployees=employeeDao.findAll();
		List<Employee> employees=new ArrayList<>();
		for (Employee employee :listOfEmployees) {
			employees.add(employee);
		}
		return employees;
	}
	
	@Override
	public Employee saveEmployee(Employee employee) {
		Employee savedEmployee = employeeDao.save(employee);
		return savedEmployee;
	}
 @Override
public Employee updateEmployee(Integer id, Employee employee) {
	 Optional<Employee> optionalEmployee=employeeDao.findById(id);
	 if (optionalEmployee.isPresent()) {
		 Employee savedEmployee=optionalEmployee.get();
		 savedEmployee.setName(employee.getName());
		 savedEmployee.setAge(employee.getAge());
		 savedEmployee.setDep(employee.getDep());
		 savedEmployee.setSalary(employee.getSalary());
		 employeeDao.save(savedEmployee);
		 return savedEmployee;
	 }
	 return employee;
 }
 @Override
 public void deleteEmployeeById(Integer id) {
	 employeeDao.deleteById(id);
 }
}
