package service;
import models.*;
import users.Client;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
public class Service{
    
    public static Event createFakeEvent() { //used for testing
        Calendar today = Calendar.getInstance();
        today.set(Calendar.HOUR_OF_DAY, 0);
        Date day = today.getTime();

        String location = "Bucharest";
        String description = "Revelion 2019";
        EventStar eventStar = new EventStar();
        eventStar.setStar(Stars.MOVIESTAR);
        List<Ticket> ticketList = new ArrayList<Ticket>();
        ticketList.add(new Ticket(12, 1));
        ticketList.add(new Ticket(11, 2));
        ticketList.add(new Ticket(10, 3));
        ticketList.add(new Ticket(12, 4));
        ticketList.add(new Ticket(11, 5));
        ticketList.add(new Ticket(12, 6));
        Event ev = new Event(day, location, 200, description, eventStar, ticketList);
        return ev;
    }
    
    public static Client createFakeClient(int id) {
        double money = 200;
        String name = "Client" + id;
        String cnp = "19906071850" + id + id;

        Client client = new Client(name, cnp, money);
        return client;
    }

    public static void main(String[] args) {
        Event event = createFakeEvent();
        Client client = createFakeClient(12);
        EventManager eventManager = new EventManager(event);
        client.buyTickets(eventManager, 3);
        System.out.println(client.getMoney());
    }

}