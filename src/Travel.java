import java.util.Objects;

public class Travel {
    private String Trip_Name;
    private String Type_of_trip;
    private String Duration;

    public Travel(String trip_Name, String type_of_trip, String duration) {
        Trip_Name = trip_Name;
        Type_of_trip = type_of_trip;
        Duration = duration;
    }

    public String getTrip_Name() {
        return Trip_Name;
    }

    public void setTrip_Name(String trip_Name) {
        Trip_Name = trip_Name;
    }

    public String getType_of_trip() {
        return Type_of_trip;
    }

    public void setType_of_trip(String type_of_trip) {
        Type_of_trip = type_of_trip;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Travel travel = (Travel) o;
        return Trip_Name.equals(travel.Trip_Name) && Type_of_trip.equals(travel.Type_of_trip) && Duration.equals(travel.Duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Trip_Name);
    }
}
