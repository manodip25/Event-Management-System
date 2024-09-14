package EventManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class Event {
    private String id;
    private String name;
    private String description;
    private String date;
    private List<String> attendees;

    public Event(String id, String name, String description, String date) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.date = date;
        this.attendees = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public List<String> getAttendees() {
        return attendees;
    }

    public void addAttendee(String attendee) {
        attendees.add(attendee);
    }

    public void removeAttendee(String attendee) {
        attendees.remove(attendee);
    }

    @Override
    public String toString() {
        return String.format("Event ID: %s, Name: %s, Date: %s\nDescription: %s\nAttendees: %s",
                id, name, date, description, attendees);
    }
}