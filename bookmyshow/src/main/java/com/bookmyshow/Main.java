package com.bookmyshow;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("BookMyShow app starting...");

        User user = new User();
        Movie movie = new Movie();
        Theatre theatre = new Theatre();
        Show show = new Show();
        List<ShowSeat> seats = new ArrayList<>();

        BookingService bookingService = new BookingService();
        Ticket ticket = bookingService.bookTicket(user, show, seats);

        System.out.println("Created ticket: " + ticket);

        PaymentGateway gateway = new Credit();
        bookingService.makePayment(gateway, 250.0);

        System.out.println("BookMyShow app finished.");
    }
}
