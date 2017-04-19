package by.bsuir.common.service.impl;

import by.bsuir.common.dao.TicketDao;
import by.bsuir.common.model.Ticket;
import by.bsuir.common.service.ITicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService implements ITicketService {
    @Autowired
    private TicketDao ticketDao;

    @Override
    public Ticket getTicketById(long id) {
        return ticketDao.findOne(id);
    }

    @Override
    public List<Ticket> getTicketsForFlight(long flightId) {
        return ticketDao.getTicketsForFlight(flightId);
    }
}
