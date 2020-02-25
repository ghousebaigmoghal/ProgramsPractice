package sixdee.bics.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import sixdee.bics.model.Employee;

@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer>{

}
