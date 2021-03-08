package com.company;
import com.company.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

    public class Blood_SQL implements IDonorRepository {
        private final IDB db;

        public Blood_SQL(IDB db) {
            this.db = db;
        }


                @Override
            public List<Donor> getAllDonors () {
                Connection con = null;
                try {
                    con = db.getConnection();
                    String sql = "SELECT D_id,D_name,Age , Gender, Address, Phone, Email FROM Donor";
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(sql);
                    List<Donor> Donors = new ArrayList<>();
                    while (rs.next()) {
                        Donor Doon = new Donor(
                                rs.getInt("D_id"),
                                rs.getString("D_name"),
                                rs.getInt("Age"),
                                rs.getString("Gender"),
                                rs.getString("Address"),
                                rs.getInt("Phone"),
                                rs.getString("Email"));

                        Donors.add(Doon);
                    }
                    return Donors;
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        con.close();
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }
                return null;
            }

            @Override
            public String doOrder (Blood_Bank blood_bank){
                return null;
            }

            @Override
            public Blood_Bank getOrder (String BB_name){
                return null;
            }

            @Override
            public Hospital getHospitalAddressMenu (String h_name){
                return null;
            }

        @Override
        public boolean AddnewDonorMenu(Donor Donor) { Connection con = null;
            try {
                con = db.getConnection();
                String sql = "INSERT INTO users(name,surname,gender) VALUES (?,?,?)";
                PreparedStatement st = con.prepareStatement(sql);

                st.setString(1, Donor.getD_name());
                st.setInt(2, Donor.getAge());
                st.setString(3, Donor.getGender());
                st.setString(4, Donor.getAddress());
                st.setString(5, Donor.getGender());
                st.setInt(6, Donor.getPhone());
                st.setString(7, Donor.getEmail());


                boolean executed = st.execute();
                return executed;
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                try {
                    con.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            return false;

        }


    }


