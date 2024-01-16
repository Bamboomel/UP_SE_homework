public class Address {
    private String street;
    private String town;
    private Integer postcode;
    private String country;

    Address(String street, String town, int postcode, String country) {
        this.street = street;
        this.town = town;
        this.postcode = postcode;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean confirmAddress() {
        // validates address
        // code here:

        // placeholder to prevent error message
        return true;
    }
}
