package com.company;

public class Receptionist {
    private int Em_id;
    private String E_name;
    private String Address;
    private int D_id;
    private String BB_name;

    public Receptionist() {
    }
    public Receptionist( String E_name, int D_id, String Address, String BB_name) {
        setE_name(E_name);
        setAddress(Address);
        setD_id(D_id);
        setBB_name(BB_name);

    }
    public Receptionist(int Em_id, String E_name, int D_id, String Address, String BB_name) {
        setEm_id(Em_id);
        setE_name(E_name);
        setAddress(Address);
        setD_id(D_id);
        setBB_name(BB_name);

    }

    public int getEm_id() {
        return Em_id;
    }
    private void setEm_id(int Em_id) {
        this.Em_id = Em_id;
    }

    public String getE_name() {
        return E_name;
    }
    private void setE_name(String E_name) {
        this.E_name = E_name;
    }

    public int getD_id() {
        return D_id;
    }
    private void setD_id(int D_id) {
        this.D_id = D_id;
    }

    public String getAddress() {
        return Address;
    }
    private void setAddress(String Address) {
        this.Address = Address;
    }

    public String getBB_name() {
        return BB_name;
    }
    private void setBB_name(String BB_name) {
        this.BB_name = BB_name;
    }

    @Override
    public String toString() {
        return "Receptionist{" +
                ", Employee id='" + Em_id +
                ",Employee name='" + E_name + '\'' +
                ", Donor id='" + D_id + '\'' +
                ", Blood Bank name=" + BB_name  + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
