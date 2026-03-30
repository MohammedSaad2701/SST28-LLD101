package com.bookmyshow;

import java.util.ArrayList;
import java.util.List;

public class BookingService {
    private List<Ticket> tickets = new ArrayList<>();

    public Ticket bookTicket(User user, Show show, List<ShowSeat> seats) {
        Ticket ticket = new Ticket();
        tickets.add(ticket);
        return ticket;
    }

    public void cancelBooking(Ticket ticket) {
        tickets.remove(ticket);
    }

    public void makePayment(PaymentGateway paymentGateway, double amount) {
        paymentGateway.pay(amount);
    }
}