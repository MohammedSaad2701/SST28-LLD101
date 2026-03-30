package com.bookmyshow;

import java.util.List;

public class Ticket {
    private String id;
    private User user;
    private Show show;
    private List<ShowSeat> seats;
    private double totalAmount;
    private String status;
}