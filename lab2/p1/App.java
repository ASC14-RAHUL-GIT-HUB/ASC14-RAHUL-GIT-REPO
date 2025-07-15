package com.demo.lab2.p1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class App {
    public static void main(String[] args) {
        //meeting rooms (2 types)
        MeetingRoom room1 = new MeetingRoom("R01", 10, 1);
        ZoomMeetingRoom room2 = new ZoomMeetingRoom("R02", 8, 2, "ZD001", "ZA001");

        //booking manager
        BookingManager bookingManager = getBookingManager(room1, room2);

        //show bookings by date
        LocalDate searchDate = LocalDate.of(2025, 7, 17);
        List<Booking> bookingsForDate = bookingManager.getBookingsByDate(searchDate);

        System.out.println("Bookings for date: " + searchDate);
        for (Booking booking : bookingsForDate) {
            System.out.println(booking.getBookingDetails());
        }
    }

    private static BookingManager getBookingManager(MeetingRoom room1, ZoomMeetingRoom room2) {
        BookingManager bookingManager = new BookingManager();

        //bookings
        Booking booking1 = new Booking("EMP001", LocalDate.of(2025, 7, 16), LocalTime.of(10, 0), 60, room1);
        Booking booking2 = new Booking("EMP002", LocalDate.of(2025, 7, 17), LocalTime.of(11, 30), 30, room2);
        Booking booking3 = new Booking("EMP003", LocalDate.of(2025, 7, 16), LocalTime.of(9, 0), 45, room1);
        Booking booking4 = new Booking("EMP004", LocalDate.of(2025, 7, 17), LocalTime.of(18, 0), 25, room2);

        //more bookings
        bookingManager.addBooking(booking1);
        bookingManager.addBooking(booking2);
        bookingManager.addBooking(booking3);
        bookingManager.addBooking(booking4);
        return bookingManager;
    }
}

