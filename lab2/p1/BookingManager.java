package com.demo.lab2.p1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private List<Booking> bookings;

    public BookingManager() {
        bookings = new ArrayList<>();
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public List<Booking> getBookingsByDate(LocalDate date) {
        List<Booking> result = new ArrayList<>();
        for (Booking booking : bookings) {
            if (booking.getMeetingDate().equals(date)) {
                result.add(booking);
            }
        }
        return result;
    }
}

