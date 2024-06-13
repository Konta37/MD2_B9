package BTThay.B1;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.text.ParseException;

public class Customer implements ICustomer {
    private String id;
    private String name;
    private boolean gender;
    private Date birthday;
    private String address;
    private String email;
    private String phone;

    public Customer() {
    }

    public Customer(String id, String name, boolean gender, Date birthday, String address, String email, String phone) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Custom");
        int numberOfCustomers = Integer.parseInt(sc.nextLine());
        CustomerManager.customersArray = new Customer[numberOfCustomers];
        for (int i = 0; i < numberOfCustomers; i++) {
            CustomerManager.customersArray[i] = new Customer();
            System.out.println("Enter customer " + (i + 1));
            System.out.println("Enter id:");
            CustomerManager.customersArray[i].setId(sc.nextLine());
            System.out.println("Enter name:");
            CustomerManager.customersArray[i].setName(sc.nextLine());
            System.out.println("Enter gender:");
            CustomerManager.customersArray[i].setGender(Boolean.parseBoolean(sc.nextLine()));
            System.out.println("Enter birthday:");
            SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
            try {
                java.util.Date utilDate = sf.parse(sc.nextLine());
                java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
                CustomerManager.customersArray[i].setBirthday(sqlDate);
            } catch (ParseException e) {
                System.out.println("Invalid date format. Please use dd-MM-yyyy.");
                i--; // Decrement i to retry for the same customer
                continue; // Skip the remaining input and retry for the same customer
            }
            System.out.println("Enter address:");
            CustomerManager.customersArray[i].setAddress(sc.nextLine());
            System.out.println("Enter phone:");
            CustomerManager.customersArray[i].setPhone(sc.nextLine());
            System.out.println("Enter email:");
            CustomerManager.customersArray[i].setEmail(sc.nextLine());

        }
    }

    @Override
    public void displayData() {
        System.out.printf("%-10s %-20s %-10s %-15s %-30s %-30s %-15s%n", "ID", "Name", "Gender", "Birthday", "Address", "Email", "Phone");
        for (Customer customer : CustomerManager.customersArray) {
            if (customer != null) {
                System.out.printf("%-10s %-20s %-10s %-15s %-30s %-30s %-15s%n",
                        customer.getId(),
                        customer.getName(),
                        customer.getGender() ? "Male" : "Female",
                        customer.getBirthday().toString(),
                        customer.getAddress(),
                        customer.getEmail(),
                        customer.getPhone());
            }
        }
    }
}
