package by.bsuir.common.service;

import by.bsuir.common.model.Aviatour;

import java.util.List;

public interface IAviatourService {
    Aviatour getAviatour(Long id);
    List<Aviatour> getAccessibleAviatours();
}
