package BTThay.B1;

import java.sql.Date;
import java.util.Scanner;

public class Customer extends ICustomer {
    private String id;
    private String name;
    private boolean gender;
    private Date birthday;
    private String address;
    private String email;
    private String phone;

    public Customer(){}

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
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Custom");
        int numberOfSongs = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numberOfSongs; i++) {
            Main.customersArray[i] = new Customer();
//            MusicManagement.songsArray[MusicManagement.currentSongIndex].inputData(sc);
//            MusicManagement.currentSongIndex++;
        }
    }
}
