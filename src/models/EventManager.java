package models;

import users.Client;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TreeSet;

public class EventManager {
    private Event event;

    public EventManager(Event event) {
        this.event = event;
    }

    public void changeDate(Date date) {
        this.event.setDate(date);
    }

    public void changeLocation(String location) {
        this.event.setLocation(location);
    }

    public void addTickets(List<Ticket> ticketList) {
        this.event.getTicketList().addAll(ticketList);
    }

    public void addSpecialTickets(TreeSet<Ticket> specialTicketList) {
        this.event.getSpecialTicketList().addAll(specialTicketList);
    }

    public void addSpecialTicket(Ticket ticket) {
        this.event.getSpecialTicketList().add(ticket);
    }

    public void removeTickets(List<Ticket> ticketList) {
        this.event.getTicketList().removeAll(ticketList);
    }

    public void removeTicket(Ticket t) {
        this.event.getTicketList().remove(t);
    }

    public int getNrAvailableTickets() {
        return this.event.getNrAvailableTickets();
    }

    public void buyTicket(Client client) {
        for (Ticket ticket : this.event.getTicketList()) {
            if (ticket.getCost() <= client.getMoney()) {
                removeTicket(ticket);
                client.getTicketList().add(ticket);
                client.setMoney(client.getMoney() - ticket.getCost());
                return;
            }
        }
    }

    public void buyTickets(Client client, int n) {
        List<Ticket> ticketList = new ArrayList<Ticket>();
        int nrBought = 0;
        for (Ticket ticket : this.event.getTicketList()) {
            if (ticket.getCost() <= client.getMoney() && n >= 1) {
                ticketList.add(ticket);
                n--;
                client.setMoney(client.getMoney() - ticket.getCost());
            }
        }
        client.getTicketList().addAll(ticketList);
        removeTickets(ticketList);
    }

}
