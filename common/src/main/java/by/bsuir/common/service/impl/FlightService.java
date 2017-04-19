package by.bsuir.common.service.impl;

import by.bsuir.common.dao.FlightDao;
import by.bsuir.common.model.Flight;
import by.bsuir.common.service.IFlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService implements IFlightService {
    @Autowired
    private FlightDao flightDao;

    @Override
    public Flight getFlightById(long id) {
        return flightDao.findOne(id);
    }

    @Override
    public List<Flight> getFlightsForAviatour(long aviatourId) {
        return flightDao.getFlightsForAviatour(aviatourId);
    }
}
