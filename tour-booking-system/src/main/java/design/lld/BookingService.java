package design.lld;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.Scanner;

public class BookingService {
    private List<Tourist> tourists = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();
    private File touristFile = new File("tourists.doc");
    private File bookingFile = new File("bookings.doc");

    private void loadTouristsFromFile() {
        try {
            if (touristFile.exists()) {
                FileInputStream fis = new FileInputStream(touristFile);
                ObjectInputStream ois = new ObjectInputStream(fis);
                tourists = (List<Tourist>) ois.readObject();
                ois.close();
                fis.close();
            }
        } catch (Exception e) {}
    }

    private void saveTouristsToFile() {
        try {
            FileOutputStream fos = new FileOutputStream(touristFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(tourists);
            oos.close();
            fos.close();
        } catch (IOException e) {}
    }

    //Signup or Register --> tour booking system
    public void registerTourist() {
        loadTouristsFromFile();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your Email: ");
        String email = scanner.nextLine();

        System.out.print("Create a Password: ");
        String password = scanner.nextLine();

        int newId = tourists.size() + 1;

        Tourist tourist = new Tourist(newId, name, email, password);
        tourists.add(tourist);
        saveTouristsToFile();

        System.out.println("Registration successful! Your Tourist ID is: " + newId);
    }

    //Sign in --> tour booking system
    public Tourist signInTourist() {
        loadTouristsFromFile();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        Optional<Tourist> match = tourists.stream()
            .filter(t -> t.getEmail().equals(email) && t.getPassword().equals(password))
            .findFirst();

        if (match.isPresent()) {
            // Tourist t = match.get();
            // System.out.println("Welcome back, " + t.getName() + "! Your ID is: " + t.getId());
            return match.get();
        } else {
            System.out.println("Invalid credentials. Try again.");
            return null;
        }
    }


    private void readBookingFile() {
    try {
        if (bookingFile.exists()) {
            FileInputStream fis = new FileInputStream(bookingFile);
            ObjectInputStream ois = new ObjectInputStream(fis);
            bookings = (List<Booking>) ois.readObject();
            ois.close();
            fis.close();
        }
        } catch (Exception e) {}
    }

    private void writeBookingFile() {
       try {
            FileOutputStream fos = new FileOutputStream(bookingFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(bookings);
            oos.close();
            fos.close();
        } catch (IOException e) {}
    }
    
    //Book tour - After signin
    public void bookTourForTourist(Tourist tourist) {
    readBookingFile();

    Scanner scanner = new Scanner(System.in);

    String[] tours = { "Manali", "Ooty", "Goa", "Kashmir", "Jaipur" };
    System.out.println("Available Tours:");
    for (int i = 0; i < tours.length; i++) {
        System.out.println((i + 1) + ". " + tours[i]);
    }

    System.out.print("Choose a tour (1-5): ");
    int choice = scanner.nextInt();
    scanner.nextLine();

    if (choice < 1 || choice > 5) {
        System.out.println("Invalid choice.");
        return;
    }

    String selectedTour = tours[choice - 1];

    System.out.print("Enter booking date (YYYY-MM-DD): ");
    String date = scanner.nextLine();

    int bookingId = bookings.size() + 1;
    Booking booking = new Booking(bookingId, tourist.getId(), selectedTour, date);
    bookings.add(booking);
    writeBookingFile();

    System.out.println("Tour booked successfully for " + selectedTour + " on " + date);
}

//view All Booking 
public void viewMyBookings(Tourist tourist) {
    readBookingFile();
    boolean found = false;

    System.out.println("\nYour Bookings");
    for (Booking b : bookings) {
        if (b.getTouristId() == tourist.getId()) {
            System.out.println(b);
            found = true;
        }
    }

    if (!found) {
        System.out.println("No bookings found.");
    }
}

//cancel the Booking 
public void cancelBooking(Tourist tourist) {
    readBookingFile();
    Scanner sc = new Scanner(System.in);

    viewMyBookings(tourist);

    System.out.print("Enter Booking ID to cancel: ");
    int bookingId = sc.nextInt();

    boolean removed = bookings.removeIf(b -> b.getBookingId() == bookingId && b.getTouristId() == tourist.getId());

    if (removed) {
        writeBookingFile();
        System.out.println("Booking cancelled successfully.");
    } else {
        System.out.println("Booking ID not found or unauthorized.");
    }
}


}