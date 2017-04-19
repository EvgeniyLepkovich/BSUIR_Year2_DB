package by.bsuir.common.dao;

import by.bsuir.common.model.Aircraft;
import org.springframework.data.repository.CrudRepository;

public interface AircraftDao extends CrudRepository<Aircraft, Long> {
}
