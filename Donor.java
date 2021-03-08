package com.company;

public class Donor {
    private int D_id;
    private String D_name;
    private  int Age;
    private  String Gender;
    private  String Address;
    private  int Phone;
    private String Email;

    public Donor() {
    }
    public Donor( String D_name, int Age, String Gender, String Address, int Phone, String Email ) {
        setD_name(D_name);
        setAge(Age);
        setGender(Gender);
        setAddress(Address);
        setPhone(Phone);
        setEmail(Email);

    }
    public Donor(int D_id, String D_name, int Age, String Gender, String Address, int Phone, String Email ) {
        setD_id(D_id);
        setD_name(D_name);
        setAge(Age);
        setGender(Gender);
        setAddress(Address);
        setPhone(Phone);
        setEmail(Email);

    }

    public int getD_id() {
        return D_id;
    }
    private void setD_id(int D_id) {
        this.D_id = D_id;
    }

    public String getD_name() {
        return D_name;
    }
    private void setD_name(String D_name) {
        this.D_name = D_name;
    }

    public int getAge() {
        return Age;
    }
    private void setAge(int Age) {
        this.Age = Age;
    }
    public String getGender() {
        return Gender;
    }
    private void setGender(String Gender) {
        this.Gender = Gender;
    }
    public String getAddress() {
        return Address;
    }
    private void setAddress(String Address) {
        this.Address = Address;
    }
    public int getPhone() {
        return Phone;
    }
    private void setPhone(int Phone) {
        this.Phone = Phone;
    }
    public String getEmail() {
        return Email;
    }
    private void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString() {
        return "Donor{" +
                "D_id=" + D_id +
                ", D_name='" + D_name + '\'' +
                ", Age=" + Age +
                ", Gender='" + Gender + '\'' +
                ", Address='" + Address + '\'' +
                ", Phone=" + Phone +
                ", Email='" + Email + '\'' +
                '}';
    }
}
