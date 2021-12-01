public class TouristTicket extends Ticket {
    private Address hotelAddress = new Address();
    private String touristLocations[] = new String[5];

    public void getTouristLocation() {
        for(int i=0; i<5 && touristLocations[i] != null; i++) {
            System.out.println(touristLocations[i]);
        }
    }

    public void addTouristLocation(String locationName, int location ) {
        this.touristLocations[location] = locationName;
        System.out.println(locationName+" added");
    }

    public void delTouristLocation(int location) {
        System.out.println(touristLocations[location]+" deleted");

        for(int i=location; i<this.touristLocations.length-1; i++) {
            this.touristLocations[i] = this.touristLocations[i+1];
        }
    }
}
