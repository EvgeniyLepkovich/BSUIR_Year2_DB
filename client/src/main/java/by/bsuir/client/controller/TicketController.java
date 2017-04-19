package by.bsuir.client.controller;

import by.bsuir.common.model.Ticket;
import by.bsuir.common.service.ITicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TicketController {
    @Autowired
    private ITicketService ticketService;

    @RequestMapping(value = "/ticket/{id}", method = RequestMethod.GET)
    public Ticket getTicketById(@PathVariable("id") long id){
        return ticketService.getTicketById(id);
    }

    @RequestMapping(value = "/flight_tickets/{flightId}", method = RequestMethod.GET)
    public List<Ticket> getTicketsForFlight(long flightId){
        return ticketService.getTicketsForFlight(flightId);
    }
}
