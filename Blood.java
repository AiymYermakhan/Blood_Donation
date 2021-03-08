package com.company;

public class Blood {
    private int B_code;
    private int B_group;
    private int Cost;
    private int D_id;

    public Blood() {
    }
    public Blood( int B_group, int Cost, int D_id ) {
        setB_group(B_group);
        setCost(Cost);
        setD_id(D_id);


    }
    public Blood(int B_code, int B_group, int Cost, int D_id ) {
        setB_group(B_code);
        setB_group(B_group);
        setCost(Cost);
        setD_id(D_id);

    }

    public int getB_code() {
        return B_code;
    }
    private void setB_code(int B_code) {
        this.B_code = B_code;
    }

    public int getB_group() {
        return B_group;
    }
    private void setB_group(int B_group) {
        this.B_group = B_group;
    }

    public int getCost() {
        return Cost;
    }
    private void setCost(int Cost) {
        this.Cost = Cost;
    }

    public int getD_id() {
        return D_id;
    }
    private void setD_id(int D_id) {
        this.D_id = D_id;
    }
    @Override
    public String toString() {
        return "Blood{" +
                "B_code=" + B_code +
                ", B_group='" + B_group + '\'' +
                ", Cost='" + Cost + '\'' +
                ", D_id=" + D_id  + '\'' +
                '}';
    }




}
