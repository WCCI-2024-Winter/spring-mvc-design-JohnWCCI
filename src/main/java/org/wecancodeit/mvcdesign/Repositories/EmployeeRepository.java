package org.wecancodeit.mvcdesign.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.mvcdesign.Models.EmployeeModel;

public interface EmployeeRepository extends CrudRepository<EmployeeModel, Long> {
      EmployeeModel getByFirst(String First);
      EmployeeModel getByLast(String Last);
}
