package Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Class to represent a Cab
class Cab {
    private String cabId;
    private String driverName;
    private boolean isAvailable;

    public Cab(String cabId, String driverName, boolean isAvailable) {
        this.cabId = cabId;
        this.driverName = driverName;
        this.isAvailable = isAvailable;
    }

    public String getCabId() {
        return cabId;
    }

    public String getDriverName() {
        return driverName;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Cab ID: " + cabId + ", Driver: " + driverName + ", Available: " + isAvailable;
    }
}

// Class to manage the Cab System
class CabManagementSystem {
    private List<Cab> cabs;

    public CabManagementSystem() {
        cabs = new ArrayList<>();
    }

    public void addCab(Cab cab) {
        cabs.add(cab);
    }

    public void displayAvailableCabs() {
        System.out.println("Available Cabs:");
        for (Cab cab : cabs) {
            if (cab.isAvailable()) {
                System.out.println(cab);
            }
        }
    }

    public void bookCab(String cabId) {
        for (Cab cab : cabs) {
            if (cab.getCabId().equals(cabId) && cab.isAvailable()) {
                cab.setAvailable(false);
                System.out.println("Cab booked successfully: " + cab);
                return;
            }
        }
        System.out.println("Cab not available or not found.");
    }

    public void returnCab(String cabId) {
        for (Cab cab : cabs) {
            if (cab.getCabId().equals(cabId)) {
                cab.setAvailable(true);
                System.out.println("Cab returned successfully: " + cab);
                return;
            }
        }
        System.out.println("Cab not found.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CabManagementSystem system = new CabManagementSystem();

        // Adding some cabs to the system
        system.addCab(new Cab("CAB001", "John Doe", true));
        system.addCab(new Cab("CAB002", "Jane Smith", true));
        system.addCab(new Cab("CAB003", "Emily Johnson", true));

        while (true) {
            System.out.println("\nCab Management System Menu:");
            System.out.println("1. Display Available Cabs");
            System.out.println("2. Book a Cab");
            System.out.println("3. Return a Cab");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    system.displayAvailableCabs();
                    break;
                case 2:
                    System.out.print("Enter Cab ID to book: ");
                    String bookId = scanner.nextLine();
                    system.bookCab(bookId);
                    break;
                case 3:
                    System.out.print("Enter Cab ID to return: ");
                    String returnId = scanner.nextLine();
                    system.returnCab(returnId);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
