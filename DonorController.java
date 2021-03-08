package com.company;
import com.company.*;
import com.company.IDonorRepository;
import java.util.List;

public class DonorController {
    private final IDonorRepository repo;

    public DonorController(IDonorRepository repo) {
        this.repo = repo;
    }


    public String doOrderMenu(String BB_name, int Orders) {

        Blood_Bank Blood_Bank = new Blood_Bank (BB_name, Orders);

        String created = repo.doOrder(Blood_Bank);

        return created ;}

    public String getBloodbyB_codeMenu(int B_code) {
        Blood Blood = repo.getBloodbyB_codeMenu(B_code);

        return (Blood == null ? "User was not found!" : Blood.toString());
    }

    public String getAllDonors() {
        List<Donor> Donors = repo.getAllDonors();

        return Donors.toString();
    }

    public String getOrders(String BB_name) {
        Blood_Bank Blood_Bank = repo.getOrder(BB_name);

        return (BB_name == null ? "Order was not found!" : Blood_Bank.toString());
    }

    public String getHospitalAddressMenu(String H_name) {
        Hospital Hospital = repo.getHospitalAddressMenu(H_name);

        return (Hospital == null ? "User was not found!" : Hospital.toString());
    }


}
