package org.wecancodeit.mvcdesign.Services;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wecancodeit.mvcdesign.Models.AddressModel;
import org.wecancodeit.mvcdesign.Repositories.AddressRepository;
import org.wecancodeit.mvcdesign.Repositories.EmployeeRepository;

@Service
public class AddressService {
    
    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public Iterable<AddressModel> getAddress(){
        return addressRepository.findAll();
    }
}
