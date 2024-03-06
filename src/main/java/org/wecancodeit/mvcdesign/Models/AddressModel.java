package org.wecancodeit.mvcdesign.Models;

import jakarta.persistence.*;


@Entity
@Table(name = "addresses")
public class AddressModel {
    
    @Id
    @GeneratedValue
    private Long id;

private String address1;
private String address2;
private String apartmentNumber;
private String city;
private String state;
private String zip;
private String zipFour;
private String county;
private String country;

public AddressModel() {
}

public AddressModel(String address1, String address2, String apartmentNumber, String city, String state, String zip,
        String zipFour, String county, String country) {
    this.address1 = address1;
    this.address2 = address2;
    this.apartmentNumber = apartmentNumber;
    this.city = city;
    this.state = state;
    this.zip = zip;
    this.zipFour = zipFour;
    this.county = county;
    this.country = country;
}


public void setId(Long id) {
    this.id = id;
}

public Long getId() {
    return id;
}

public String getAddress1() {
    return address1;
}

public String getAddress2() {
    return address2;
}

public String getApartmentNumber() {
    return apartmentNumber;
}

public String getCity() {
    return city;
}

public String getState() {
    return state;
}

public String getZip() {
    return zip;
}

public String getZipFour() {
    return zipFour;
}

public String getCounty() {
    return county;
}

public String getCountry() {
    return country;
}

@Override
public String toString() {
    return "AddressModel [id=" + id + ", address1=" + address1 + ", address2=" + address2 + ", apartmentNumber="
            + apartmentNumber + ", city=" + city + ", state=" + state + ", zip=" + zip + ", zipFour=" + zipFour
            + ", county=" + county + ", country=" + country + "]";
}





}
