package main;

import models.*;
import service.AuditService;
import service.Reader;
import service.Writer;
import users.Client;
import service.Service;

import java.util.*;

public class Main {

    public static String getUsers(){
        String tickets_path = "/home/xnx/java/TicketSeller/data/users.csv";
        String content = "";
        Reader reader = new Reader();
        try {
            content = reader.getFileContent(tickets_path);

        }
        catch (Exception e) {
            System.out.println("File not found");
        }
        return content;
    }

    public static String getConcertTickets() {
        String tickets_path = "/home/xnx/java/TicketSeller/data/concertTickets.csv";
        String content = "";
        Reader reader = new Reader();
        try {
            content = reader.getFileContent(tickets_path);

        }
        catch (Exception e) {
            System.out.println("File not found");
        }
        return content;
    }

    public static String getFootballTickets(){
        String tickets_path = "/home/xnx/java/TicketSeller/data/footballTickets.csv";
        String content = "";
        Reader reader = new Reader();
        try {
            content = reader.getFileContent(tickets_path);

        }
        catch (Exception e) {
            System.out.println("File not found");
        }
        return content;
    }

    public static String getStars(){
        String tickets_path = "/home/xnx/java/TicketSeller/data/stars.csv";
        String content = "";
        Reader reader = new Reader();
        try {
            content = reader.getFileContent(tickets_path);

        }
        catch (Exception e) {
            System.out.println("File not found");
        }
        return content;
    }

    public static void main(String[] args) {

        Service service = new Service();

         Event event = service.createFakeEvent();
         Client client = service.createFakeClient(12);
         EventManager eventManager = new EventManager(event);
         client.buyTickets(eventManager, 3);
         System.out.println(client.getMoney());



         Service myService = new Service();
         Event ev = myService.createFakeEvent();

        Ticket ticket = new Ticket(100, 2);
        Ticket ticket1 = new Ticket(107, 8);
        Ticket ticket2 = new Ticket(102, 3);
        Ticket ticket3 = new Ticket(80, 1);

        EventManager eventManager2  = new EventManager(ev);
        eventManager2.addSpecialTicket(ticket);
        eventManager2.addSpecialTicket(ticket1);
        eventManager2.addSpecialTicket(ticket2);
        eventManager2.addSpecialTicket(ticket3);

        TreeSet<Ticket> treeSet = ev.getSpecialTicketList();
        System.out.println(treeSet.size());
        for(Ticket t : treeSet)
            System.out.println(t.getCost() + " " + t.getSeatNumber());



        Ticket ticket4 = new Ticket(100, 2);
         ticket.changePrice(200);
         ticket.addDiscountByPercent(10);
       // System.out.println(ticket4.getCost());




        String users = getUsers();
        System.out.println("Useri:");
        System.out.println(getUsers());
        System.out.println("Tipuri de staruri:");
        System.out.println(getStars());
        System.out.println("Bilete la concert:");
        System.out.println(getConcertTickets());
        System.out.println("Bilete la fotbal:");
        System.out.println(getFootballTickets());


     }



}
