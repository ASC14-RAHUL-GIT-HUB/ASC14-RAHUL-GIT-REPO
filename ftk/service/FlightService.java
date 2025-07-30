package com.ftk.service;

import com.ftk.model.FlightModel;
import java.util.List;

public interface FlightService {

    void addFlight(FlightModel flight);

    List<FlightModel> getAllFlights();

}
