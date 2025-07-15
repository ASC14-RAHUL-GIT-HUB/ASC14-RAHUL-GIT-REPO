package com.demo.lab2.p1;

public class MeetingRoom {
    private String roomId;
    private int capacity;
    private int floor;

    public MeetingRoom(String roomId, int capacity, int floor) {
        this.roomId = roomId;
        this.capacity = capacity;
        this.floor = floor;
    }

    public String getRoomId() {
        return roomId;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getFloor() {
        return floor;
    }

    public String getDetails() {
        return "Room ID: " + roomId + ", Capacity: " + capacity + ", Floor: " + floor;
    }
}

