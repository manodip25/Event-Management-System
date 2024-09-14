package EventManagementSystem;

import java.util.Scanner;
import java.util.*;

public class EventManagementSystem {
    public static void main(String[] args) {
        EventManager manager = new EventManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Create Event");
            System.out.println("2. List Events");
            System.out.println("3. Read Event");
            System.out.println("4. Delete Event");
            System.out.println("5. Add Attendee");
            System.out.println("6. Remove Attendee");
            System.out.println("7. Send Reminder");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter event name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter event description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter event date (YYYY-MM-DD): ");
                    String date = scanner.nextLine();
                    manager.createEvent(name, description, date);
                    break;
                case 2:
                    manager.listEvents();
                    break;
                case 3:
                    System.out.print("Enter event ID to read: ");
                    String readId = scanner.nextLine();
                    manager.readEvent(readId);
                    break;
                case 4:
                    System.out.print("Enter event ID to delete: ");
                    String deleteId = scanner.nextLine();
                    manager.deleteEvent(deleteId);
                    break;
                case 5:
                    System.out.print("Enter event ID to add attendee: ");
                    String eventIdToAdd = scanner.nextLine();
                    System.out.print("Enter attendee name: ");
                    String attendeeToAdd = scanner.nextLine();
                    manager.addAttendee(eventIdToAdd, attendeeToAdd);
                    break;
                case 6:
                    System.out.print("Enter event ID to remove attendee: ");
                    String eventIdToRemove = scanner.nextLine();
                    System.out.print("Enter attendee name: ");
                    String attendeeToRemove = scanner.nextLine();
                    manager.removeAttendee(eventIdToRemove, attendeeToRemove);
                    break;
                case 7:
                    System.out.print("Enter event ID to send reminder: ");
                    String eventIdToRemind = scanner.nextLine();
                    manager.sendReminder(eventIdToRemind);
                    break;
                case 8:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}