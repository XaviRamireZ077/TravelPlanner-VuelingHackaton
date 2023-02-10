import java.util.List;
import java.util.Scanner;

public class Main {

    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String option;

        //create an instance of AgencyDb and get the list of trips from it and store it in a variable called trips
        AgencyDb agencyDb = new AgencyDb();
        List<Travel> trips = agencyDb.travelBoard();

        //menu to display the options to the user
        do {
            System.out.println("Welcome to the travel agency");
            System.out.println("1. List all trips");
            System.out.println("2. Search for a trip");
            System.out.println("3. Exit");
            System.out.println("Please enter your option: ");
            option = scanner.nextLine();
            switch (option) {
                case "1":
                    //display all the trips in the list of trips
                    for (Travel trip : trips) {
                        System.out.println(trip);
                    }
                    break;
                case "2":
                    //search for a trip by name
                    System.out.println("Please enter the name of the trip you are looking for: ");
                    String tripName = scanner.nextLine();
                    searchForTrip(trips, tripName);
                    break;
                case "3":
                    System.out.println("Thank you for using our services");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while (!option.equals("3"));
    }

        //Method to search for a trip who contains a given string input by the user
        public static void searchForTrip (List < Travel > trips, String tripName){
            for (Travel trip : trips) {
                if (trip.getTrip_Name().toLowerCase().contains(tripName)) {
                    System.out.println(trip);
                }
            }
    //Close the scanner
        scanner.close();
    //Close the program
        System.exit(0);
}

}

