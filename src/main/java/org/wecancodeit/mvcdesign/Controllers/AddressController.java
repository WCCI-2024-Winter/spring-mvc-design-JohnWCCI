package org.wecancodeit.mvcdesign.Controllers;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.wecancodeit.mvcdesign.Models.AddressModel;
import org.wecancodeit.mvcdesign.Services.AddressService;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
//@RequestMapping("/api/v1")
public class AddressController {

    @Resource
    private final AddressService service;

    
    public AddressController(AddressService service) {
        this.service = service;
    }

    @GetMapping("/api/v1/Address")
    public Iterable<AddressModel> getAllAddress() {
        return service.getAddress();
    }

    @GetMapping("/api/v2/Address")
    public Iterable<AddressModel> getAllAddress2() {
        return service.getAddress();
    }
    @GetMapping("/api/v1/Address/{id}")
    public AddressModel getAddress(@PathVariable Long id){
        return service.getById(id);
    }

    @GetMapping("/api/v2/Address/{id}")
    public AddressModel getAddress2(@PathVariable Long id){
        return service.getById(3l);
    }
}
