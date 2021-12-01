public class Flight {
    String flightNo;
    String flightAirline;
    int flightCapacity;
    int bookedSeats;

    Flight(String flightNo, String flightAirline, int flightCapacity, int bookedSeats) {
        this.flightNo = flightNo;
        this.flightAirline = flightAirline;
        this.flightCapacity = flightCapacity;
        this.bookedSeats = bookedSeats;
    }

    public String getFlightDetails() {
        return ("Flight No: "+flightNo+"\nFlight Airline: "+flightAirline+"\nFlight capacity: "+flightCapacity+"\nBooked seats: "+bookedSeats+"\nRemaining seats: "+(flightCapacity-bookedSeats));
    }

    public void bookSeat() {
        bookedSeats++;
        System.out.println("Seat is booked");
    }
}
