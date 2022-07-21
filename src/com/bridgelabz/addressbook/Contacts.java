package com.bridgelabz.addressbook;

public class Contacts {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private long mobileNumber;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Contacts(){

    }

    Contacts(String firstName,String lastName,String address,String city,String state,long mobileNumber){
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.city=city;
        this.state=state;
        this.mobileNumber=mobileNumber;

    }

    public String toString() {
        return "Contact List{" +'\n'+
                "firstName= " + firstName + '\n' +
                "lastName= " + lastName + '\n' +
                "address= " + address + '\n' +
                "city= " + city + '\n' +
                "state= " + state + '\n' +
                "phoneNumber=" + mobileNumber +'\n'+"}";
    }
}
