package EventManagementSystem;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

class EventManager {
    private Map<String, Event> events;
    private int nextId;

    public EventManager() {
        this.events = new HashMap<>();
        this.nextId = 1;
    }

    public void createEvent(String name, String description, String date) {
        String id = String.valueOf(nextId++);
        Event event = new Event(id, name, description, date);
        events.put(id, event);
        System.out.println("Event created successfully!");
    }

    public void listEvents() {
        if (events.isEmpty()) {
            System.out.println("No events available.");
            return;
        }
        for (Event event : events.values()) {
            System.out.println(event);
            System.out.println("---------------");
        }
    }

    public void readEvent(String id) {
        Event event = events.get(id);
        if (event == null) {
            System.out.println("Event not found.");
            return;
        }
        System.out.println(event);
    }

    public void deleteEvent(String id) {
        if (events.remove(id) != null) {
            System.out.println("Event deleted successfully!");
        } else {
            System.out.println("Event not found.");
        }
    }

    public void addAttendee(String eventId, String attendee) {
        Event event = events.get(eventId);
        if (event == null) {
            System.out.println("Event not found.");
            return;
        }
        event.addAttendee(attendee);
        System.out.println("Attendee added successfully!");
    }

    public void removeAttendee(String eventId, String attendee) {
        Event event = events.get(eventId);
        if (event == null) {
            System.out.println("Event not found.");
            return;
        }
        event.removeAttendee(attendee);
        System.out.println("Attendee removed successfully!");
    }

    public void sendReminder(String eventId) {
        Event event = events.get(eventId);
       if (event == null) {
           System.out.println("Event not found.");
           return;
      }
       System.out.println("Reminder sent for event: " + event.getName());
      // Implement actual notification logic here
    }
}

