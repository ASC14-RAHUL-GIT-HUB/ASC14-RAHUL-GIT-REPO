package com.ftk.model;

public class FlightModel {
    private String flightId;
    private String fname;
    private String fmodel;
    private String fplatenumber;
    private String fstatus;

    public FlightModel() { }

    public FlightModel(
            String flightId, String fname, String fmodel,
            String fplatenumber, String fstatus
    ) {
        this.flightId = flightId;
        this.fname = fname;
        this.fmodel = fmodel;
        this.fplatenumber = fplatenumber;
        this.fstatus = fstatus;
    }

    public String getFlightId() {
        return flightId;
    }
    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFmodel() {
        return fmodel;
    }
    public void setFmodel(String fmodel) {
        this.fmodel = fmodel;
    }

    public String getFplatenumber() {
        return fplatenumber;
    }
    public void setFplatenumber(String fplatenumber) {
        this.fplatenumber = fplatenumber;
    }

    public String getFstatus() {
        return fstatus;
    }
    public void setFstatus(String fstatus) {
        this.fstatus = fstatus;
    }

    @Override
    public String toString() {
        return flightId +
                " - " + fname +
                " - " + fmodel +
                " - " + fplatenumber +
                " - " + fstatus;
    }
}
