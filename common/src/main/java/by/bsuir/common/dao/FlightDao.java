package by.bsuir.common.dao;

import by.bsuir.common.model.Flight;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FlightDao extends CrudRepository<Flight, Long> {
    @Query("select fl from Flight fl left join Aviatour av on fl.aviatourId = av.aviatourId where av.aviatourId = :av_id")
    List<Flight> getFlightsForAviatour(long av_id);
}
