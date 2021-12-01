import java.util.*;

public class Ticket {
    private String passengerType;
    private String pnr;
    private String departure;
    private String destination;
    private String flightNo;
    private Date dateOfDeparture = new Date();
    private Date dateOfArrival = new Date();
    private int seatNo;
    private String status;
    private int price;

    public void setTicket(String passengerType, String pnr, String departure, String destination, String flightNo, Date dateOfDeparture, Date dateOfArrival, int seatNo,String status, int price) {
        this.passengerType = passengerType;
        this.pnr = pnr;
        this.departure = departure;
        this.destination = destination;
        this.flightNo = flightNo;
        this.dateOfDeparture = dateOfDeparture;
        this.dateOfArrival = dateOfArrival;
        this.seatNo = seatNo;
        this.status = status;
        this.price = price;
    }

    public String getStatus() {
        return(status);
    }

    public long getDuration() {
        return(Math.abs(dateOfArrival.getTime() - dateOfDeparture.getTime()));
    }

    public void cancelTicket() {
        this.status = "Cancelled";
        System.out.println("Ticket is cancelled");
    }
}
