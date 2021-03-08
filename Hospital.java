package com.company;

public class Hospital {
    private String H_name;
    private String Address;
    private String BB_name;


    public Hospital() {
    }
    public Hospital( String H_name, String Address, String BB_name ) {
        setH_name(H_name);
        setAddress(Address);
        setBB_name(BB_name);
    }

    public String getH_name () {
        return H_name;
    }

    private void setH_name (String H_name) {
        this.H_name = H_name;
    }
    public String getAddress () {
        return Address;
    }

    private void setAddress (String Address) {
        this.Address = Address;
    }
    public String getBB_name () {
        return BB_name;
    }

    private void setBB_name (String BB_name) {
        this.BB_name = BB_name;
    }
    @Override
    public String toString() {
        return "Hospital{" +
                "Hospital" + H_name +
                ", Address='" + Address + '\'' +
                ", Blood Bank='" + BB_name + '\'' +
                '}';
    }

}
