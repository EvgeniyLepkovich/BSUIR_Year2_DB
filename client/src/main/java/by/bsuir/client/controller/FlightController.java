package by.bsuir.client.controller;

import by.bsuir.common.model.Flight;
import by.bsuir.common.service.IFlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlightController {
    @Autowired
    private IFlightService flightService;

    @RequestMapping(value = {"/flight/{id}"}, method = RequestMethod.GET)
    public Flight getFlightById(@PathVariable("id") long id){
        return flightService.getFlightById(id);
    }

    @RequestMapping(value = {"/aviatour_flights/{aviatourId}"})
    public List<Flight> getFlightsForAviatour(@PathVariable("aviatourId") long aviatourId){
        return flightService.getFlightsForAviatour(aviatourId);
    }
}
