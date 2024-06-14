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
        System.out.println("Nhap ma sp:");
        id = sc.nextLine();
        System.out.println("Nhap ten sp:");
        name = sc.nextLine();
        System.out.println("Nhap nha sx:");
        producer = sc.nextLine();
        System.out.println("Nhap nam sx:");
        yearMaking = sc.nextInt();
    }

    public void displayData() {
        System.out.println("\tid: " + id);
        System.out.println("\t name: " + name);
        System.out.println("\t producer: " + producer);
        System.out.println("\t yearMaking: " + yearMaking);

    }

    public abstract double caculateSellPrice();
}
