package by.bsuir.common.service.impl;

import by.bsuir.common.dao.AircraftDao;
import by.bsuir.common.model.Aircraft;
import by.bsuir.common.service.IAircraftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AircraftService implements IAircraftService {
    @Autowired
    private AircraftDao aircraftDao;

    @Override
    public Aircraft getAircraftById(long id) {
        return aircraftDao.findOne(id);
    }
}
