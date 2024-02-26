package org.example;

import java.util.Scanner; //mengimpor data

class LibrarySystem { // kode program
    private static final String[] students = {"202310370311143", "12345678"};
    private static final String adminNIM = "admin";
    private static final String adminPassword = "admin";

    public static void main(String[] args) { // mulai menjalankan program
        Scanner scanner = new Scanner(System.in);
        int choice;

        do { // menjalankan program sampai saya memilih keluar
            System.out.println("Library System");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    loginAsStudent(scanner);
                    break;
                case 2:
                    loginAsAdmin(scanner);
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 3.");
            }
        } while (choice != 3);
    }

    private static void loginAsStudent(Scanner scanner) { // memeriksa keberadaan
        System.out.print("Enter your NIM: ");
        String nim = scanner.next();
        if (isStudent(nim)) {
            System.out.println("Successful Login as Student");
        } else {
            System.out.println("User Not Found");
        }
    }

    private static boolean isStudent(String nim) { //memeriksa
        for (String student : students) {
            if (student.equals(nim)) {
                return true;
            }
        }
        return false;
    }

    private static void loginAsAdmin(Scanner scanner) {
        System.out.print("Enter your username (admin): ");
        String username = scanner.next();
        System.out.print("Enter your password (admin): ");
        String password = scanner.next();
        if (isAdmin(username, password)) {
            System.out.println("Successful Login as Admin");
        } else {
            System.out.println("Admin User Not Found!!");
        }
    }

    private static boolean isAdmin(String username, String password) {
        return adminNIM.equals(username) && adminPassword.equals(password);
    }
}