package com.ftk.repo;

import com.ftk.model.FlightModel;
import java.util.List;

public interface FlightRepository {

    void saveFlight(FlightModel flight);

    List<FlightModel> getAllFlights();

}
