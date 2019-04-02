package models;


import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.TreeSet;

class SpecialTicketListComparator implements Comparator<Ticket> {
    @Override
    public int compare(Ticket o1, Ticket o2) {
        if ( o1.getCost() == o2.getCost() )
            return (int)(o1.getSeatNumber() - o2.getSeatNumber());
        return (int)(o1.getCost() - o2.getCost());
    }
}

public class Event {
    private Date date;
    private String location;
    private int nrAvailableTickets;
    private String description;
    private EventStar eventStar;
    private List<Ticket> ticketList;
    private TreeSet<Ticket> specialTicketList;

    public TreeSet<Ticket> getSpecialTicketList() {
        return this.specialTicketList;
    }

    public void setSpecialTicketList(TreeSet<Ticket> specialTicketList) {
        this.specialTicketList = specialTicketList;
    }

    public Event() {

    }

    public Event(Date date, String location, int nrAvailableTickets, String description, EventStar eventStar,  List<Ticket> ticketList) {
        this.date = date;
        this.location = location;
        this.nrAvailableTickets = nrAvailableTickets;
        this.description = description;
        this.eventStar = eventStar;
        this.ticketList = ticketList;
        this.specialTicketList = new TreeSet<Ticket>(new SpecialTicketListComparator());
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EventStar getEventStar() {
        return eventStar;
    }

    public void setEventStar(EventStar eventStar) {
        this.eventStar = eventStar;
    }

    public List<Ticket> getTicketList() {
        return ticketList;
    }

    public void setTicketList(List<Ticket> ticketList) {
        this.ticketList = ticketList;
    }

    public int getNrAvailableTickets() {
        return ticketList.size();
    }

    public void setNrAvailableTickets(int nrAvailableTickets) {
        this.nrAvailableTickets = nrAvailableTickets;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
