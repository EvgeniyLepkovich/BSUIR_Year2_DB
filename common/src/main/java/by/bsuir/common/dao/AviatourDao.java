package by.bsuir.common.dao;

import by.bsuir.common.model.Aviatour;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AviatourDao extends CrudRepository<Aviatour, Long> {
    @Query("select av from Aviatour av left join aviatourStatus av_s on av.aviatourStatusId = av_s.aviatourStatusId where av_s.aviatourStatusId = 1")
    List<Aviatour> getAccessibleAviatours();
}
