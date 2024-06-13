package BTThay.B1;

public class CustomerManager {
    public static Customer[] customersArray;
    public static int currentCustomerIndex =0;
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.inputData();
        customer.displayData();
    }
}
