public class LandTrip extends Travel {

    private String city1;
    private String city2;
    private String hotel1;
    private String hotel2;

    public LandTrip(String trip_Name, String type_of_trip, String duration, String city1, String city2, String hotel1, String hotel2) {
        super(trip_Name, type_of_trip, duration);
        this.city1 = city1;
        this.city2 = city2;
        this.hotel1 = hotel1;
        this.hotel2 = hotel2;
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

    public String getHotel1() {
        return hotel1;
    }

    public void setHotel1(String hotel1) {
        this.hotel1 = hotel1;
    }

    public String getHotel2() {
        return hotel2;
    }

    public void setHotel2(String hotel2) {
        this.hotel2 = hotel2;
    }

    @Override
    public String toString() {
        return super.getTrip_Name() + "; " + super.getType_of_trip() + "; " + super.getDuration() + "; "
                + city1 + " ," + city2 + "; " + hotel1 + " ," + hotel2;
    }
}
