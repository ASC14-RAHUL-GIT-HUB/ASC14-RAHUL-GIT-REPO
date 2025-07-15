package com.demo.lab2.p1;

import java.time.LocalDate;
import java.time.LocalTime;

public class Booking {
    private String employeeId;
    private LocalDate meetingDate;
    private LocalTime meetingTime;
    private int duration; // in minutes
    private MeetingRoom meetingRoom;

    public Booking(String employeeId, LocalDate meetingDate, LocalTime meetingTime, int duration, MeetingRoom meetingRoom) {
        this.employeeId = employeeId;
        this.meetingDate = meetingDate;
        this.meetingTime = meetingTime;
        this.duration = duration;
        this.meetingRoom = meetingRoom;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public LocalDate getMeetingDate() {
        return meetingDate;
    }

    public LocalTime getMeetingTime() {
        return meetingTime;
    }

    public int getDuration() {
        return duration;
    }

    public MeetingRoom getMeetingRoom() {
        return meetingRoom;
    }

    public String getBookingDetails() {
        return "Employee ID: " + employeeId
                + ", Date: " + meetingDate
                + ", Time: " + meetingTime
                + ", Duration: " + duration + " mins"
                + ", Room: " + meetingRoom.getDetails();
    }
}

