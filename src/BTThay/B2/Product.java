package BTThay.B2;

import BTThay.B2.ComputerManagement;
import java.util.Scanner;

public abstract class Product {
    private String id;
    private String name;
    private String producer;
    private int yearMaking;

    public Product() {
    }

    public Product(String id, String name, String producer, int yearMaking) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.yearMaking = yearMaking;
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

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYearMaking() {
        return yearMaking;
    }

    public void setYearMaking(int yearMaking) {
        this.yearMaking = yearMaking;
    }

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of product");
        int numberOfProducts = Integer.parseInt(sc.nextLine());
        ComputerManagement.productsArray = new Product[numberOfProducts];
        for (int i = 0; i < numberOfProducts; i++) {
            ComputerManagement.productsArray[i] = new Product();
            System.out.println("Enter customer " + (i + 1));
            System.out.println("Enter id:");
            ComputerManagement.productsArray[i].setId(sc.nextLine());
            System.out.println("Enter name:");
            ComputerManagement.productsArray[i].setName(sc.nextLine());
            System.out.println("Enter producer:");
            ComputerManagement.productsArray[i].setProducer((sc.nextLine()));

            System.out.println("Enter year Making:");
            ComputerManagement.productsArray[i].setYearMaking(Integer.parseInt(sc.nextLine()));


        }
    }

    public void displayData() {
    }

    public abstract double caculateSellPrice();
}
