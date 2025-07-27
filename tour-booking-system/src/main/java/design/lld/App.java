package design.lld;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        BookingService service = new BookingService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to Tour Booking System");
        while(true){
            System.out.println("1.SignUp/Register \n2.SignIn");
            System.out.print("\nEnter choice: ");
            int choice = scanner.nextInt();
            switch(choice) {
                case 1:
                service.registerTourist();
                break;
                case 2:
                Tourist loggedInTourist = service.signInTourist();
                    if (loggedInTourist != null) {
                        System.out.println("Welcome back, " + loggedInTourist.getName() + "!\n Your TouristID is: " + loggedInTourist.getId());

                        boolean loggedIn = true;
                        while (loggedIn) {
                            System.out.println("\nTourist Menu");
                            System.out.println("1. Book Tour\n2. View My Booking\n3. Cancel Tour\n4. LogOut");
                            System.out.print("\nEnter choice: ");
                            int innerChoice = scanner.nextInt();
                            scanner.nextLine();

                        switch (innerChoice) {
                            case 1:
                                service.bookTourForTourist(loggedInTourist);
                                break;
                            case 2:
                                service.viewMyBookings(loggedInTourist);
                                break;
                            case 3:
                                service.cancelBooking(loggedInTourist);
                                break;
                            case 4:
                                System.out.println("Logged out successfully.");
                                loggedIn = false;
                                break;
                            default:
                                System.out.println("Invalid option. Try again.");
                            }
                        }
                    } else {
                        System.out.println("Invalid credentials.");
                    }
                    break;
                default: 
                return;
            }
        }
    }
}
