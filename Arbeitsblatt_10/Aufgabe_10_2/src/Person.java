import java.util.ArrayList;
import java.util.List;

public class Person {
    public String name;
    private String phone;
    private String email;
    private List<Address> addresses;

    public Person(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.addresses = new ArrayList<>();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public List<Address> getAddresses() {
        return addresses;
    }

    public void addAddresses(Address address) {
        addresses.add(address);
    }
    public void removeAddress(Address address) {
        addresses.remove(address);
    }

}
