/**********************
 * 
 * 
 * venkateshwara usirikayala, venkateshwara usirikayala, venkateshwara usirikayala, 
 * venkateshwara usirikayala, venkateshwara usirikayala, venkateshwara usirikayala, 
 * venkateshwara usirikayala, venkateshwara usirikayala, venkateshwara usirikayala, 
 * venkateshwara usirikayala, venkateshwara usirikayala, venkateshwara usirikayala, 
 * venkateshwara usirikayala, venkateshwara usirikayala, venkateshwara usirikayala, 
 * venkateshwara usirikayala, venkateshwara usirikayala, venkateshwara usirikayala, 
 * venkateshwara usirikayala, venkateshwara usirikayala, venkateshwara usirikayala, 
 * 
 * 
 * 
 * 
 * 
 * 
 */









package sixdee.bics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sixdee.bics.model.Employee;
import sixdee.bics.service.EmployeeService;

@RestController
public class BicsController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("employee")
	public ResponseEntity<List<Employee>> getEmployees(){
		
		
	List<Employee > listOfEmployees=employeeService.getAllEmployees();
		return ResponseEntity.ok(listOfEmployees);
		
	}
	@GetMapping("employee/{}id")
	public ResponseEntity<Employee> getEmployees(@PathVariable Integer id){
		
		Employee employee=employeeService.getEmployeeById(id);
		return ResponseEntity.ok(employee);
		
	}

	
	@PostMapping("employee")
	public ResponseEntity<Employee> savaEmployee(@RequestBody Employee employee){
		Employee savedEmployee=employeeService.saveEmployee(employee);
		return ResponseEntity.ok(savedEmployee);
	}
  @PutMapping("employee/{id}")
  public ResponseEntity<Employee> updateEmployee(@PathVariable Integer id, @RequestBody Employee employee ){
	 Employee updatedEmployee= employeeService.updateEmployee(id,employee);
	 return ResponseEntity.ok(updatedEmployee);
  }
  @DeleteMapping("employee/{id}")
  public void deleteEmployee(@PathVariable Integer id) {
	  employeeService.deleteEmployeeById(id) ;
  }
  
}
