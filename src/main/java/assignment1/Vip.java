package assignment1;

import java.util.List;

public class Vip {

    private String vipCode;
    private List<Event> eventsAttended;

    public Vip(String vipCode) {
        this.vipCode = vipCode;
    }


    public String getVipCode() {
        return vipCode;
    }

    public void setVipCode(String vipCode) {
        this.vipCode = vipCode;
    }


    public List<Event> getEventsAttended() {
        return eventsAttended;
    }

    public void setEventsAttended(List<Event> eventsAttended) {
        this.eventsAttended = eventsAttended;
    }
}
