package com.company;

public abstract  class Ticket {

    private String seatNo;
    private float price;
    private boolean cancelled;
    private String from;
    private String to;
    private String arrivalDateTime;
    private Passenger passenger;
    private String pnr;
    private Flight flight;
    private String departureDateTime;


    public Ticket(String seatNo, float price, boolean cancelled, String departureDateTime, String arrivalDateTime,String pnr, String from, String to, Flight flight,
                  Passenger passenger) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.flight = flight;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.passenger = passenger;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
    }

    public String getPnr(){ return pnr;}
    public void setPnr(String pnr) {this.pnr = pnr;}

    public String getFrom() {return from;}
    public void setFrom(String from) {this.from = from;}

    public String getTo() {return to;}
    public void setTo(String to) {this.to = to;}

    public Flight getFlight() {return flight;}
    public void setFlight(Flight flight) {this.flight = flight;}

    public String getDepartureDateTime() {return departureDateTime;}
    public void setDepartureDateTime(String departureDateTime) {this.departureDateTime = departureDateTime;}

    public String getArrivalDateTime() {return arrivalDateTime;}
    public void setArrivalDateTime(String arrivalDateTime) {this.arrivalDateTime = arrivalDateTime;}

    public Passenger getPassenger() {return passenger;}
    public void setPassenger(Passenger passenger) {this.passenger = passenger;}

    public String getSeatNo() {return seatNo;}
    public void setSeatNo(String seatNo) {this.seatNo = seatNo;}

    public float getPrice() {return price;}
    public void setPrice(float price) {this.price = price;}

    public boolean isCancelled() {return this.cancelled=false;}
    public void setCancelled(boolean cancelled) {this.cancelled = cancelled;}


}
