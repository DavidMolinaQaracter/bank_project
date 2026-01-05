package services;

import entities.Customer;
import java.util.Scanner;

public class CustomerService {

    private Customer customer;
    private StringBuilder sb;
    boolean exit = true;

    public Customer updateCustomerInfo(Customer customer) {
        Scanner sc = new Scanner(System.in);
        do {
            String message = "What do you want to do?\n1. Update first name" +
                    "\n2. Update last name\n3. Update email\n4. Update password\n5. Exit";
            System.out.println(message);
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter first name:");
                    String firstName = sc.nextLine();
                    customer.setFirstName(firstName);
                    customer.updateName();
                    sb.append("Updated first name to: ").append(firstName).append("\n");
                    break;
                case 2:
                    System.out.println("Enter last name:");
                    String lastName = sc.nextLine();
                    customer.setLastName(lastName);
                    customer.updateName();
                    sb.append("Updated last name to: ").append(lastName).append("\n");
                    break;
                case 3:
                    System.out.println("Enter new email:");
                    String email = sc.nextLine();
                    customer.setEmail(email);
                    sb.append("Updated email to: ").append(email).append("\n");
                    break;
                case 4:
                    System.out.println("Enter new password:");
                    String password = sc.nextLine();
                    customer.setPassword(password);
                    sb.append("Updated password\n");
                    break;
                case 5:
                    sc.close();
                    exit = false;
                    break;
            }
        } while (exit);

        return customer;
    }

    public String auditLog(){
        return sb.toString();
    }

}
