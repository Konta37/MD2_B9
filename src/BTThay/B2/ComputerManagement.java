package BTThay.B2;

import BTThay.B2.Product;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ComputerManagement {
    public static Product[] productsArray;

    public static void main(String[] args) {
        Computer[] list;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of products: ");
        n = sc.nextInt();
        list = new Computer[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin may tinh thu " + (i+1));
            list[i] = new Computer();
            list[i].inputData();
        }

        System.out.println("Thong tin may tinh");
        for (Computer c : list) {
            c.displayData();
        }

        Arrays.sort(list, new ProductPriceComparator());
        for (Computer c : list) {
            c.displayData();
        }

        Arrays.sort(list, new ProductNameComparator());
        for (Computer c : list) {
            c.displayData();
        }
    }
}
