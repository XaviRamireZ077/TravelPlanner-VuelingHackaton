public class AirTrip extends Travel {
    private String city1;
    private String city2;
    private String city3;
    private String flight1;
    private String flight2;

    public AirTrip(String trip_Name, String type_of_trip, String duration, String city1, String city2, String city3, String flight1, String flight2) {
        super(trip_Name, type_of_trip, duration);
        this.city1 = city1;
        this.city2 = city2;
        this.city3 = city3;
        this.flight1 = flight1;
        this.flight2 = flight2;
    }

    public String getCity1() {
        return city1;
    }

    public void setCity1(String city1) {
        this.city1 = city1;
    }

    public String getCity2() {
        return city2;
    }

    public void setCity2(String city2) {
        this.city2 = city2;
    }

    public String getCity3() {
        return city3;
    }

    public void setCity3(String city3) {
        this.city3 = city3;
    }

    public String getFlight1() {
        return flight1;
    }

    public void setFlight1(String flight1) {
        this.flight1 = flight1;
    }

    public String getFlight2() {
        return flight2;
    }

    public void setFlight2(String flight2) {
        this.flight2 = flight2;
    }

    @Override
    public String toString() {
        return super.getTrip_Name() + "; " + super.getType_of_trip() + "; " + super.getDuration() + "; "
                + city1 + " ," + city2 + " ," + city3 + " ;" + flight1 + " ," + flight2;
    }
}
