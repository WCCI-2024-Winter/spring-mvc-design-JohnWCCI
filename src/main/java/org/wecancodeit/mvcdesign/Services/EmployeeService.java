package org.wecancodeit.mvcdesign.Services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.wecancodeit.mvcdesign.Models.EmployeeModel;
import org.wecancodeit.mvcdesign.Repositories.AddressRepository;
import org.wecancodeit.mvcdesign.Repositories.EmployeeRepository;

public class EmployeeService {
     @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeService(AddressRepository addressRepository, EmployeeRepository employeeRepository) {
        this.addressRepository = addressRepository;
        this.employeeRepository = employeeRepository;
    }

        public Iterable<EmployeeModel> getAllEmployees(){
        return employeeRepository.findAll();
    }
}
