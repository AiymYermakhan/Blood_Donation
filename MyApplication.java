package com.company;
import com.company.DonorController;
import java.util.Scanner;

public class MyApplication {
    private final DonorController controller;
    private final Scanner scanner;

    public MyApplication(IDonorRepository donorRepository) {
        controller = new DonorController(donorRepository);
        scanner = new Scanner(System.in);
    }

    public void Go() {
        while (true) {
            System.out.println();
            System.out.println("Welcome to Blood Donation Database");
            System.out.println("Select option:");
            System.out.println("1. Get all Donors");
            System.out.println("2. Get info Blood by B_code");
            System.out.println("3. Do Order to Blood ");
            System.out.println("4. Get Orders ");
            System.out.println("5. Get Hospital name ");
            System.out.println("0. Exit");
            System.out.println();
            try {
                System.out.print("Enter option (1-5): ");
                int option = scanner.nextInt();
                if (option == 1) {
                    getAllDonorsMenu();
                } else if (option == 2) {
                    getBloodbyB_codeMenu();
                } else if (option == 3) {
                    doOrderMenu();
                } else if (option == 4) {
                    getOrdersMenu();
                }
                else if (option == 5) {
                    getHospitalAddressMenu();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.next(); // to ignore incorrect input
            }

            System.out.println("*************************");

        }
    }

    public void getAllDonorsMenu() {
        String response = controller.getAllDonors();
        System.out.println(response);
    }

    public void getBloodbyB_codeMenu() {
        System.out.println("Please enter B_code");

        int B_code = scanner.nextInt();
        String response = controller.getBloodbyB_codeMenu(B_code);
        System.out.println(response);
    }

    public void doOrderMenu() {
        System.out.println("Please enter name");
        String BB_name = scanner.next();
        System.out.println("Please enter amount of blood you need");
        int Orders = scanner.nextInt();
        String response = controller.doOrderMenu(BB_name, Orders);
        System.out.println(response);
    }
    public void getOrdersMenu() {
        System.out.println("Please enter BB_name");
        String BB_name = scanner.next();
        String response = controller.getOrders(BB_name);
        System.out.println(response);
    }
    public void getHospitalAddressMenu() {
        System.out.println("Please enter Hospital name");

        String H_name = scanner.next();
        String response = controller.getHospitalAddressMenu(H_name);
        System.out.println(response);
    }

}
