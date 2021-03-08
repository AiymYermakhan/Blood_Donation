package com.company;
    import java.util.List;

    public class Main {

        public static void main(String[] args) {

            IDB db = new PostgresDB();
            IDonorRepository repo = new IDonorRepository() {
                @Override
                public Blood getBloodbyB_codeMenu(int B_code) {
                    return null;
                }

                @Override
                public List<Donor> getAllDonors() {
                    return null;
                }

                @Override
                public String doOrder(Blood_Bank blood_bank) {
                    return null;
                }

                @Override
                public Blood_Bank getOrder(String BB_name) {
                    return null;
                }

                @Override
                public Hospital getHospitalAddressMenu(String H_name) {
                    return null;
                }
            };
            MyApplication app = new MyApplication(repo);
            app.Go();
        }
}
