import java.util.Date;

public class RegularTicket extends Ticket {
    private String foodReq;
    private String waterReq;
    private String snackReq;

    public String getRequests() {
        return("Food Requests: "+foodReq+"\nWater Requests: "+waterReq+"\nSnack Requests: "+snackReq);
    }

    public void setRequests(String foodReq, String waterReq, String snackReq) {
        this.foodReq = foodReq;
        this.waterReq = waterReq;
        this.snackReq = snackReq;
    }
}
