package assignment1;

import java.util.List;

public class Event {
    private String eventName;
    private String eventDate;
    private String eventLocation;
    private List<Vip> vipAttendees;

    public Event(String eventName, String eventDate, String eventLocation, List<Vip> vipAttendees) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventLocation = eventLocation;
        this.vipAttendees = vipAttendees;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public List<Vip> getVipAttendees() {
        return vipAttendees;
    }

    public void setVipAttendees(List<Vip> vipAttendees) {
        this.vipAttendees = vipAttendees;
    }
}
