package com.company;

public class Blood_Bank {
    private String BB_name;
    private int Orders;
    private String Address;
    private int B_code;

    public Blood_Bank() {
    }
    public Blood_Bank(  int Orders, String Address, int B_code) {
        setOrders(Orders);
        setAddress(Address);
        setB_code(B_code);
    }
    public Blood_Bank(String BB_name, int Orders) {
        setBB_name(BB_name);
        setOrders(Orders);
        setAddress(Address);
        setB_code(B_code);


    }
    public String getBB_name () {
        return BB_name;
    }
    private void setBB_name (String BB_name) {
        this.BB_name = BB_name;
    }
    public int getOrders () {
        return Orders;
    }
    private void setOrders (int Orders) {
        this.Orders = Orders;
    }
    public String getAddress () {
        return Address;
    }
    private void setAddress (String Address) {
        this.Address = Address;
    }
    public int getB_code () {
        return B_code;
    }
    private void setB_code (int B_code) {
        this.B_code = B_code;
    }

    @Override
    public String toString() {
        return "Blood_Bank{" +
                "BB_name=" + BB_name +
                ", Orders='" + Orders + '\'' +
                ", Address='" + Address + '\'' +
                ", B_code=" + B_code  + '\'' +
                '}';
    }

}
