public class Address {
    private String street;
    private String city;
    private String state;

    public String getAddress() {
        return ("Street: "+street+"\nCity: "+city+"\nState: "+state);
    }

    public void setAddress(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }
}