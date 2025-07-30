package com.ftk.service;

import com.ftk.model.FlightModel;
import com.ftk.repo.FlightRepository;
import com.ftk.repo.FlightRepositoryImpl;

import java.util.List;

public class FlightServiceImpl implements FlightService {
    private final FlightRepository frepo = new FlightRepositoryImpl();

    @Override
    public void addFlight(FlightModel flight) {
        frepo.saveFlight(flight);
    }

    @Override
    public List<FlightModel> getAllFlights() {
        return frepo.getAllFlights();
    }
}
