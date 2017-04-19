package by.bsuir.common.service;


import by.bsuir.common.model.Flight;

import java.util.List;

public interface IFlightService {
    Flight getFlightById(long id);
    List<Flight> getFlightsForAviatour(long aviatourId);
}
