package org.wecancodeit.mvcdesign;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.mvcdesign.Models.*;
import org.wecancodeit.mvcdesign.Services.*;

import jakarta.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private final EmployeeService employees;

    @Resource
    private final AddressService address;

    public Populator(EmployeeService employees, AddressService address) {
        this.employees = employees;
        this.address = address;
    }

    @Override
    public void run(String... args) throws Exception {
        AddressModel addressModel = new AddressModel("123 Main st.", "Address 2", "B-12", "AnyCity", "State", "44422",
                "44422-456", "Dummy", "USA");

         EmployeeModel employeeModel = new EmployeeModel("John", "R.", "Moseley", "Mr.", "1234567890");
         employeeModel.setAddress(addressModel);
         employees.saveModel(employeeModel);


         employeeModel = new EmployeeModel("Joe", "R.", "Smith", "Mr.", "1234567890");
         addressModel = new AddressModel("Second Address.", "Address 2", "B-12", "AnyCity", "State", "44422",
         "44422-456", "Dummy", "USA");
        employeeModel.setAddress(addressModel);
         employees.saveModel(employeeModel);
         
         employeeModel = new EmployeeModel("Jane", "R.", "Smith", "Mr.", "1234567890");
         addressModel = new AddressModel("Thrid Address.", "Address 2", "B-12", "AnyCity", "State", "44422",
         "44422-456", "Dummy", "USA");
         employeeModel.setAddress(addressModel);
         employees.saveModel(employeeModel);
    }

}
