package org.wecancodeit.mvcdesign.Models;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;

import jakarta.persistence.*;


@Entity
@Table(name = "employees")
public class EmployeeModel {

    @Id
    @GeneratedValue
    private Long id;

    private String first;
    private String middle;
    private String last;
    private String suffixe;
    private String phoneNumber;
   
    

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addressId", referencedColumnName = "id")
    private AddressModel address;

    public EmployeeModel() {
    }

    public EmployeeModel(String first, String middle, String last, String suffixe, String phoneNumber) {
        this.first = first;
        this.middle = middle;
        this.last = last;
        this.suffixe = suffixe;
        this.phoneNumber = phoneNumber;
       
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public AddressModel getAddress() {
        return address;
    }

    public void setAddress(AddressModel address) {
        this.address = address;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getFirst() {
        return first;
    }

    public String getMiddle() {
        return middle;
    }

    public String getLast() {
        return last;
    }

    public String getSuffixe() {
        return suffixe;
    }

    @Override
    public String toString() {
        return "EmployeeModel [id=" + id + ", first=" + first + ", middle=" + middle + ", last=" + last + ", suffixe="
                + suffixe + "]";
    }    
}
