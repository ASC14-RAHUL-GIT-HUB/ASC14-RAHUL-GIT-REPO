package com.ftk.repo;

import com.ftk.model.FlightModel;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FlightRepositoryImpl implements FlightRepository {

    private final Connection connection = DbConnectionSingleton.getInstance();

    @Override
    public void saveFlight(FlightModel flight) {

        String sql = "INSERT INTO flights " +
                "(flightId, fname, fmodel, fplatenumber, fstatus)" +
                " VALUES (?, ?, ?, ?, ?)";
        try (
                PreparedStatement ps = connection.prepareStatement(sql)
        ) {
            ps.setString(1, flight.getFlightId());
            ps.setString(2, flight.getFname());
            ps.setString(3, flight.getFmodel());
            ps.setString(4, flight.getFplatenumber());
            ps.setString(5, flight.getFstatus());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<FlightModel> getAllFlights() {
        List<FlightModel> flights = new ArrayList<>();
        String sql = "SELECT * FROM flights";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next())
            {
                FlightModel flight = new FlightModel(
                        rs.getString("flightId"),
                        rs.getString("fname"),
                        rs.getString("fmodel"),
                        rs.getString("fplatenumber"),
                        rs.getString("fstatus")
                );
                flights.add(flight);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return flights;
    }
}
