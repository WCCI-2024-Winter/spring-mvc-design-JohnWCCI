package org.wecancodeit.mvcdesign.Services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wecancodeit.mvcdesign.Models.EmployeeModel;
import org.wecancodeit.mvcdesign.Repositories.AddressRepository;
import org.wecancodeit.mvcdesign.Repositories.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeService(AddressRepository addressRepository, EmployeeRepository employeeRepository) {
        this.addressRepository = addressRepository;
        this.employeeRepository = employeeRepository;
    }

    public Iterable<EmployeeModel> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public EmployeeModel saveModel(EmployeeModel model) throws Exception{
        if(model!=null){
            return employeeRepository.save(model);
        }
        return null;
    }

    public EmployeeModel getEmployee(long id){
        EmployeeModel result = null;
        result = employeeRepository.findById(id).get();
        return result;
    }
    public void deleteEmployee(long id){
        employeeRepository.deleteById(id);
    }

}
