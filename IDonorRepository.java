package com.company;
import com.company.*;
import java.util.List;
public interface IDonorRepository {
    Blood getBloodbyB_codeMenu(int B_code);
    List<Donor> getAllDonors();
    String doOrder(Blood_Bank blood_bank);
    Blood_Bank getOrder(String BB_name);
    Hospital getHospitalAddressMenu(String H_name);
}
