package by.bsuir.common.dao;

import by.bsuir.common.model.Ticket;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TicketDao extends CrudRepository<Ticket, Long> {
    @Query("Select t from Ticket t left join Flight f on t.flightId = f.flightId where f.flightId = :flightId")
    List<Ticket> getTicketsForFlight(long flightId);
}
