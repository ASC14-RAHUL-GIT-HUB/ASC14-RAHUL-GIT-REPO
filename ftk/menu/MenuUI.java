package com.ftk.menu;

import com.ftk.model.FlightModel;
import com.ftk.service.FlightService;
import com.ftk.service.FlightServiceImpl;

import java.util.List;
import java.util.Scanner;

public class MenuUI {

    private final FlightService service = new FlightServiceImpl();

    private final Scanner scanner = new Scanner(System.in);

    public void displayMenu() {

        int choice;
        do {
            System.out.println("Flight Management Menu:");
            System.out.println("1 for - Add Flight");
            System.out.println("2 for - View All Flights");
            System.out.println("3 for - Exit");
            System.out.print("Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addFlight();
                    break;
                case 2:
                    listFlights();
                    break;
            }
        } while (choice != 3);
    }

    private void addFlight() {
        System.out.print("Enter Flight ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Model: ");
        String model = scanner.nextLine();
        System.out.print("Enter Plate Number: ");
        String plate = scanner.nextLine();
        System.out.print("Enter Status (commissioned/decommissioned): ");
        String status = scanner.nextLine();

        FlightModel flight = new FlightModel();
        flight.setFlightId(id);
        flight.setFname(name);
        flight.setFmodel(model);
        flight.setFplatenumber(plate);
        flight.setFstatus(status);

        service.addFlight(flight);
        System.out.println("Flight added successfully.");
    }

    private void listFlights() {
        List<FlightModel> flights = service.getAllFlights();
        if (flights.isEmpty()) {
            System.out.println("No flights found.");
        } else {
            for (FlightModel flight : flights) {
                System.out.println(flight);
            }
        }
    }
}
