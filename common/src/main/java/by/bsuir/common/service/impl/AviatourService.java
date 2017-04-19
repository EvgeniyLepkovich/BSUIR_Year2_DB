package by.bsuir.common.service.impl;

import by.bsuir.common.dao.AviatourDao;
import by.bsuir.common.model.Aviatour;
import by.bsuir.common.service.IAviatourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AviatourService implements IAviatourService {
    @Autowired
    private AviatourDao aviatourDao;

    @Override
    public Aviatour getAviatour(Long id) {
        return aviatourDao.findOne(id);
    }

    @Override
    public List<Aviatour> getAccessibleAviatours() {
        return aviatourDao.getAccessibleAviatours();
    }
}
