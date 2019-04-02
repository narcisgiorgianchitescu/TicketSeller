package users;

import models.EventManager;
import models.Ticket;

import java.util.ArrayList;
import java.util.List;

public class Client extends User {
    private int nrTickets;
    private List<Ticket> ticketList;
    private Double money;

    public Client(String nm, String cnp, Double money) {
        super(nm, cnp);
        nrTickets = 0;
        ticketList = new ArrayList<Ticket>();
        this.money = money;
    }

    public void buyTicket(EventManager eventManager) {
        eventManager.buyTicket(this);
    }

    public void buyTickets(EventManager eventManager, int nrTickets) {
        eventManager.buyTickets(this, nrTickets);
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public List<Ticket> getTicketList() {
        return ticketList;
    }
}
