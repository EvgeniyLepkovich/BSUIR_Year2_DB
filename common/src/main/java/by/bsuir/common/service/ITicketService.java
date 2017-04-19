package by.bsuir.common.service;

import by.bsuir.common.model.Ticket;

import java.util.List;

public interface ITicketService {
    Ticket getTicketById(long id);
    List<Ticket> getTicketsForFlight(long flightId);
}
