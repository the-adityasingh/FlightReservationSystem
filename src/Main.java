import java.util.*;

public class Main {
    public static void main(String[] args) {
        Address addr1 = new Address();
        addr1.setAddress("23", "Gorakhpur", "Uttar Pradesh");
        System.out.println(addr1.getAddress());

        Contact c1 = new Contact();
        c1.setContact("Aditya Singh", "7785044423", "theadityasingh1@gmail.com");
        System.out.println(c1.getContact());

        Flight f1 = new Flight("23512", "Air India", 80, 23);
        System.out.println(f1.getFlightDetails());

        Passenger p1 = new Passenger();
        p1.passengerAddress.setAddress("12", "Lucknow", "Uttar Pradesh");
        p1.passengerContact.setContact("Alok", "8975303923", "alok@gmail.com");
        System.out.println(p1.passengerAddress.getAddress());
        System.out.println(p1.passengerContact.getContact());
    }
}
