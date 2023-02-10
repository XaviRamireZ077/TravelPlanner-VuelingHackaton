import java.util.ArrayList;
import java.util.List;

public class AgencyDb {

    private List<Travel> trips = new ArrayList<>();


    public List<Travel> travelBoard() {

        trips.add(new AirTrip("Infinite Egypt", "Air Trip", "4 days", "Barcelona", "Cairo", "القاهرة", "Barcelona 05:15", "Cairo 18:30"));
        trips.add(new AirTrip("Incredible China", "Air Trip", "10 days", "Barcelona", "Beijing", "北京", "Barcelona 05:15", "Beijing 18:30"));
        trips.add(new LandTrip("Europe Popular Capitals", "Land Trip", "3 days", "Paris", "London", "Hotel Best Madrid 3*", "Hotel Worst Paris 4*"));
        trips.add(new LandTrip("Europe laying out cities", "Land Trip", "3 days", "Berlín", "Madrid"," Hotel Best Madrid 3*", "Hotel Worst Berlin 4*"));
        return trips;
    }


    //Method who generates random strings for the trip name
    public String generateTripName() {
        String tripName = "";
        String[] tripNameParts = {"Exotic", "Strange", "Calm", "Crazy", "Beautiful", "Amazing", "Wonderful", "Fantastic", "Unusual", "Unbelievable"};
        int randomIndex = (int) (Math.random() * tripNameParts.length);
        tripName += tripNameParts[randomIndex];
        randomIndex = (int) (Math.random() * tripNameParts.length);
        tripName += " " + tripNameParts[randomIndex];
        randomIndex = (int) (Math.random() * tripNameParts.length);
        tripName += " " + tripNameParts[randomIndex];
        return tripName;
    }

}
