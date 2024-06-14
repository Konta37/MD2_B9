package BTThay.B2;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Computer extends Product {
    private String config_info;
    private double importPrice;

    public Computer() {
    }


    public Computer(String id, String name, String producer, int yearMaking, String config_info, double importPrice) {
        super(id, name, producer, yearMaking);
        this.config_info = config_info;
        this.importPrice = importPrice;
    }

    public String getConfig_info() {
        return config_info;
    }

    public void setConfig_info(String config_info) {
        this.config_info = config_info;
    }

    public double getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(double importPrice) {
        this.importPrice = importPrice;
    }

    @Override
    public void inputData() {
        super.inputData();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap cau hinh mtinh");
        config_info = sc.nextLine();
        System.out.println("Nhap vao gia nhap:");
        importPrice = sc.nextDouble();
    }

    @Override
    public void displayData() {
        super.displayData();
        System.out.println("\tCau hinh: " + config_info);
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi","VN"));
        System.out.println("\tVao gia nhap: " + nf.format(importPrice) );
        System.out.println("\tGia Ban: " + nf.format(caculateSellPrice()));
    }

    @Override
    public double caculateSellPrice() {
        return importPrice * 0.1 + importPrice;
    }
}
