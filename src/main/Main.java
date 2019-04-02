package main;

import models.*;
import users.Client;
import service.Service;

import java.util.*;

public class Main {

    public static void main(String[] args) {
         /*
         Event event = createFakeEvent();
         Client client = createFakeCliend(12);
         EventManager eventManager = new EventManager(event);
         client.buyTickets(eventManager, 3);
         System.out.println(client.getMoney());
         */


         Service myService = new Service();
         Event ev = myService.createFakeEvent();

        Ticket ticket = new Ticket(100, 2);
        Ticket ticket1 = new Ticket(107, 8);
        Ticket ticket2 = new Ticket(102, 3);
        Ticket ticket3 = new Ticket(80, 1);

        EventManager eventManager  = new EventManager(ev);
        eventManager.addSpecialTicket(ticket);
        eventManager.addSpecialTicket(ticket1);
        eventManager.addSpecialTicket(ticket2);
        eventManager.addSpecialTicket(ticket3);

        TreeSet<Ticket> treeSet = ev.getSpecialTicketList();
        System.out.println(treeSet.size());
        for(Ticket t : treeSet)
            System.out.println(t.getCost() + " " + t.getSeatNumber());



        Ticket ticket4 = new Ticket(100, 2);
         ticket.changePrice(200);
         ticket.addDiscountByPercent(10);
       // System.out.println(ticket4.getCost());
     }

}
