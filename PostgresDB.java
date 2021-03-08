package com.company;
import com.company.IDB;
import java.sql.*;

public class PostgresDB implements IDB{
    @Override
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        String connectionUrl = "jdbc:postgresql://localhost:2002/mydb";
        try {
            // Here we load the driver’s class file into memory at the runtime
            Class.forName("org.postgresql.Driver");

            // Establish the connection
            Connection con = DriverManager.getConnection(connectionUrl, "postgres", "Aiym2002.");

            return con;
        } catch (Exception e) {
            System.out.println(e);
            throw e;
        }
    }
}
