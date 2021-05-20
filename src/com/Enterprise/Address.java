package com.Enterprise;

public class Address {

    private String street, city, state, zip;

    // parameterized constructor
    public Address(String street, String city, String state, String zip){
        this.street=street;
        this.city=city;
        this.state=state;
        this.zip=zip;
    }

    // gets the street name
    public String getStreet(){
        return street;
    }

    //gets the city name
    public String getCity(){
        return city;
    }

    //gets the state
    public String getState(){
        return state;
    }

    //gets the zip code
    public String getZip(){
        return zip;
    }
}
