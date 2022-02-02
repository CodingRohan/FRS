package com.company;


public class RegularTicket extends Ticket {

    private String specialServices;
    private Flight flight;


    public String getSpecialServices() {return specialServices;} public void setSpecialServices(String specialServices) {this.specialServices = specialServices;}




    public void updateSpecialServices(String services){
        this.setSpecialServices(services);

    }
    RegularTicket(String pnr,String from,String to,String departureDateTime,String arrivalDateTime,String seatNo,float price, boolean cancelled , Flight flight, Passenger passenger ){
        super(pnr,from,to,flight,departureDateTime,arrivalDateTime,passenger,seatNo,price,cancelled );
        this.specialServices= null;
    }

}
