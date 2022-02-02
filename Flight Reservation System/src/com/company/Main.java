package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {


    public static void  printTicketDetails( Ticket  ticket){

        System.out.println(ticket.getPnr());

    }

    public static void main(String[] args) {


        Passenger pa1 = new Passenger(1,"Rohan","Bhardwaj@321","9821579728","Vijay Nagar","Ghaziabad","UP");
        Passenger pa2 = new Passenger(2,"Rajat","Rajat@123","980928922","Mirza park","Jabalpur","MP");

        Flight f1 = new Flight("414141",350,90,"Vistara");
        Flight f2 = new Flight("323232",350,80,"Vistara");

        RegularTicket rgTicket = new RegularTicket("3224","Ghaziabad","Hyderabad","19:00 PM","21:30 PM","B12",3000.80f,false,f1,pa1);

        TouristTicket tTicket = new TouristTicket("3451","Jabalpur","Dehradun","17:00 PM","19:30 AM","C10",4300.30f,false,f2,pa2);



        printTicketDetails(rgTicket);
        printTicketDetails(tTicket);


    }

}